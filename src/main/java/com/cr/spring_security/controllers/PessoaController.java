package com.cr.spring_security.controllers;

import com.cr.spring_security.models.PessoaModel;
import com.cr.spring_security.models.PessoaModel;
import com.cr.spring_security.services.PessoaService;
import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;
import java.util.Optional;

@RestController//Identifica a classe como um controlador Rest
@RequestMapping("/pessoas")// Cria endpoint para fazer pesquisas.
public class PessoaController {

    @Autowired// Injeta dependencias
    private PessoaService pessoaService;

    @PostMapping// Identifica que aquele metodo cria uma pessoa
    public ResponseEntity<PessoaModel> create(@RequestBody/*Fala que a requisição passa pelo corpo*/
                                                          PessoaModel model) {
        PessoaModel request = pessoaService.create(model);
        URI uri = ServletUriComponentsBuilder.fromCurrentRequest()
                .path("/{id}").buildAndExpand(model.getId()).toUri();

        return ResponseEntity.created(uri).body(request);
    }

    @GetMapping// Identifica que será feito uma busca
    public ResponseEntity<List<PessoaModel>> findAll() {
        List<PessoaModel> request = pessoaService.findAll();
        return ResponseEntity.ok().body(request);
    }

    @GetMapping("/{id}")// Identifica que será feita uma busca pelo ID
    public ResponseEntity<PessoaModel> findById(@PathVariable
                                                    Long id) {
        PessoaModel request = pessoaService.findById(id);
        return ResponseEntity.ok().body(request);
    }

    @PutMapping("/{id}")
    public ResponseEntity<PessoaModel> updatePessoa(@PathVariable Long id, @RequestBody PessoaModel pessoaModel){
        PessoaModel request = pessoaService.update(id, pessoaModel);
        return ResponseEntity.ok().body(request);
    }
}

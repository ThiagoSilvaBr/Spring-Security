package com.cr.spring_security.controllers;

import com.cr.spring_security.models.PessoaModel;
import com.cr.spring_security.models.PessoaModel;
import com.cr.spring_security.services.PessoaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/pessoas")
public class PessoaController {

    @Autowired
    private PessoaService pessoaService;

    @PostMapping
    public ResponseEntity<PessoaModel> create(@RequestBody PessoaModel model) {
        PessoaModel request = pessoaService.create(model);
        URI uri = ServletUriComponentsBuilder.fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(request.getId()).toUri();
        return ResponseEntity.created(uri).body(request);
    }

    @GetMapping
    public ResponseEntity<List<PessoaModel>> findAll() {
        List<PessoaModel> request = pessoaService.findAll();
        return ResponseEntity.ok().body(request);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Optional<PessoaModel>> findById(@PathVariable Long id) {
        Optional<PessoaModel> request = pessoaService.findById(id);
        if(request.isPresent()) {
            return ResponseEntity.ok().body(request);
        }
        return ResponseEntity.notFound().build();
    }

}

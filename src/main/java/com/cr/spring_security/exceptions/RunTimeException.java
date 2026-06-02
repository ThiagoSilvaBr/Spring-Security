package com.cr.spring_security.services;

import com.cr.spring_security.exceptions.RunTimeException;
import com.cr.spring_security.models.PessoaModel;
import com.cr.spring_security.repositories.PessoaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service// Identifica a classe como um service(Regra de negócio)
public class PessoaService {

    @Autowired// injeta as dependencias
    private PessoaRepository pessoaRepository;

    public PessoaModel create(PessoaModel pessoamodel) {
        return pessoaRepository.save(pessoamodel);
    }

    public List<PessoaModel> findAll() {
        return pessoaRepository.findAll();
    }

    public PessoaModel findById(Long id) {
        return pessoaRepository.findById(id)
                .orElseThrow(() -> new RunTimeException("Não foi possivel encontrar o Id:" + id));
    }

    public PessoaModel update(Long id, PessoaModel pessoaModel){
        PessoaModel pessoa = findById(id);
        pessoa.setNome(pessoaModel.getNome());

        return pessoaRepository.save(pessoa);
    }

}

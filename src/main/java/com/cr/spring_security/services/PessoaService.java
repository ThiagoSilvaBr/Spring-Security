package com.cr.spring_security.services;

import com.cr.spring_security.models.PessoaModel;
import com.cr.spring_security.repositories.PessoaRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

@org.springframework.stereotype.Service
public class PessoaService {

    @Autowired
    private PessoaRepository pessoaRepository;

    public PessoaModel create(PessoaModel pessoamodel) {
        return pessoaRepository.save(pessoamodel);
    }

    public List<PessoaModel> findAll() {
        return pessoaRepository.findAll();
    }

    public Optional<PessoaModel> findById(Long id) {
        return pessoaRepository.findById(id);
    }

}

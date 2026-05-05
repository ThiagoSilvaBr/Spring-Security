package com.cr.spring_security.services;

import com.cr.spring_security.models.Pessoa;
import com.cr.spring_security.repositories.PessoaRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

@org.springframework.stereotype.Service
public class PessoaService {

    @Autowired
    private PessoaRepository repository;

    public PessoaMoPessoadel create(Pessoa model) {
        return repository.save(model);
    }

    public List<Pessoa> findAll() {
        return repository.findAll();
    }

    public Optional<Pessoa> findById(Long id) {
        return repository.findById(id);
    }

}

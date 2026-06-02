package com.cr.spring_security.services;

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

    public Optional<PessoaModel> findById(Long id) {
        return pessoaRepository.findById(id);
    }

}

package com.cr.spring_security.repositories;

import com.cr.spring_security.models.PessoaModel;
import org.springframework.data.jpa.repository.JpaRepository;
//Extend o repositorio JPA que contem os metodos
public interface PessoaRepository extends JpaRepository<PessoaModel, Long> {
}

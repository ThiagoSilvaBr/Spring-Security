package com.cr.spring_security.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "tb_pessoas")
@Data
public class PessoaModel {

    @Id
    @GeneratedValue
    private Long id;
    private String nome;
    @OneToMany
    private List<JobModel> trabalhosList = new ArrayList<>();

}

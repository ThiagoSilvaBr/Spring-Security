package com.cr.spring_security.models;

import jakarta.persistence.*;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "tb_pessoas")
@Data
public class PessoaModel {

    @Id
    @GeneratedValue
    private Long id;
    private String nome;
    @OneToMany // Fala que a classe pode receber diferentes tipos de relacionamento de uma classe
    private List<JobModel> trabalhosList = new ArrayList<>();

}

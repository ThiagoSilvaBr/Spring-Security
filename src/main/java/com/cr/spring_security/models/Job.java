package com.cr.spring_security.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity //Identifica que a classe é uma entidade
//ou colocar @Data (nao precisa de construtor nem getter ou setterrs)
public class JobModel {

    @Id//identifica que é um ID
    @GeneratedValue(strategy = GenerationType.IDENTITY)// gera automaticamente os Id
    private Long id;
    private String nome;
    private String endereco;

    public JobModel() {
    }

    public Long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
}

package com.example.demo.model;

import jakarta.persistence.*;

@Entity
@Table(name="cidadao")
public class Cidadao {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id_cidadao;

    private String nome;

    private String cpf;

    private String endereco;

    private String sexo;

    public Long getId_cidadao() {
        return id_cidadao;
    }

    public void setId_cidadao(Long id_cidadao) {
        this.id_cidadao = id_cidadao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
}

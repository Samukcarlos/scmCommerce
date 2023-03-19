package com.scm.scmcommerce.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "tb_atividades") //Personalisando o nome da tabela no H2

public class Atividade {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // para qie id seja auto incrementada


    private Integer id;
    private String nome;
    private Double preco;
    @ManyToOne
    @JoinColumn(name = "categoria_id") // relacionamento muitos para um
    private Categoria categoria;


    public Atividade(){

    }

    public Atividade(Integer id, String nome, Double preco) {
        this.id = id;
        this.nome = nome;
        this.preco = preco;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }
}

package com.scm.scmcommerce.entities;

import jakarta.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "tb_atividades") //Personalisando o nome da tabela no H2

public class Atividade {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // para qie id seja auto incrementada


    private Integer id;
    private String nome;
    private Double preco;
    private Participante participante;

    @ManyToMany(mappedBy = "atividades") // Relação muitos para muitos
    private Set<Bloco> blocos = new HashSet<>();// No caso de muitos para muitos para que não haja repetição
    // de id, precisamos informar isso para o JPA usando "Set" ao invés de List
    @ManyToOne // mapeando muitos para um no banco de dados.
    @JoinColumn(name = "categoria_id") // inclui um campo na tabela orde com o nome da chave estrangeira client_id (lado do "munitos")


    @ManyToMany(mappedBy = "atividades") // Relação muitos para muitos
    private Set<Participante> participantes = new HashSet<>();// No caso de muitos para muitos para que não haja repetição
    // de id, precisamos informar isso para o JPA usando "Set" ao invés de List


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

    public Set<Bloco> getBlocos() {
        return blocos;
    }

    public Set<Participante> getParticipantes() {
        return participantes;
    }
}


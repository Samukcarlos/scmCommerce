package com.scm.scmcommerce.entities;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Table(name ="tb_participantes") //Personalisando o nome da tabela no H2
public class Participante {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // para qie id seja auto incrementada

    @ManyToMany(mappedBy = "participantes") // Relação muitos para muitos
    private Set<Atividade> atividades = new HashSet<>();// No caso de muitos para muitos para que não haja repetição
    // de id, precisamos informar isso para o JPA usando "Set" ao invés de List


    private Integer id;
    private String nome;
    private String email;


    private Participante(){

    }

    public Participante(Integer id, String nome, String email) {
        this.id = id;
        this.nome = nome;
        this.email = email;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Set<Atividade> getAtividades() {
        return atividades;
    }
}

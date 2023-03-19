package com.scm.scmcommerce.entities;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "tb_categoria") //Personalisando o nome da tabela no H2

public class Categoria {
@Id
 @GeneratedValue(strategy = GenerationType.IDENTITY) // para qie id seja auto incrementada
   Integer id;
   String descricao;
    @OneToMany(mappedBy = "categoria") // mapeamento muitos para um. inclui na tabela Order um campo na chave estrangeira
    private List<Atividade> atividades = new ArrayList<>(); // lado do "um para muintos" como são muitos precisa de uma lista.
    // na classe User tenho uma lista de orders.
   public Categoria(){

   }

    public Categoria(Integer id, String descricao) {
        this.id = id;
        this.descricao = descricao;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public List<Atividade> getAtividades() { // para conseguir acessar a lista de atividades do relacionamento muitos para um
        return atividades;
    }
}

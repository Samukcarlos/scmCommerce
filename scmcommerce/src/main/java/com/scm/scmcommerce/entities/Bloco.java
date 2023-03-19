package com.scm.scmcommerce.entities;

import jakarta.persistence.*;

import java.time.Instant;
@Entity // para que minha entiti possa ser mapeada em uma tabela no Banco de Dados H2
@Table(name = "tb_bloco") // para personalizar o nome da tabelo no Banco de Dados H2
public class Bloco {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;
    @Column(columnDefinition = "TIMESTAMP WITHOUT TIME ZONE")// para que seja salvo no banco de dados no padrão utc, depois convertemos para o horário local
    Instant inicio;
    @Column(columnDefinition = "TIMESTAMP WITHOUT TIME ZONE")// para que seja salvo no banco de dados no padrão utc, depois convertemos para o horário local
    Instant fim;

public Bloco(){

}

    public Bloco(Integer id, Instant inicio, Instant fim) {
        this.id = id;
        this.inicio = inicio;
        this.fim = fim;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Instant getInicio() {
        return inicio;
    }

    public void setInicio(Instant inicio) {
        this.inicio = inicio;
    }

    public Instant getFim() {
        return fim;
    }

    public void setFim(Instant fim) {
        this.fim = fim;
    }
}

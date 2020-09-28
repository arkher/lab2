package com.paulo.myapplication.entidades;

import javax.persistence.*;

/**
 * Mercadorias
 */

@Entity
@Table(name="mercadorias",schema="public")

public class Mercadorias {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="codigo")
    private Long codigo;

    @Column(name="descricao")
    private String descricao;

    //Construtor
    public Mercadorias(){}

    //Gets e Sets
    public Long getCodigo() {
        return this.codigo;
    }

    public void setCodigo(Long codigo) {
        this.codigo = codigo;
    }

    public String getDescricao() {
        return this.descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

}
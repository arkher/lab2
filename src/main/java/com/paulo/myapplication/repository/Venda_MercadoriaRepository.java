package com.paulo.myapplication.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.paulo.myapplication.entidades.Venda_mercadoria;

public interface Venda_MercadoriaRepository extends JpaRepository <Venda_mercadoria, Long> {
    
}

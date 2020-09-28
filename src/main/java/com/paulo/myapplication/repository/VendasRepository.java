package com.paulo.myapplication.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.paulo.myapplication.entidades.Vendas;

public interface VendasRepository extends JpaRepository <Vendas, Long>{
    
}

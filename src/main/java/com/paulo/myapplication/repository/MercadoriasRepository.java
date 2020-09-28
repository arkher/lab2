package com.paulo.myapplication.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.paulo.myapplication.entidades.Mercadorias;

public interface MercadoriasRepository extends JpaRepository <Mercadorias,Long> {

}

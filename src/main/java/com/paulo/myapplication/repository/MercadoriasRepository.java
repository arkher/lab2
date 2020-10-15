package com.paulo.myapplication.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.paulo.myapplication.entidades.Mercadorias;

import java.util.Optional;

public interface MercadoriasRepository extends JpaRepository <Mercadorias,Long> {
    Optional<Mercadorias> findById(Long id);
}

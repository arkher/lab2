package com.paulo.myapplication;

import com.paulo.myapplication.entidades.Mercadorias;
import com.paulo.myapplication.repository.MercadoriasRepository;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit.jupiter.SpringExtension;


@ExtendWith(SpringExtension.class) //para usar o contexto padrão do springboot
@SpringBootTest
@ActiveProfiles("Test")
public class MercadoriasRepositoryTest {
    @Autowired
    MercadoriasRepository repository;

    @Test
    public void verificaSalvaMercadoria(){
        int i = 1;
        Long l = Long.valueOf(i);
        Mercadorias mercadoria = Mercadorias.builder().codigo(l).descricao("El produtito").build();

        Mercadorias salvo = repository.save(mercadoria);

        // Asserções
        Assertions.assertNotNull(salvo);
        Assertions.assertEquals(mercadoria.getCodigo(), salvo.getCodigo());
        Assertions.assertEquals(mercadoria.getDescricao(), salvo.getDescricao());
    }
}
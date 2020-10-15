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


@ExtendWith(SpringExtension.class)
@SpringBootTest
@ActiveProfiles("Test")
public class MercadoriasRepositoryTest {
    @Autowired
    MercadoriasRepository repository;

    @Test
    public void verificaSalvaMercadoria(){
        Mercadorias mercadoria = Mercadorias.builder().descricao("Produto bom").build();

        Mercadorias salvo = repository.save(mercadoria);

        //Verificação
        Assertions.assertNotNull(salvo);
        Assertions.assertEquals(mercadoria.getCodigo(), salvo.getCodigo());
        Assertions.assertEquals(mercadoria.getDescricao(), salvo.getDescricao());
    }
}
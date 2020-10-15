package com.paulo.myapplication;

import java.time.LocalDate;

import com.paulo.myapplication.entidades.Vendas;
import com.paulo.myapplication.repository.VendasRepository;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ExtendWith(SpringExtension.class) //para usar o contexto padrão do springboot
@SpringBootTest
@ActiveProfiles("Teste")
public class VendasRepositoryTest {
    
    @Autowired
    VendasRepository repository;
    LocalDate localdate = LocalDate.now();

    @Test
    public void verificaSalvaVenda(){
        LocalDate date = LocalDate.now();
        Vendas venda = Vendas.builder().data_venda(date).build();

        //Ação
        Vendas salvo = repository.save(venda);

        //Verificação
        Assertions.assertNotNull(salvo);
        Assertions.assertEquals(venda.getNumeroVenda(), salvo.getNumeroVenda());
        Assertions.assertEquals(venda.getData_venda(), salvo.getData_venda());
    }
    @Test
    public void verificaSeSalvaVendaSemData(){
        Vendas venda = Vendas.builder().build();

        Vendas salvo = repository.save(venda);

        // asserções
        Assertions.assertNotNull(salvo);
        Assertions.assertEquals(venda.getNumeroVenda(), salvo.getNumeroVenda());
        Assertions.assertEquals(venda.getData_venda(), salvo.getData_venda());
    }
}
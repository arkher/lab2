package com.paulo.myapplication.services;

import java.util.ArrayList;
import java.util.List;

import com.paulo.myapplication.entidades.Vendas;
import com.paulo.myapplication.repository.VendasRepository;
import com.paulo.myapplication.services.exceptions.RegraNegocioRunTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class VendasService {

    @Autowired
    VendasRepository repository;

    @Transactional
    public Vendas salvar(Vendas venda){
        verificarVenda(venda);
        return repository.save(venda);
    }
    public List<Vendas> listarVendas(){
        var found = repository.findAll();

        var vendalist = new ArrayList<Vendas>();

        found.forEach(e -> vendalist.add(e));
        vendalist.forEach(e->verificarId(e));
        return vendalist;
    }

    private void verificarId(Vendas venda){
        if((venda == null) || venda.getNumeroVenda() == null)
            throw new RegraNegocioRunTime("Venda inválida");
    }

    private void verificarVenda(Vendas venda){
        if(venda == null)
            throw new RegraNegocioRunTime("Venda inválida");
        if(venda.getData_venda() == null)
            throw new RegraNegocioRunTime("A data da venda deve ser informada");
    }
    
}

package com.algaworks.awpag.api.controle;

import com.algaworks.awpag.domain.mode.Cliente;
import jakarta.persistence.Entity;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;



@RestController
public class ClienteControle {

    @PersistenceContext
    private EntityManager manager;

    @GetMapping("/clientes")
    public List<Cliente> Listar(){


        return manager.createQuery("from Cliente",Cliente.class).getResultList();

    }
}

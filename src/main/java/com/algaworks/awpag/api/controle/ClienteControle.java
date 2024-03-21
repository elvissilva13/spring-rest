package com.algaworks.awpag.api.controle;

import com.algaworks.awpag.domain.mode.Cliente;
import com.algaworks.awpag.doman.repository.ClienteRepository;
import jakarta.persistence.Entity;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;


@AllArgsConstructor
@RestController
public class ClienteControle {
   // @Autowired
    private final ClienteRepository clienteRepository;




    @GetMapping("/clientes")
    public List<Cliente> Listar(){
        // return clienteRepository.findAll(); pesquisa tudo no banco de dados
        //return  clienteRepository.findByNome("elvis");pesquisa exatamente  igual o nome
        return clienteRepository.findByNomeContaining("k");


    //    return manager.createQuery("from Cliente",Cliente.class).getResultList();

    }
}

package com.algaworks.awpag.doman.repository;

import com.algaworks.awpag.domain.mode.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente,Long> {

   List<Cliente> findByNome(String nome);//pesquisa extamente o nome igual


    List<Cliente> findByNomeContaining(String nome);//pesquisa generica


    Optional<Cliente> findByEmail(String email);
}

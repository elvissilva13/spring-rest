package com.algaworks.awpag.domain.mode.Service;

import com.algaworks.awpag.domain.mode.Cliente;
import com.algaworks.awpag.doman.repository.ClienteRepository;
import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class CadastroClienteService {
    private final ClienteRepository clienteRepository;
    @Transactional
    public Cliente salvar(Cliente cliente){
        boolean emailEmUso=clienteRepository.findByEmail(cliente.getEmail())
                .isPresent();
        return  clienteRepository.save(cliente);
    }
    @Transactional
    public void excluir(long clienteId){

        clienteRepository.deleteById(clienteId);
    }
}

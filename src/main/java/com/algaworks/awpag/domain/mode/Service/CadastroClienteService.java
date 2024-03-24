package com.algaworks.awpag.domain.mode.Service;

import com.algaworks.awpag.domain.mode.Cliente;
import com.algaworks.awpag.domain.mode.exception.NegocioException;
import com.algaworks.awpag.doman.repository.ClienteRepository;
import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class CadastroClienteService {
    private final ClienteRepository clienteRepository;
    @Transactional
    public Cliente salvar(Cliente cliente){
        boolean emailEmUso=clienteRepository.findByEmail(cliente.getEmail())
                .filter(c -> !c.equals(cliente) )
                .isPresent();
        if (emailEmUso){
            throw new NegocioException("Já existe um cliente cadastrado com este E-mail");
        }
        return  clienteRepository.save(cliente);
    }
    @Transactional
    public void excluir(long clienteId){

        clienteRepository.deleteById(clienteId);
    }
}

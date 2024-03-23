package com.algaworks.awpag.api.controle;

import com.algaworks.awpag.domain.mode.Cliente;
import com.algaworks.awpag.domain.mode.Service.CadastroClienteService;
import com.algaworks.awpag.doman.repository.ClienteRepository;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


@AllArgsConstructor
@RestController
@RequestMapping("/clientes")
public class ClienteControle {
   // @Autowired
    private  final CadastroClienteService cadastroClienteService;
    private final ClienteRepository clienteRepository;




    @GetMapping
    public List<Cliente> Listar(){
        // return clienteRepository.findAll(); pesquisa tudo no banco de dados
        //return  clienteRepository.findByNome("elvis");pesquisa exatamente  igual o nome
        return clienteRepository.findByNomeContaining("k");


    //    return manager.createQuery("from Cliente",Cliente.class).getResultList();

    }

    @GetMapping("/{clienteId}")
    public ResponseEntity<Cliente> buscar(@PathVariable long clienteId){
        Optional<Cliente> cliente= clienteRepository.findById(clienteId);
      //  return cliente.orElse(null);
        if (cliente.isPresent()){
            return ResponseEntity.ok(cliente.get());
        }

        return ResponseEntity.notFound().build();
    }
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Cliente adicionar(@Valid @RequestBody Cliente cliente){
        return cadastroClienteService.salvar(cliente);
    }
    @PutMapping("/{clienteId}")
    public  ResponseEntity<Cliente> atualizar(@PathVariable long clienteId,@Valid @RequestBody Cliente cliente){
        if (!clienteRepository.existsById(clienteId)){
            return ResponseEntity.notFound().build();
        }
        cliente.setId(clienteId);
        cliente=cadastroClienteService.salvar(cliente);
        return ResponseEntity.ok(cliente);
    }

    @DeleteMapping("/{clienteId}")
    public ResponseEntity<Void> excluir(@PathVariable long clienteId){
        if (!clienteRepository.existsById(clienteId)){
            return ResponseEntity.notFound().build();
        }
        cadastroClienteService.excluir(clienteId);
        return ResponseEntity.noContent().build();
    }
}

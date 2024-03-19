package com.algaworks.awpag.api.controle;

import com.algaworks.awpag.domain.mode.Cliente;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class ClienteControle {

    @GetMapping("/clientes")
    public List<Cliente> Listar(){
        var cliente1 = new Cliente();
        cliente1.setId(1L);
        cliente1.setNome("Elvis Silva");
        cliente1.setEmail("bel-bis@hotmail.com");
        cliente1.setTelefone("12-2765-2222");

        var cliente2 = new Cliente();
        cliente2.setId(2L);
        cliente2.setNome("Ketly cremonese");
        cliente2.setEmail("KetlySilva@hotmail.com");
        cliente2.setTelefone("13-2165-1122");

        var cliente3 = new Cliente();
        cliente3.setId(3L);
        cliente3.setNome("Sofia maria silva");
        cliente3.setEmail("SofiaMariaC@hotmail.com");
        cliente3.setTelefone("14-8765-8769");

        var cliente4 = new Cliente();
        cliente4.setId(4L);
        cliente4.setNome("gabriel silva");
        cliente4.setEmail("gaRodriguesSilva@hotmail.com");
        cliente4.setTelefone("15-0989-1112");

        return Arrays.asList(cliente1,cliente2,cliente3,cliente4);

    }
}

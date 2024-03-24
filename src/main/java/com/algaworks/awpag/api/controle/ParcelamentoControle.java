package com.algaworks.awpag.api.controle;

import com.algaworks.awpag.domain.mode.Parcelamento;
import com.algaworks.awpag.doman.repository.ParcelamentoRepository;
import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("/parcelamentos")
public class ParcelamentoControle {
    private final ParcelamentoRepository parcelamentoRepository;

    @GetMapping
    public List<Parcelamento> listar(){
        return parcelamentoRepository.findAll();
    }
}

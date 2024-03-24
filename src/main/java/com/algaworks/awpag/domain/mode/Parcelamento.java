package com.algaworks.awpag.domain.mode;

import jakarta.persistence.*;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDateTime;
@Getter
@Setter
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Entity
public class Parcelamento {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @EqualsAndHashCode.Include
    private long id;

    @ManyToMany
   // @JoinColumn(name="cliente_id")
    private Cliente cliente;

    private String descricao;
    private BigDecimal valorTotal;
    private Integer quantidadesParcelas;
    private LocalDateTime dataCriacao;

}

package com.algaworks.awpag.domain.mode;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
@Entity
//@table(name="tb_cliente")
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Getter
@Setter
public class Cliente {
    @EqualsAndHashCode.Include
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  long id;

    @NotBlank
    @Size(max=250)
    private String nome;

    @NotBlank
    @Size(max = 250)
    private String email;

    @Size(max = 20)
    @Column(name = "fone")
    private String telefone;
}

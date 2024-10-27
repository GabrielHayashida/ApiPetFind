package com.petfind.petFindApi.pet;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.repository.cdi.Eager;

@Table(name = "pet")
@Entity(name = "pet")
@Getter
@Setter
public class Pet {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(nullable = false)
    private String petNome;
    private TiposPet petTipo;
    private Long petIdade;
    private String petCor;
    private String descricao;

    public Pet(String petNome, TiposPet petTipo, Long petIdade, String petCor, String descricao) {
        this.petNome = petNome;
        this.petTipo = petTipo;
        this.petIdade = petIdade;
        this.petCor = petCor;
        this.descricao = descricao;
    }
}

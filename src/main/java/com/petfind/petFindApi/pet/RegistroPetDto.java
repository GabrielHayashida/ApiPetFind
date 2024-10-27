package com.petfind.petFindApi.pet;

public record RegistroPetDto(String petNome, TiposPet petTipo, Long petIdade, String petCor, String petDescricao ) {
}

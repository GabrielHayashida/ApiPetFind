package com.petfind.petFindApi.pet;

public enum TiposPet {
    CACHORRO("cachorro"),
    GATO("gato"),
    OUTROS("outros");
    private String tipo;

    TiposPet(String tipo) {
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }
}

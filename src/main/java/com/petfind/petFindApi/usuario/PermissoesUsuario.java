package com.petfind.petFindApi.usuario;

public enum PermissoesUsuario {
    ADMIN("admin"),
    USER("user");
    private String role;

    PermissoesUsuario(String role) {
        this.role = role;
    }

    public String getRole() {
        return role;
    }
}

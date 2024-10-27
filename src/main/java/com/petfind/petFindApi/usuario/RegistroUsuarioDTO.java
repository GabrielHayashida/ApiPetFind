package com.petfind.petFindApi.usuario;

public record RegistroUsuarioDTO(String email, String username, String password, PermissoesUsuario permissoesUsuario) {
}

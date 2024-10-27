package com.petfind.petFindApi.repositorios;

import com.petfind.petFindApi.usuario.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RepositorioUsuario extends JpaRepository<Usuario, Long> {

}

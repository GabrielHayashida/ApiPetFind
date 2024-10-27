package com.petfind.petFindApi.controller;

import com.petfind.petFindApi.pet.Pet;
import com.petfind.petFindApi.pet.RegistroPetDto;
import com.petfind.petFindApi.repositorios.RepositorioPets;
import com.petfind.petFindApi.repositorios.RepositorioUsuario;
import com.petfind.petFindApi.usuario.RegistroUsuarioDTO;
import com.petfind.petFindApi.usuario.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EndPointsController {
    @Autowired
    private RepositorioUsuario repositorioUsuario;

    @Autowired
    private RepositorioPets repositorioPets;

    @GetMapping()
    public String bemVindo(){
        return "Bem-vindo à API do PetFind";
    }

    @GetMapping("/usuarios")
    public List<Usuario> getUsuarios(){
        return repositorioUsuario.findAll();
    }

    @GetMapping("/pets")
    public List<Pet> getPets(){
        return repositorioPets.findAll();
    }

    @PostMapping("/usuarios")
    public ResponseEntity<Usuario> saveUsuario(@RequestBody RegistroUsuarioDTO usuario){
        Usuario novoUsuario = new Usuario(usuario.email(), usuario.username(), usuario.password(), usuario.permissoesUsuario());
        return new ResponseEntity<>(novoUsuario, HttpStatus.CREATED);
    }
    @PostMapping("/pets")
    public ResponseEntity<Pet> savePet(@RequestBody RegistroPetDto pet){
        Pet novoPet = new Pet(pet.petNome(), pet.petTipo(), pet.petIdade(), pet.petCor(), pet.petDescricao());
        return new ResponseEntity<>(novoPet, HttpStatus.CREATED);
    }

}

package com.petfind.petFindApi.repositorios;

import com.petfind.petFindApi.pet.Pet;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RepositorioPets extends JpaRepository<Pet, Long> {
}

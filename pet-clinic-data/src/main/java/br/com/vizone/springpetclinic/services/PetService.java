package br.com.vizone.springpetclinic.services;

import br.com.vizone.springpetclinic.model.Pet;

import java.util.Set;

public interface PetService {
    Pet findById(Long id);

    Pet save(Pet pet);

    Set<Pet> findAll();
}

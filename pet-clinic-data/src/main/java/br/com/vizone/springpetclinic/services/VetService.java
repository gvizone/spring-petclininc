package br.com.vizone.springpetclinic.services;

import br.com.vizone.springpetclinic.model.Vet;

import java.util.Set;

public interface VetService {
    Vet findById(Long id);

    Vet save(Vet vet);

    Set<Vet> findAll();
}

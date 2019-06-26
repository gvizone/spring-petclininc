package br.com.vizone.springpetclinic.repositories;

import br.com.vizone.springpetclinic.model.Pet;
import org.springframework.data.repository.CrudRepository;

public interface PetRepository extends CrudRepository<Pet, Long> {
}

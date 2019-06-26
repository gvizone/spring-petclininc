package br.com.vizone.springpetclinic.repositories;

import br.com.vizone.springpetclinic.model.PetType;
import org.springframework.data.repository.CrudRepository;

public interface PetTypeRepository extends CrudRepository<PetType, Long> {
}

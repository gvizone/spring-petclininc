package br.com.vizone.springpetclinic.repositories;

import br.com.vizone.springpetclinic.model.Owner;
import org.springframework.data.repository.CrudRepository;

public interface OwnerRepository extends CrudRepository<Owner, Long> {
}

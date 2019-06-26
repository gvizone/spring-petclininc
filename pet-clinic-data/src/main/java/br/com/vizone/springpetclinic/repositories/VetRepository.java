package br.com.vizone.springpetclinic.repositories;

import br.com.vizone.springpetclinic.model.Vet;
import org.springframework.data.repository.CrudRepository;

public interface VetRepository extends CrudRepository<Vet, Long> {
}

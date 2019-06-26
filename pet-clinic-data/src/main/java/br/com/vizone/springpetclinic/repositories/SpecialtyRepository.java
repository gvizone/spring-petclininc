package br.com.vizone.springpetclinic.repositories;

import br.com.vizone.springpetclinic.model.Specialty;
import org.springframework.data.repository.CrudRepository;

public interface SpecialtyRepository extends CrudRepository<Specialty, Long> {
}

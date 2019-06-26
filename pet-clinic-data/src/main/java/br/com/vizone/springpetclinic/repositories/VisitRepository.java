package br.com.vizone.springpetclinic.repositories;

import br.com.vizone.springpetclinic.model.Visit;
import org.springframework.data.repository.CrudRepository;

public interface VisitRepository extends CrudRepository<Visit, Long> {
}

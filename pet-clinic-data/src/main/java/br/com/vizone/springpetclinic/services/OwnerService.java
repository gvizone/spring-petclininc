package br.com.vizone.springpetclinic.services;

import br.com.vizone.springpetclinic.model.Owner;

public interface OwnerService extends CrudService<Owner, Long>{
    Owner findByLastName(String lastName);
}

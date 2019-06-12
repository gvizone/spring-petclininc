package br.com.vizone.springpetclinic.bootstrap;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import br.com.vizone.springpetclinic.model.Owner;
import br.com.vizone.springpetclinic.model.Vet;
import br.com.vizone.springpetclinic.services.OwnerService;
import br.com.vizone.springpetclinic.services.VetService;
import br.com.vizone.springpetclinic.services.map.OwnerServiceMap;
import br.com.vizone.springpetclinic.services.map.VetServiceMap;

/**
 * DataLoader
 */
@Component
public class DataLoader implements CommandLineRunner{
    private final OwnerService ownerService;
    private final VetService vetService;

    public DataLoader() {
        ownerService = new OwnerServiceMap();
        vetService = new VetServiceMap();
    }

    @Override
    public void run(String... args) throws Exception {
        Owner owner1 = new Owner();
        owner1.setId(1L);
        owner1.setFirstName("Michael");
        owner1.setLastName("Stevens");
        ownerService.save(owner1);

        Owner owner2 = new Owner();
        owner2.setId(2L);
        owner2.setFirstName("Anna");
        owner2.setLastName("Gomez");
        ownerService.save(owner2);

        System.out.println("Loaded owners...");

        Vet vet1 = new Vet();
        vet1.setId(1L);
        vet1.setFirstName("Rick");
        vet1.setLastName("Stewart");
        vetService.save(vet1);

        Vet vet2 = new Vet();
        vet2.setId(2L);
        vet2.setFirstName("Sam");
        vet2.setLastName("Martinez");
        vetService.save(vet2);

        System.out.println("Loaded vets...");
    }

    
}
package br.com.vizone.springpetclinic.bootstrap;

import br.com.vizone.springpetclinic.model.Owner;
import br.com.vizone.springpetclinic.model.Vet;
import br.com.vizone.springpetclinic.services.OwnerService;
import br.com.vizone.springpetclinic.services.VetService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/**
 * DataLoader
 */
@Component
public class DataLoader implements CommandLineRunner{
    private final OwnerService ownerService;
    private final VetService vetService;

    public DataLoader(OwnerService ownerService, VetService vetService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
    }    

    @Override
    public void run(String... args) throws Exception {
        Owner owner1 = new Owner();
        owner1.setFirstName("Michael");
        owner1.setLastName("Stevens");
        ownerService.save(owner1);

        Owner owner2 = new Owner();
        owner2.setFirstName("Anna");
        owner2.setLastName("Gomez");
        ownerService.save(owner2);

        System.out.println("Loaded owners...");

        Vet vet1 = new Vet();
        vet1.setFirstName("Rick");
        vet1.setLastName("Stewart");
        vetService.save(vet1);

        Vet vet2 = new Vet();
        vet2.setFirstName("Sam");
        vet2.setLastName("Martinez");
        vetService.save(vet2);

        System.out.println("Loaded vets...");
    }

    
}
package br.com.vizone.springpetclinic.bootstrap;

import br.com.vizone.springpetclinic.model.*;
import br.com.vizone.springpetclinic.services.OwnerService;
import br.com.vizone.springpetclinic.services.PetTypeService;
import br.com.vizone.springpetclinic.services.SpecialtyService;
import br.com.vizone.springpetclinic.services.VetService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

/**
 * DataLoader
 */
@Component
public class DataLoader implements CommandLineRunner{
    private final OwnerService ownerService;
    private final VetService vetService;
    private final PetTypeService petTypeService;
    private final SpecialtyService specialtyService;

    public DataLoader(OwnerService ownerService, VetService vetService, PetTypeService petTypeService, SpecialtyService specialtyService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
        this.petTypeService = petTypeService;
        this.specialtyService = specialtyService;
    }

    @Override
    public void run(String... args) throws Exception {
        final int count = petTypeService.findAll().size();
        if (count == 0)
            loadData();
    }

    private void loadData() {
        PetType dog = new PetType();
        dog.setName("Dog");
        PetType savedDogPetType = petTypeService.save(dog);

        PetType cat = new PetType();
        cat.setName("Cat");
        PetType savedCatPetType = petTypeService.save(cat);

        Specialty radiology = new Specialty();
        radiology.setDescription("Radiology");
        Specialty savedRadiology = specialtyService.save(radiology);

        Specialty surgery = new Specialty();
        surgery.setDescription("Surgery");
        Specialty savedSurgery= specialtyService.save(surgery);

        Specialty dentistry = new Specialty();
        dentistry.setDescription("Dentistry");
        Specialty savedDentistry = specialtyService.save(dentistry);

        Owner owner1 = new Owner();
        owner1.setFirstName("Michael");
        owner1.setLastName("Stevens");
        owner1.setAddress("Av. Paulista, 2930");
        owner1.setCity("São Paulo");
        owner1.setTelephone("2342342376");

        Pet mikesPet = new Pet();
        mikesPet.setPetType(savedDogPetType);
        mikesPet.setOwner(owner1);
        mikesPet.setBirthDate(LocalDate.now());
        mikesPet.setName("Rosco");
        owner1.getPets().add(mikesPet);
        ownerService.save(owner1);


        Owner owner2 = new Owner();
        owner2.setFirstName("Anna");
        owner2.setLastName("Gomez");
        owner2.setAddress("Av. Paulista, 2930");
        owner2.setCity("São Paulo");
        owner2.setTelephone("2342342376");
        ownerService.save(owner2);

        Pet annasCat = new Pet();
        annasCat.setPetType(savedCatPetType);
        annasCat.setOwner(owner2);
        annasCat.setBirthDate(LocalDate.now());
        annasCat.setName("Fiona");
        owner2.getPets().add(mikesPet);
        ownerService.save(owner1);
        System.out.println("Loaded owners...");

        Vet vet1 = new Vet();
        vet1.setFirstName("Rick");
        vet1.setLastName("Stewart");
        vet1.getSpecialties().add(radiology);
        vetService.save(vet1);

        Vet vet2 = new Vet();
        vet2.setFirstName("Sam");
        vet2.setLastName("Martinez");
        vet2.getSpecialties().add(surgery);
        vetService.save(vet2);

        System.out.println("Loaded vets...");
    }


}
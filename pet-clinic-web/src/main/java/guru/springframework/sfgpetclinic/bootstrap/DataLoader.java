package guru.springframework.sfgpetclinic.bootstrap;

import guru.springframework.sfgpetclinic.model.Owner;
import guru.springframework.sfgpetclinic.model.Vet;
import guru.springframework.sfgpetclinic.services.OwnerService;
import guru.springframework.sfgpetclinic.services.VetService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {

  private final OwnerService ownerService;
  private final VetService vetService;

  public DataLoader(OwnerService ownerService, VetService vetService) {
    this.ownerService = ownerService;
    this.vetService = vetService;
  }

  @Override
  public void run(String... args) {
    Owner owner1 = new Owner();
    owner1.setFirstName("Maxim");
    owner1.setLastName("Tkac");
    ownerService.save(owner1);

    Owner owner2 = new Owner();
    owner2.setFirstName("Ivan");
    owner2.setLastName("Petrov");
    ownerService.save(owner2);

    Vet vet1 = new Vet();
    vet1.setFirstName("Sam");
    vet1.setLastName("Ivanov");

    vetService.save(vet1);

    Vet vet2 = new Vet();
    vet2.setFirstName("Samee");
    vet2.setLastName("Ivanovww");

    vetService.save(vet2);


  }


}

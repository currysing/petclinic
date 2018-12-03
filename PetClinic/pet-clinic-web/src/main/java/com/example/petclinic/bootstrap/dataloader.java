package com.example.petclinic.bootstrap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.example.petclinic.model.Owner;
import com.example.petclinic.services.OwnerService;
import com.example.petclinic.services.PetService;

@Component
public class dataloader implements CommandLineRunner {
	private final OwnerService ownerservice;
	private final PetService petservice;

	@Autowired
	public dataloader(OwnerService ownerservice, PetService petservice) {
		super();
		this.ownerservice = ownerservice;
		this.petservice = petservice;
	}

	
	@Override
	public void run(String... args) throws Exception {
	
		Owner o1 = new Owner();
		o1.setId(1L);
		o1.setFirstName("o1 FirstName");
		o1.setLastName("o1 LastName");
		
		Owner o2 = new Owner();
		o2.setId(2L);
		o2.setFirstName("o2 FirstName");
		o2.setLastName("o2 LastName");
		
		Owner o3 = new Owner();
		o3.setId(3L);
		o3.setFirstName("o3 FirstName");
		o3.setLastName("o3 LastName");
		
		Owner o4 = new Owner();
		o4.setId(4L);
		o4.setFirstName("o4 FirstName");
		o4.setLastName("o4 LastName");
		
		System.out.println("Saving o1");
		ownerservice.save(o1);
		System.out.println("Saving o2");
		ownerservice.save(o2);
		System.out.println("Saving o3");
		ownerservice.save(o3);
		System.out.println("Saving o4");
		ownerservice.save(o4);
	}


}

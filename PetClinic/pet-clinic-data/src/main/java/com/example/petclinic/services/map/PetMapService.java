package com.example.petclinic.services.map;

import org.springframework.stereotype.Service;

import com.example.petclinic.model.Pet;
import com.example.petclinic.services.PetService;

@Service
public class PetMapService extends MapFunctions<Long, Pet> implements PetService {

	@Override
	public Pet save(Pet obj) {
		return super.save(obj.getId(), obj);
	}


}

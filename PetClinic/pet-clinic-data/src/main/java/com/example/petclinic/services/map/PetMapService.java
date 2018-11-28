package com.example.petclinic.services.map;

import com.example.petclinic.model.Pet;

public class PetMapService extends BaseMapService<Long, Pet> {

	@Override
	public Pet save(Pet obj) {
		return super.save(obj.getId(), obj);
	}


}

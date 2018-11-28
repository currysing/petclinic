package com.example.petclinic.services.map;

import com.example.petclinic.model.Vet;

public class VetMapService extends BaseMapService<Long, Vet> {

	@Override
	public Vet save(Vet obj) {
		return super.save(obj.getId(), obj);
	}

}

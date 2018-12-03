package com.example.petclinic.services.map;

import org.springframework.stereotype.Service;

import com.example.petclinic.model.Vet;
import com.example.petclinic.services.VetService;

@Service
public class VetMapService extends MapFunctions<Long, Vet> implements VetService {

	@Override
	public Vet save(Vet obj) {
		return super.save(obj.getId(), obj);
	}

}

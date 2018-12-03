package com.example.petclinic.services.map;

import org.springframework.stereotype.Service;

import com.example.petclinic.model.Owner;
import com.example.petclinic.services.OwnerService;

@Service
public class OwnerMapService extends MapFunctions<Long, Owner> implements OwnerService {

	@Override
	public Owner save(Owner obj) {
		return super.save(obj.getId(), obj);
	}

	@Override
	public Owner findByLastName(String lastName) {
		// TODO Auto-generated method stub
		return null;
	}


}

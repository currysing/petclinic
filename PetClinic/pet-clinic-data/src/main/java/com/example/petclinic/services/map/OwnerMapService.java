package com.example.petclinic.services.map;

import com.example.petclinic.model.Owner;

public class OwnerMapService extends BaseMapService<Long, Owner> {

	@Override
	public Owner save(Owner obj) {
		return super.save(obj.getId(), obj);
	}


}

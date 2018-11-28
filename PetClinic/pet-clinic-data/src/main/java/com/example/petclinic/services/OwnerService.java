package com.example.petclinic.services;

import java.util.Set;

import com.example.petclinic.model.Owner;

public interface OwnerService extends CrudService<Owner, Long> {

	Owner findByLastName(String lastName);
	
}

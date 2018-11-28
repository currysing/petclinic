package com.example.petclinic.services;

import java.util.Set;

import com.example.petclinic.model.Owner;

public interface OwnerService {

	Owner findById(Long id);
	Owner findByLastName(String lastName);
	Set<Owner> findAll();
	Owner save(Owner owner);
	
}

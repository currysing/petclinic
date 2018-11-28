package com.example.petclinic.services;

import java.util.Set;

import com.example.petclinic.model.Vet;

public interface VetService {

	Vet findById(Long id);
	//Vet findByLastName(String lastName);
	Set<Vet> findAll();
	Vet save(Vet vet);
}

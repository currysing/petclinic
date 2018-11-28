package com.example.petclinic.services;

import java.util.Set;

public interface CrudService<T, ID> {

	T findById(ID id);
	Set<T> findAll();
	T save(T obj);
	void deleteById(ID id);
	void delete(T obj);
}

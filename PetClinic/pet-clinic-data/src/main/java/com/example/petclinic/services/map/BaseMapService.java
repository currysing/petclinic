package com.example.petclinic.services.map;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import com.example.petclinic.services.CrudService;

public abstract class BaseMapService<ID, T> implements CrudService<T, ID> {

	private Map<ID, T> map = new HashMap<ID, T>();

	@Override
	public T findById(ID id) {
		return map.get(id);
	}

	@Override
	public Set<T> findAll() {
		return new HashSet<>(map.values());
	}

//	@Override
//	public T save(T obj) {
//		//
//		return null;
//	}

	public T save(ID id, T obj) {
		map.put(id, obj);
		return obj;
	}
	
	@Override
	public void deleteById(ID id) {
		map.remove(id);
	}

	@Override
	public void delete(T obj) {
		map.entrySet().removeIf(t -> t.getValue().equals(obj));
	}

}

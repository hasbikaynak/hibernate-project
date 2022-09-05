package com.tpe.domain.dao;

import java.util.List;
import java.util.Optional;

public interface GenericDao<E,ID> {
	
	public void save(E e);
	public void update(E e);
	public void delete(ID id);
	public Optional<E> find(ID id); // Optional is a container object used to contain not-null objects.
	// Optional object is used to represent null with absent value.
	// This class has various utility methods to facilitate code to handle values as ‘available’ or ‘not available’ instead of checking null values.
	public List<E> getAll();

}

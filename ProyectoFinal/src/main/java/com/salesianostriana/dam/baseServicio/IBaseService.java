package com.salesianostriana.dam.baseServicio;

import java.util.List;

import org.springframework.data.jpa.repository.Query;

import com.salesianostriana.dam.modelo.Bicicleta;



public interface IBaseService<T, ID> {

	
	T save(T t);

	
	T findById(ID id);

	
	List<T> findAll();

	
	T edit(T t);

	
	void delete(T t);

	
	void deleteById(ID id);
	
	//@Query("select bi from Bicicleta bi where bi.categoria.id = ?1")
	

}
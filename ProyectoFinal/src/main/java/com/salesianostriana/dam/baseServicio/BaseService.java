package com.salesianostriana.dam.baseServicio;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;


import com.salesianostriana.dam.modelo.Bicicleta;

// TODO: Auto-generated Javadoc
/**
 * The Class BaseService.
 *
 * @param <T> the generic type
 * @param <ID> the generic type
 * @param <R> the generic type
 */
public abstract class BaseService<T, ID, R extends JpaRepository<T, ID>> implements IBaseService<T, ID> {
	
	
	/** The repositorio. */
	protected R repositorio;
	
	
	
	/**
	 * Instantiates a new base service.
	 *
	 * @param repo the repo
	 */
	public BaseService(R repo){
		
		this.repositorio = repo;
	}
	
	/**
	 * Save.
	 *
	 * @param t the t
	 * @return the t
	 */
	@Override
	public T save(T t) {
		return repositorio.save(t);
	}
	
	
	/**
	 * Find by id.
	 *
	 * @param id the id
	 * @return the t
	 */
	@Override
	public T findById(ID id) {
		return repositorio.findById(id).orElse(null);
	}
	
	
	/**
	 * Find all.
	 *
	 * @return the list
	 */
	@Override
	public List<T> findAll() {
		return repositorio.findAll();
	}
	
	
	/**
	 * Edits the.
	 *
	 * @param t the t
	 * @return the t
	 */
	@Override
	public T edit(T t) {
		return repositorio.save(t);
	}
	
	
	/**
	 * Delete.
	 *
	 * @param t the t
	 */
	@Override
	public void delete(T t) {
		repositorio.delete(t);
	}
	
	
	/**
	 * Delete by id.
	 *
	 * @param id the id
	 */
	@Override
	public void deleteById(ID id) {
		repositorio.deleteById(id);
	}


	
	
}
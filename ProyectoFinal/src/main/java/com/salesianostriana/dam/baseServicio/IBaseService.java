package com.salesianostriana.dam.baseServicio;

import java.util.List;

import org.springframework.data.jpa.repository.Query;

import com.salesianostriana.dam.modelo.Bicicleta;



// TODO: Auto-generated Javadoc
/**
 * The Interface IBaseService.
 *
 * @param <T> the generic type
 * @param <ID> the generic type
 */
public interface IBaseService<T, ID> {

	
	/**
	 * Save.
	 *
	 * @param t the t
	 * @return the t
	 */
	T save(T t);

	
	/**
	 * Find by id.
	 *
	 * @param id the id
	 * @return the t
	 */
	T findById(ID id);

	
	/**
	 * Find all.
	 *
	 * @return the list
	 */
	List<T> findAll();

	
	/**
	 * Edits the.
	 *
	 * @param t the t
	 * @return the t
	 */
	T edit(T t);

	
	/**
	 * Delete.
	 *
	 * @param t the t
	 */
	void delete(T t);

	
	/**
	 * Delete by id.
	 *
	 * @param id the id
	 */
	void deleteById(ID id);
	
	/**
	 * Find by categoria id.
	 *
	 * @param categoriaId the categoria id
	 * @return the list
	 */
	@Query("select bi from Bicicleta bi where bi.categoria.id = ?1")
	public List<Bicicleta> findByCategoriaId(Long categoriaId);

}
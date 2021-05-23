package com.salesianostriana.dam.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.salesianostriana.dam.modelo.Categoria;

/**
 * The Interface CategoriaRepository.
 */
public interface CategoriaRepository extends JpaRepository<Categoria, Long>{

	
	
	
}

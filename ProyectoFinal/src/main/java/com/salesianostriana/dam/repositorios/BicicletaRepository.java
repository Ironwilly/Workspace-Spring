package com.salesianostriana.dam.repositorios;

import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;


import com.salesianostriana.dam.modelo.Bicicleta;
import com.salesianostriana.dam.modelo.Categoria;

public  interface BicicletaRepository extends JpaRepository<Bicicleta, Long> {

	public List<Bicicleta> findByMarcaModelo(String marMode);

	@Query("select bi from Bicicleta bi where bi.marcaModelo.id = ?1")
	public List<Bicicleta> findByCategoriaId(Long id);
	
	
	
	
	
	
}

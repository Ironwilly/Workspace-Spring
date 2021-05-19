package com.salesianostriana.dam.repositorios;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.salesianostriana.dam.modelo.Bicicleta;
import com.salesianostriana.dam.modelo.Categoria;

public interface BicicletaRepository extends JpaRepository<Bicicleta, Long> {

	public List<Bicicleta> findByCategoria(Categoria categoria);
	
	/*
	@Query("select b.id from Bicicleta b")
	public List<Long> cogerIds();
	
	@Query("select b from Bicicleta b where b.categoria.id = ?1")
	public List<Bicicleta> findByCategoriaId(Long categoriaId);
	
	@Query("selec count(p) from Bicicleta b where b.categoria = ?1")
	public int findNumBicisByCategoria(Categoria categoria);
	
	*/
	
	
}

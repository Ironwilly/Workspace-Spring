package com.salesianostriana.dam.repositorios;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;


import com.salesianostriana.dam.modelo.Bicicleta;
import com.salesianostriana.dam.modelo.Categoria;


// TODO: Auto-generated Javadoc
/**
 * The Interface BicicletaRepository.
 */
public  interface BicicletaRepository extends JpaRepository<Bicicleta, Long> {

	/**
	 * Find by marca modelo.
	 *
	 * @param marMode the mar mode
	 * @return the list
	 */
	public List<Bicicleta> findByMarcaModelo(String marMode);

	/**
	 * Find by categoria id.
	 *
	 * @param categoriaId the categoria id
	 * @return the list
	 */
	@Query("select bi from Bicicleta bi where bi.categoria.id = ?1")
	public List<Bicicleta> findByCategoriaId(Long categoriaId);
	
	@Query("select count(bi) from Bicicleta bi where bi.categoria = ?1")
	public int findByCategoria(Categoria categoria);
	
	
	
	
	
	
	
}

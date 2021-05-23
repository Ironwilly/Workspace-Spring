package com.salesianostriana.dam.servicios;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.salesianostriana.dam.baseServicio.BaseService;

import com.salesianostriana.dam.modelo.Bicicleta;
import com.salesianostriana.dam.modelo.Categoria;
import com.salesianostriana.dam.repositorios.BicicletaRepository;

// TODO: Auto-generated Javadoc
/**
 * The Class BicicletaService.
 */
@Service
@Repository
public class BicicletaService extends BaseService<Bicicleta, Long, BicicletaRepository>{

	
	/** The repositorio. */
	@Autowired
	private BicicletaRepository repositorio;
	
	/**
	 * Instantiates a new bicicleta service.
	 *
	 * @param repo the repo
	 */
	public BicicletaService(BicicletaRepository repo) {
		
		super(repo);
		
		
		
	}
	
/**
 * Find by categoria id.
 *
 * @param categoriaId the categoria id
 * @return the list
 */
@Override
	public List<Bicicleta> findByCategoriaId(Long categoriaId) {
		// TODO Auto-generated method stub
		return repositorio.findByCategoriaId(categoriaId);
	}

public int numeroBicicletaCategoria(Categoria categoria) {
	return repositorio.findByCategoria(categoria);
}
	
	

}

package com.salesianostriana.dam.servicios;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.salesianostriana.dam.baseServicio.BaseService;
import com.salesianostriana.dam.modelo.Bicicleta;
import com.salesianostriana.dam.modelo.Categoria;
import com.salesianostriana.dam.repositorios.CategoriaRepository;

// TODO: Auto-generated Javadoc
/**
 * The Class CategoriaService.
 */
@Service	
public class CategoriaService extends BaseService<Categoria, Long, CategoriaRepository>{

	/**
	 * Instantiates a new categoria service.
	 *
	 * @param repo the repo
	 */
	public CategoriaService(CategoriaRepository repo) {
		super(repo);
		
	}

	
	/**
	 * Find by categoria id.
	 *
	 * @param categoriaId the categoria id
	 * @return the list
	 */
	@Override
	public List<Bicicleta> findByCategoriaId(Long categoriaId){
		
		return null;
	}
	
}

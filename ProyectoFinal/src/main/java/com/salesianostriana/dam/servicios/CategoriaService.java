package com.salesianostriana.dam.servicios;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.salesianostriana.dam.baseServicio.BaseService;
import com.salesianostriana.dam.modelo.Bicicleta;
import com.salesianostriana.dam.modelo.Categoria;
import com.salesianostriana.dam.repositorios.CategoriaRepository;

@Service	
public class CategoriaService extends BaseService<Categoria, Long, CategoriaRepository>{

	public CategoriaService(CategoriaRepository repo) {
		super(repo);
		
	}

	
	@Override
	public List<Bicicleta> findByCategoriaId(Long categoriaId){
		
		return null;
	}
	
}

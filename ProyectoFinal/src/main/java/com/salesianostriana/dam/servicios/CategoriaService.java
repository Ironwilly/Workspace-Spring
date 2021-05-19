package com.salesianostriana.dam.servicios;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.salesianostriana.dam.modelo.Categoria;
import com.salesianostriana.dam.repositorios.CategoriaRepository;

@Service	
public class CategoriaService {
	
	
	@Autowired
	private CategoriaRepository repo;
	
	public List<Categoria> findAll(){
		
		return repo.findAll();
		
	}
	
	public Categoria save(Categoria categoria) {
		
		return repo.save(categoria);
	}
	
	public Categoria findById(Long id) {
		
		return repo.findById(id).orElse(null);
	}

	public Categoria delete(Categoria categoria) {
		
		Categoria encontrado = findById(categoria.getId());
		repo.delete(encontrado);
		
		return encontrado;
	}
	
}

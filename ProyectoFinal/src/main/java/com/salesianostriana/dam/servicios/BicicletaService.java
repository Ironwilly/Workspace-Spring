package com.salesianostriana.dam.servicios;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.salesianostriana.dam.modelo.Bicicleta;
import com.salesianostriana.dam.modelo.Categoria;
import com.salesianostriana.dam.repositorios.BicicletaRepository;

@Service
public class BicicletaService {
	
	/*
	private BicicletaRepository repo;
	
	public List<Bicicleta> findAll(){
		
		return repo.findAll();	
		
	
	}
	public List<Bicicleta> findAllByCategoria(Categoria categoria){
		
		return repo.findByCategoria(categoria);
		
	}
	
	public List<Bicicleta> findAllByCategoria(Long categoriaId){
		
		return repo.findByCategoriaId(categoriaId);
	}
	
	public Bicicleta findById(Long id) {
		return repo.findById(id).orElse(null);
		
		
	}
	
	public Bicicleta save(Bicicleta bicicleta) {
		return repo.save(bicicleta);
	}
	
	public Bicicleta delete(Bicicleta bicicleta) {
		
		Bicicleta encontrado = findById(bicicleta.getId());
		repo.delete(encontrado);
		return encontrado;
		
	}
	
	public int numBicisCategoria(Categoria categoria) {
		return repo.findNumBicisByCategoria(categoria);
		
		
		
	}
	
	
	public List<Bicicleta> mostrarBicicletasAleatorias(int numero){
		
		List<Long> listadoIds = repo.cogerIds();
		Collections.shuffle(listadoIds);
		listadoIds = listadoIds.stream()
				.limit(numero)
				.collect(Collectors.toList());
		return repo.findAllById(listadoIds);
	}

*/
}

package com.salesianostriana.dam.servicios;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.salesianostriana.dam.baseServicio.BaseService;

import com.salesianostriana.dam.modelo.Bicicleta;
import com.salesianostriana.dam.modelo.Categoria;
import com.salesianostriana.dam.repositorios.BicicletaRepository;

@Service
public class BicicletaService extends BaseService<Bicicleta, Long, BicicletaRepository>{

	
	@Autowired
	private BicicletaRepository repositorio;
	
	public BicicletaService(BicicletaRepository repo) {
		
		super(repo);
		// TODO Auto-generated constructor stub
		
		
	}

	@Override
	public List<Bicicleta> findByCategoriaId(Long categoriaId) {
		// TODO Auto-generated method stub
		return super.findByCategoriaId(categoriaId);
	}

	
	

}

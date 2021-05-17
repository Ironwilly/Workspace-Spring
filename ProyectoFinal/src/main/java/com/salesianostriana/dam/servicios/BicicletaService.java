package com.salesianostriana.dam.servicios;

import java.util.List;

import org.springframework.stereotype.Service;

import com.salesianostriana.dam.modelo.Bicicleta;
import com.salesianostriana.dam.repositorios.BicicletaRepository;

@Service
public class BicicletaService {
	
	private BicicletaRepository repositorio;
	
	public List<Bicicleta> findAll(){
		
		return repositorio.findAll();	
		
	
	}
	
	
	

}

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



	

	public List<Bicicleta> findAllByCategoria(Categoria categoria) {

		return repo.findByCategoria(categoria);

	}

	public List<Bicicleta> findAllByCategoria(Long categoriaId) {

		return repo.findByCategoriaId(categoriaId);
	}


	
	public int numBicisCategoria(Categoria categoria) {
		return repo.findNumBicisByCategoria(categoria);

	}

	public List<Bicicleta> mostrarBicicletasAleatorias(int numero) {

		List<Bicicleta> listadoBicis = repo.findAll();

		
		if (listadoBicis == null || listadoBicis.isEmpty()) {
			return Collections.emptyList();
		}
		
		Collections.shuffle(listadoBicis);

		return listadoBicis.stream().limit(numero).collect(Collectors.toList());

	}

}

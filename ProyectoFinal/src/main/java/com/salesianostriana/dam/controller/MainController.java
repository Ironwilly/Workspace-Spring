package com.salesianostriana.dam.controller;




import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.salesianostriana.dam.modelo.Bicicleta;
import com.salesianostriana.dam.servicios.BicicletaService;
import com.salesianostriana.dam.servicios.CategoriaService;


@Controller
public class MainController {
	
	private static final int NUMBICIS = 9;
	
	@Autowired
	private CategoriaService categoriaService;
	
	@Autowired
	private BicicletaService bicicletaService;
	
	/*
	@GetMapping("/")
	public String index(@RequestParam(name ="idCategoria", required = false)Long idCategoria,Model model) {
		
		model.addAttribute("categorias",categoriaService.findAll());
		
		List<Bicicleta> bicicletas;
		
		if (idCategoria == null) {
			bicicletas = bicicletaService.mostrarBicicletasAleatorias(NUMBICIS);
			
		}else {
			bicicletas = bicicletaService.findAllByCategoria(idCategoria);
			
		}
		
		model.addAttribute("bicicletas", bicicletas);
		
		return "index";
	}
	*/
	

}

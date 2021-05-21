package com.salesianostriana.dam.controller;




import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import com.salesianostriana.dam.modelo.Bicicleta;
import com.salesianostriana.dam.servicios.BicicletaService;
import com.salesianostriana.dam.servicios.CategoriaService;

import lombok.RequiredArgsConstructor;


@Controller
@RequiredArgsConstructor
public class MainController {
	
	private final BicicletaService bici;
	private final CategoriaService servi;
	
	
	@GetMapping("/")
	public String todasLasBicis(@RequestParam(name="idCategoria", required = false)Long idCategoria, Model model) {
		
		model.addAttribute("categorias", servi.findAll());
		
		List<Bicicleta> bicicletas;
		
		if(idCategoria == null) {
			
			bicicletas = bici.findAll();
		}else {
			bicicletas = (List<Bicicleta>) bici.findById(idCategoria);
			
		}
		model.addAttribute("bicicletas", bicicletas);
		
		return "index";
		
	}
	
}
	
	
package com.salesianostriana.dam.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.salesianostriana.dam.modelo.Bicicleta;
import com.salesianostriana.dam.servicios.BicicletaService;

@Controller
@RequestMapping("/bicicleta")
public class BicicletaController {
	
	@Autowired
	private BicicletaService bicicletaService;
	
	
	
	
	@GetMapping("/")
	public String index(Model model) {
		
		model.addAttribute("bicicleta",bicicletaService.findAll());
		
		return "/listBicicletas";
		
		
		
	}
	
	
	

}

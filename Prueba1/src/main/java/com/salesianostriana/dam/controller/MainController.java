package com.salesianostriana.dam.controller;

import java.time.LocalDate;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.salesianostriana.dam.model.Bicicleta;

@Controller
public class MainController {
	
	@GetMapping({ "/agregar" })
	public String agregar(Model model) {
		
		model.addAttribute("bicicleta",new Bicicleta());
		
		return "Formulario1";
		
	}
}

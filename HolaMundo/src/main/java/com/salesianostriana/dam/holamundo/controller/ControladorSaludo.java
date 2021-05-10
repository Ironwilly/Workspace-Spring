package com.salesianostriana.dam.holamundo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.salesianostriana.dam.model.Persona;

@Controller
public class ControladorSaludo {
	
	@GetMapping("/saludo3")
	//De forma antigua sería @RequestMapping (value="/saludo3", method=RequestMethod.GET)
	public String saludoController3 (Model model){
	model.addAttribute("saludo", "Hola Mundo!!!");  //saludo en este caso es el nombre de la variable
	// model.addAttribute("mensaje","Me llena de orgullo y satisfacción..."); //mensaje es el nombre de la variable
	model.addAttribute("persona",new Persona ("Guillermo ","Ferrari Ferrari"));
	model.addAttribute("url", "https://triana.salesianos.edu"); //url es el nombre de la variable
	return "PlantillaSaludo3";  //se le pone el nombre del archivo html

	}

	

}

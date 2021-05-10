package com.salesianostriana.dam.controladores;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.salesianostriana.dam.servicios.AlumnoService;

@Controller
public class AlumnoController {

	private final AlumnoService servicio;
	
	
	@GetMapping("/alumnos")
	
	public String todosLosAlumnos(Model model) {
		
		model.addAllAttributes("alumnos",servicio.findAll());
		
		return "index";
	}
	
	
	
	//el proyecto este lo sube luismi a su repositorio, este está incompleto
}

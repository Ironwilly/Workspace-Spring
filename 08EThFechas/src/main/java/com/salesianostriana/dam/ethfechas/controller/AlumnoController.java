package com.salesianostriana.dam.ethfechas.controller;

import java.time.LocalDateTime;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.salesianostriana.dam.ethfechas.model.Alumno;
import com.salesianostriana.dam.ethfechas.servicios.AlumnoServicio;

@Controller
public class AlumnoController {
	
	//Inyectamos el objeto del servicio
	private AlumnoServicio alumnoServicio;
	
	public AlumnoController(AlumnoServicio servicio) {
		alumnoServicio = servicio;
	}
	
	@GetMapping("/")
	public String index(Model model) {
		model.addAttribute("alumnos", alumnoServicio.findAll());
		return "list";
	}
	
	@GetMapping("/nuevo")
	public String muestraFormulario(Model model) {
		model.addAttribute("alumno", new Alumno());
		return "form";
	}
	
	@PostMapping("/nuevo/submit")
	public String procesaFormulario(@ModelAttribute("alumno") Alumno alumno) {
		//Obtenemos la fecha actual y se la pasamos al set que la ponga 
		//en el atributo del alumno como fecha del último acceso, ahora es la última vez
		alumno.setFechaUltimoAcceso(LocalDateTime.now());
		alumnoServicio.save(alumno);
		//Rediregimos al controlador index para que muestre el listado de 
		//alumnos con el que se acaba de añadir  
		return "redirect:/";  // esto sirve para llevarnos a otro controller, en este caso al index, pero ya actualizado
	}

}

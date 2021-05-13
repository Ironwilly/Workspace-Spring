package com.salesianostriana.dam.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.salesianostriana.dam.servicio.BarServicio;

import lombok.RequiredArgsConstructor;

@Controller
@RequiredArgsConstructor
public class BarController {
	
	private final BarServicio barServicio;
	
	@GetMapping("/")
	public String todosLosBares(Model model ) {
		
		model.addAllAttributes("bares",barServicio.findAll());
		
		return "index";
	}

}

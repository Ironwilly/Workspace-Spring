package com.salesianostriana.dam.ejerciciodao;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Controller;

import lombok.RequiredArgsConstructor;

@Controller
@RequiredArgsConstructor

public class PseudoMain {
	
	
	
	
private final ISaludator saludador;
	
	
	@PostConstruct
	public void run() {
	
		System.out.println(saludador.saludar());
		
		System.out.println(saludador.saludar("Luismi"));

}

}
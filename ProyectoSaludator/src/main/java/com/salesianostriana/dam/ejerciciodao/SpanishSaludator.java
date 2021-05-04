package com.salesianostriana.dam.ejerciciodao;

import org.springframework.stereotype.Component;


@Component
public class SpanishSaludator implements ISaludator{
	
	@Override
	public String saludar() {
		return "Hola Mundo";
	}

	@Override
	public String saludar(String nombre) {
		return String.format("Hola, %s", nombre);
	}

}

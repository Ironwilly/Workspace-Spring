package com.salesianostriana.dam.modelo;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class Bicicleta {
	
	
	//atributos
	
	private String marca;
	private String modelo;
	private LocalDate year;
	private boolean hombre;
	private boolean mujer;
	private String talla;
	private double precio;
	
	
	public Bicicleta(String marca, String modelo) {
		super();
		this.marca = marca;
		this.modelo = modelo;
	}

}


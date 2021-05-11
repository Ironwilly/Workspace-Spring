package com.salesianostriana.dam.model;

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

}

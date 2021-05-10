package com.salesianostriana.dam.model;

import javax.persistence.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;



@Data
@AllArgsConstructor
@NoArgsConstructor
public class Persona {

	private String nombre;
	private String apellidos;
	
	
}

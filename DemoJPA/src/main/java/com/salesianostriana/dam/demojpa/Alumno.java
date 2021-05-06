package com.salesianostriana.dam.demojpa;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity //anotacion basica jpa
public class Alumno {
	
	@Id //jpa
	@GeneratedValue //jpa
	private long id;
	
	private String nombre, apellidos ;
	
	// con esto solo se crea una tabla bbdd

}

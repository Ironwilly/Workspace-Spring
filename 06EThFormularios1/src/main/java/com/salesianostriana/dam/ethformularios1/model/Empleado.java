package com.salesianostriana.dam.ethformularios1.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data @NoArgsConstructor @AllArgsConstructor
public class Empleado {

	
	@Id
	@GeneratedValue
    private long id;
	private String nombre;
    private String email;
    
	public Empleado(String nombre, String email) {
		this.nombre = nombre;
		this.email = email;
	}
    
   
	
}

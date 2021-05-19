package com.salesianostriana.dam.modelo;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Categoria {
	
	
	@Id
	@GeneratedValue
	private long id;
	private String nombre;
	
	
	@OneToMany(mappedBy = "categoria",cascade=CascadeType.ALL, orphanRemoval=true, fetch=FetchType.EAGER)
	private List<Bicicleta> bicicletas;
	
	@ManyToOne
	private Categoria categoria;

	public Categoria(String nombre) {
		super();
		this.nombre = nombre;
		
	}
	
	

}

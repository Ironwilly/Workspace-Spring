package com.salesianostriana.dam.modelo;


import java.time.LocalDate;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Bicicleta {
	
	
	//atributos
	
	@Id
	@GeneratedValue
	private long id;	
	
	private String marcaModelo;
	
	@Lob
	private String descripcion;
	
	private String year;
	private boolean hombre;
	private boolean mujer;
	private String talla;
	private double precio;
	
	private String imagen;
	
	


	@ManyToOne
	private Categoria categoria;
	
	
	
	
	
	//Constructor
	
	
		public Bicicleta(String marcaModelo, String descripcion, String year, boolean hombre, boolean mujer,
				String talla, double precio, String imagen, Categoria categoria) {
			super();
			this.marcaModelo = marcaModelo;
			this.descripcion = descripcion;
			this.year = year;
			this.hombre = hombre;
			this.mujer = mujer;
			this.talla = talla;
			this.precio = precio;
			this.imagen = imagen;
			this.categoria = categoria;
		}
	
	
	
	
}

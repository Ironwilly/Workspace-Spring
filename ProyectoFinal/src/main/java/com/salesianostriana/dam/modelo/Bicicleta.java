package com.salesianostriana.dam.modelo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor

public class Bicicleta {

	// atributos

	@Id
	@GeneratedValue
	private long id;

	private String marcaModelo;

	@Lob
	private String descripcion;

	private String year;
	private String hombre;
	private String mujer;
	private String talla;
	private double precio;

	private String imagen;

	@ManyToOne
	private Categoria categoria;

	// Constructores
	
	public Bicicleta(String marcaModelo, String descripcion, String year, String hombre, String mujer, String talla,
			double precio, String imagen) {
		super();
		this.marcaModelo = marcaModelo;
		this.descripcion = descripcion;
		this.year = year;
		this.hombre = hombre;
		this.mujer = mujer;
		this.talla = talla;
		this.precio = precio;
		this.imagen = imagen;
		
	}

	public Bicicleta(String marcaModelo, String descripcion, String year, String hombre, String mujer, String talla,
			double precio, String imagen, Categoria categoria) {
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

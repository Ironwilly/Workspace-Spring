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

// TODO: Auto-generated Javadoc
/**
 * The Class Bicicleta.
 */
@Entity

/**
 * Gets the categoria.
 *
 * @return the categoria
 */
@Getter

/**
 * Sets the categoria.
 *
 * @param categoria the new categoria
 */
@Setter

/**
 * Instantiates a new bicicleta.
 */
@NoArgsConstructor

public class Bicicleta {

	// atributos

	/** The id. */
	@Id
	@GeneratedValue
	private long id;

	/** The marca modelo. */
	private String marcaModelo;

	/** The descripcion. */
	@Lob
	private String descripcion;

	/** The year. */
	private String year;
	
	/** The hombre. */
	private String hombre;
	
	/** The mujer. */
	private String mujer;
	
	/** The talla. */
	private String talla;
	
	/** The precio. */
	private double precio;

	/** The imagen. */
	private String imagen;

	/** The categoria. */
	@ManyToOne
	private Categoria categoria;

	// Constructores
	
	/**
	 * Instantiates a new bicicleta.
	 *
	 * @param marcaModelo the marca modelo
	 * @param descripcion the descripcion
	 * @param year the year
	 * @param hombre the hombre
	 * @param mujer the mujer
	 * @param talla the talla
	 * @param precio the precio
	 * @param imagen the imagen
	 */
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

	/**
	 * Instantiates a new bicicleta.
	 *
	 * @param marcaModelo the marca modelo
	 * @param descripcion the descripcion
	 * @param year the year
	 * @param hombre the hombre
	 * @param mujer the mujer
	 * @param talla the talla
	 * @param precio the precio
	 * @param imagen the imagen
	 * @param categoria the categoria
	 */
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

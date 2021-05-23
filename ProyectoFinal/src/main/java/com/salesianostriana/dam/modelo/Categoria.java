package com.salesianostriana.dam.modelo;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import org.apache.commons.lang3.builder.ToStringExclude;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

// TODO: Auto-generated Javadoc
/**
 * The Class Categoria.
 */
@Entity

/**
 * To string.
 *
 * @return the java.lang. string
 */
@Data

/**
 * Instantiates a new categoria.
 */
@NoArgsConstructor

/**
 * Instantiates a new categoria.
 *
 * @param id the id
 * @param nombre the nombre
 * @param bicicletas the bicicletas
 */
@AllArgsConstructor
public class Categoria {
	
	
	/** The id. */
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	
	/** The nombre. */
	private String nombre;
	
	/**
	 * Instantiates a new categoria.
	 *
	 * @param nombre the nombre
	 */
	public Categoria(String nombre) {
		super();
		this.nombre = nombre;
		
	}
	
	/** The bicicletas. */
	@EqualsAndHashCode.Exclude
	@ToStringExclude
	@OneToMany(mappedBy = "categoria", fetch=FetchType.EAGER)
	private List<Bicicleta> bicicletas = new ArrayList<>();
	

	
	
	/**
	 * Adds the bicicleta.
	 *
	 * @param bi the bi
	 */
	public void addBicicleta(Bicicleta bi) {
		
		this.bicicletas.add(bi);
		bi.setCategoria(this);
	}
	
	/**
	 * Removes the bicicleta.
	 *
	 * @param bi the bi
	 */
	public void removeBicicleta(Bicicleta bi) {
		
		this.bicicletas.remove(bi);
		bi.setCategoria(null);
	}
	

}

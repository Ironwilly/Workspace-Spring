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

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Categoria {
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	private String nombre;
	
	public Categoria(String nombre) {
		super();
		this.nombre = nombre;
		
	}
	
	@EqualsAndHashCode.Exclude
	@ToStringExclude
	@OneToMany(mappedBy = "categoria", fetch=FetchType.EAGER)
	private List<Bicicleta> bicicletas = new ArrayList<>();
	

	
	
	public void addBicicleta(Bicicleta bi) {
		
		this.bicicletas.add(bi);
		bi.setCategoria(this);
	}
	
	public void removeBicicleta(Bicicleta bi) {
		
		this.bicicletas.remove(bi);
		bi.setCategoria(null);
	}
	

}

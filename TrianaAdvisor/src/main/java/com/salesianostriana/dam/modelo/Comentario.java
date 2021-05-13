package com.salesianostriana.dam.modelo;

import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
public class Comentario {

	
	@Id
	@GeneratedValue
	private Long id;
	private String texto;
	private int valoracion;
	private LocalDateTime fecha = LocalDateTime.now();
	
	
	


	public Comentario(String texto, int valoracion, LocalDateTime fecha, List<Comentario> comentarios) {
		super();
		this.texto = texto;
		this.valoracion = valoracion;
		this.fecha = fecha;
		this.comentarios = comentarios;
	}


	public Comentario(String texto, int valoracion) {
		super();
		this.texto = texto;
		this.valoracion = valoracion;
	}
	
	
	
	
	
}

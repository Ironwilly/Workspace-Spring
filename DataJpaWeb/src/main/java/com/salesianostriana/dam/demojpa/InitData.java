package com.salesianostriana.dam.demojpa;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Component;

import com.salesianostriana.dam.modelo.Alumno;
import com.salesianostriana.dam.repo.IAlumnoRepository;
import com.salesianostriana.dam.servicios.AlumnoService;

import lombok.RequiredArgsConstructor;

@Component
@RequiredArgsConstructor
public class InitData {
	
	
	private final AlumnoService servicio;

	@PostConstruct
	public void init() {
		
		Alumno a = new Alumno("Guillermo","Ferrari");
		Alumno b = new Alumno("Guillermo","Ferrari");
		Alumno c = new Alumno("Guillermo","Ferrari");

		
		repository.save(a);
		repository.save(b);
		repository.save(c);
	}
	
	
}

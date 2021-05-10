package com.salesianostriana.dam.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.salesianostriana.dam.modelo.Alumno;

public interface IAlumnoRepository extends JpaRepository<Alumno, Long> {
	
	

}

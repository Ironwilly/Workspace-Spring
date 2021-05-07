package com.salesianostriana.dam.primerproyectodatajpa.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import com.salesianostriana.dam.primerproyectodatajpa.modelo.Alumno;

public interface IAlumnoRepository extends JpaRepository<Alumno, Long>{

}

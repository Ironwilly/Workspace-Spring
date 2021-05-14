package com.salesianostriana.dam.ethfechas.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import com.salesianostriana.dam.ethfechas.model.Alumno;


/* Interfaz que extiende de JpaReporitory.
 * Esta última es una interfaz del framework Spring data que contiene 
 * métodos como findAll, getOne... Y que ya habéis visto con Luismi
 * Podéis consultar más en 
 * https://docs.spring.io/spring-data/jpa/docs/current/api/org/springframework/data/jpa/repository/JpaRepository.html
 * Por tanto, nuestra interfaz AlumnoRepository, hereda todos esos métodos 
 * que implementaremos en el servicio */

public interface AlumnoRepository extends JpaRepository <Alumno, Long>{

}

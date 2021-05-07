package com.salesianostriana.dam.primerproyectodatajpa;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.salesianostriana.dam.primerproyectodatajpa.modelo.Alumno;
import com.salesianostriana.dam.primerproyectodatajpa.repositorios.IAlumnoRepository;

@SpringBootApplication
public class Ec04IntroSpringDataJpaApplication {

	public static void main(String[] args) {
		SpringApplication.run(Ec04IntroSpringDataJpaApplication.class, args);
	}
	
	@Bean
	public CommandLineRunner init(IAlumnoRepository repo) {
		
		return args -> {
			repo.save(new Alumno("Luis Miguel","López Magaña","luismi.lopez@salesianos.edu"));
			repo.save(new Alumno("Ángel","Naranjo González","angel.naranjo@salesianos.edu"));
			repo.save(new Alumno("Rafael", "Villar Liñán", "rafael.villar@salesianos.edu"));
			
			repo.findAll().forEach(System.out::println);
			
		};//end return
	
	} // end commandliner

}

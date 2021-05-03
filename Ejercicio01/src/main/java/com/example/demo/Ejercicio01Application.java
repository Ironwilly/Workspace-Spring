package com.example.demo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Ejercicio01Application {

	public static void main(String[] args) {
		SpringApplication.run(Ejercicio01Application.class, args);
		
		
		
		
		
	}
	
	@Bean
	public CommandLineRunner pruebaLombok() {
		return args -> {
			
			Persona per1 = new Persona();
			
			per1.setNombre("Guillermo");
			per1.setApellidos("Ferrari Ferrari");
			per1.setDNI("66554433q");
			
			System.out.println(per1);
		};
		
	}

}

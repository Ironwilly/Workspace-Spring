package com.salesianostriana.dam.modelo;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Alumno {

	private long id;
	private String nombre, apellidos, email ;
	private  LocalDate fechaNacimiento;
	
	
	public int getEdad() {
		
		return ChronoUnit.YEARS.between(fechaNacimiento, LocalDate.now().with((TemporalAdjusters.lastDayOfYear()));
		
	}
	
}

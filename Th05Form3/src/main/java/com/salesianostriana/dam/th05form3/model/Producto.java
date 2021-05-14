package com.salesianostriana.dam.th05form3.model;

import java.time.LocalDate;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data @NoArgsConstructor
@AllArgsConstructor
public class Producto {

	private long id;

	private String name;

	private String description;

	private double price;
	
	
	//Atributo para el tipo de cerveza. Aunque se trabajará con él usando radioButtons, 
	//lo usamos con tipo String que es lo que devuelven estos radios al ser marcados
	private String tipo;
	
	/*Ojo, el formato de la anotación debe ser inglés, años, mes y día.
	 * esta anotación es la que hace que la fecha recogida por el input tipo date
	 * pase al controlador y este la pase a tipo Date. En el controlador, podemos ver cómo
	 * se tienen en cuenta esta "validación" de datos, es decir, que no se admitan fechas con otro formato*/
	
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private LocalDate FCaducidad;




}

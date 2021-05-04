package com.salesianostriana.dam.primerproyectomaven;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UnaClase {
	
	
	private  String prop1; 
	
	@ToString.Exclude   //exluye el tostring de prop2
	private int prop2;
	

}

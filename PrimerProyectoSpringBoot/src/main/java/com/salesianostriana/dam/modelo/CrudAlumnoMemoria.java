package com.salesianostriana.dam.modelo;

import java.util.ArrayList;
import java.util.List;

public class CrudAlumnoMemoria implements ICrudAlumno{
	
	
	List<Alumno> lista;
	
	public CrudAlumnoMemoria( ) {
		lista = new ArrayList<>();
		
		
	}
	
	private int indexOf (long id )´
	int result = -1 ;
	boolean encontrado = false ;
	int i=0;
	while (!encontrado) {
		if (lista.get(i).getId()== id) {
			encontrado = true;
					result =i;
			
		}else 
			i++;
	}

	return result;
}

	@Override
	public void imprimirLista() {
		// TODO Auto-generated method stub
		
	}

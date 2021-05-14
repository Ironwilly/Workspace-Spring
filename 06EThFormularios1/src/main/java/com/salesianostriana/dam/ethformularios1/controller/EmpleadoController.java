package com.salesianostriana.dam.ethformularios1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import com.salesianostriana.dam.ethformularios1.model.Empleado;


@Controller
public class EmpleadoController {

	/*Para los formularios necesitamos siempre dos métodos controladores:
	 * Uno para VER (petición tipo Get) los datos del formulario (para pintar el formulario al comienzo del proceso
	 * antes de hacer nada, si es de alta, por ejemplo, estará vacío, como en este caso) y otro para
	 * GESTIONAR (Petición tipo Post) los datos del formulario.
	 * Necesitamos que sea post, porque vamos a "mandar" datos en la petición, los recogidos de los 
	 * campos del formulario
	 * */
	
	
	/*Este primer método solo muestra el formulario y es igual a los que ya hemos usado en otras ocasiones
	 * un Model al que añadimos una instancia de nuestra clase modelo tipo Empleado
	 * sin ningún valor por eso está vacío, petición tipo Get
	 * Atendrá a peticiones con la ruta empleado*/
	
	@GetMapping ("/empleado")
	public String showForm(Model model) {
		
		//Creado aquí solo para el ejemplo y vacío porque es el que se usa para pintar el formulario sin datos
		//El formulario que estamos creando es de alta
		Empleado empleado = new Empleado(); 		
		model.addAttribute("empleadoForm", empleado);
		
		return "form";
		
	}

	/* Para la petición tipo Post (ojo, se anota con @PostMapping y la ruta
	 * Este método gestionará los datos que se introduzcan en el formulario recogiendo los datos de los diferentes campos.
	 * Para ello añadimos la anotación @ModelAttribute como parámetro del método para decirle de qué formulario 
	 * debe coger los datos (el mismo nombre que se escribe en el th:object del form en la plantilla)
	 * y "crear" un Empleado, de ahí el Empleado empleado
	 * Se le pasa también el model como siempre*/
	
	@PostMapping ("/addEmpleado")
	public String submit(@ModelAttribute("empleadoForm") Empleado empleado,  Model model) {

		//Se añade al modelo, el empleado que se creará al recoger los datos del formulario
		model.addAttribute("empleado", empleado);
		//Se muestra la página con la información mandada en el formulario al pulsar el botón submit
		return "view";
	}
	
}

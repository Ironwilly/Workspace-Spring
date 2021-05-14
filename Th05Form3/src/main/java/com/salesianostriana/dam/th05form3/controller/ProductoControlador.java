package com.salesianostriana.dam.th05form3.controller;



import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.salesianostriana.dam.th05form3.model.Producto;

@Controller
public class ProductoControlador {

	
	@GetMapping("/producto")
	public String showFormProducto(Model model) {

		Producto producto = new Producto();
		model.addAttribute("productoForm", producto);

		//Creamos un array de String para los tipos de cerveza. Nos servirá para trabajar con radiobuttons en la vista y recoger 
		//lo que el usuario pincha
		
		String[] tipos = new String[] { "Lager", "Pilsen", "Guiness" };

		model.addAttribute("tipos", tipos);

		return "formProducto";
	}
	
	@PostMapping("/addProducto")
	public String submit(@ModelAttribute("productoForm") Producto producto, Model model) {
		
			model.addAttribute("producto", producto);
			return "view";			
	}		
	
}

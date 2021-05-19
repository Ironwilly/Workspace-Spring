package com.salesianostriana.dam.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.salesianostriana.dam.modelo.Categoria;
import com.salesianostriana.dam.servicios.BicicletaService;
import com.salesianostriana.dam.servicios.CategoriaService;

@Controller
@RequestMapping("/login/bike")
public class CategoriaController {

	
	@Autowired
	private CategoriaService categoriaService;
	
	@Autowired
	private BicicletaService bicicletaService;
	
	
	@GetMapping("/")
	public String index(Model model) {
		
		model.addAttribute("categorias",categoriaService.findAll());
		return "listCategorias";
	}
	
	@GetMapping("/new")
	public String newCategoria(Model model) {
		
		model.addAttribute("categoria", new Categoria());
		return "formulario1";
	}
	
	@PostMapping("/new/refresh")
	public String newCategoriaRefresh(@ModelAttribute("categoria")Categoria categoria, Model model) {
		
		categoriaService.save(categoria);
		
		return "redirect:/login/bike/";
	}
	
	
}

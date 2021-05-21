package com.salesianostriana.dam.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.salesianostriana.dam.baseServicio.BaseService;
import com.salesianostriana.dam.modelo.Bicicleta;
import com.salesianostriana.dam.repositorios.BicicletaRepository;
import com.salesianostriana.dam.servicios.BicicletaService;
import com.salesianostriana.dam.servicios.CategoriaService;

import lombok.RequiredArgsConstructor;

@Controller

@RequiredArgsConstructor
public class BicicletaController {
	
	
	@Autowired
	private final BicicletaService bicicletaService;
	
	@Autowired
	private CategoriaService categoriaService;
	
	
	
	
	@GetMapping("/nueva")
	public String nuevaBicicleta(Model model) {
		model.addAttribute("bicicleta", new Bicicleta());
		
		model.addAttribute("categorias", categoriaService.findAll());
		
		return "agregarBici";
	}
	
	@PostMapping("/nueva/refresh")
	public String refreshNuevaBici(@ModelAttribute("bicicleta")Bicicleta bicicleta, Model model) {
		
		bicicletaService.save(bicicleta);
		
		return "redirect:/";
	}
	
	
	@GetMapping("/editarBici/{id}")
	public String editarBici(@PathVariable("id")Long id,Model model) {
		
		Bicicleta bicicleta = bicicletaService.findById(id);
		
		if (bicicleta != null) {
			model.addAttribute("bicicleta", bicicleta);
			model.addAttribute("categorias", categoriaService.findAll());
			
			return "agregarBici";
		}else {
			return "redirect:/";
		}
	}
	
	
	
	@GetMapping("/borrar/{id}")
	public String borrarBici(@PathVariable("id") Long id,Model model) {
		
		Bicicleta bicicleta = bicicletaService.findById(id);
		
		if (bicicleta != null) {
			bicicletaService.delete(bicicleta);
		}
		
		return "redirect:/";
		
	}
	
	
}
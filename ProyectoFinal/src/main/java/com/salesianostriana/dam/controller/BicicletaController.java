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

// TODO: Auto-generated Javadoc
/**
 * The Class BicicletaController.
 */
@Controller

/**
 * Instantiates a new bicicleta controller.
 *
 * @param bicicletaService the bicicleta service
 */
@RequiredArgsConstructor
public class BicicletaController {
	
	
	/** The bicicleta service. */
	@Autowired
	private final BicicletaService bicicletaService;
	
	/** The categoria service. */
	@Autowired
	private CategoriaService categoriaService;
	
	
	
	
	/**
	 * Nueva bicicleta.
	 *
	 * @param model the model
	 * @return the string
	 */
	@GetMapping("/nueva")
	public String nuevaBicicleta(Model model) {
		model.addAttribute("bicicleta", new Bicicleta());
		
		model.addAttribute("categorias", categoriaService.findAll());
		
		return "agregarBici";
	}
	
	/**
	 * Refresh nueva bici.
	 *
	 * @param bicicleta the bicicleta
	 * @param model the model
	 * @return the string
	 */
	@PostMapping("/nueva/refresh")
	public String refreshNuevaBici(@ModelAttribute("bicicleta")Bicicleta bicicleta, Model model) {
		
		bicicletaService.save(bicicleta);
		
		return "redirect:/";
	}
	
	
	/**
	 * Editar bici.
	 *
	 * @param id the id
	 * @param model the model
	 * @return the string
	 */
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
	
	
	
	/**
	 * Borrar bici.
	 *
	 * @param id the id
	 * @param model the model
	 * @return the string
	 */
	@GetMapping("/borrar/{id}")
	public String borrarBici(@PathVariable("id") Long id,Model model) {
		
		Bicicleta bicicleta = bicicletaService.findById(id);
		
		if (bicicleta != null) {
			bicicletaService.delete(bicicleta);
		}
		
		return "redirect:/";
		
	}
	
	
}
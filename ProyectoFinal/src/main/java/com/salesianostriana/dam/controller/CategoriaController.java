package com.salesianostriana.dam.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.salesianostriana.dam.modelo.Categoria;
import com.salesianostriana.dam.servicios.BicicletaService;
import com.salesianostriana.dam.servicios.CategoriaService;

import lombok.Getter;
import lombok.Setter;

// TODO: Auto-generated Javadoc
/**
 * The Class CategoriaController.
 */
@Controller

/**
 * Gets the categoria service.
 *
 * @return the categoria service
 */
@Getter

/**
 * Sets the categoria service.
 *
 * @param categoriaService the new categoria service
 */
@Setter
public class CategoriaController {

	/** The bicicleta service. */
	@Autowired
	private BicicletaService bicicletaService;

	/** The categoria service. */
	@Autowired
	private CategoriaService categoriaService;

	/**
	 * Agregar categoria.
	 *
	 * @param model the model
	 * @return the string
	 */
	@GetMapping("/nuevaCategoria")
	public String agregarCategoria(Model model) {

		model.addAttribute("categoria", new Categoria());

		return "agregarCategoria";
	}

	/**
	 * Refresh categoria.
	 *
	 * @param categoria the categoria
	 * @param model the model
	 * @return the string
	 */
	@PostMapping("/nueva/categoria/refresh")
	public String refreshCategoria(@ModelAttribute("categoria") Categoria categoria, Model model) {

		categoriaService.save(categoria);

		return "redirect:/";

	}

	/**
	 * Editar categoria.
	 *
	 * @param id the id
	 * @param model the model
	 * @return the string
	 */
	@GetMapping("/editar/categoria/{id}")
	public String editarCategoria(@PathVariable("id") Long id, Model model) {

		Categoria categoria = categoriaService.findById(id);

		if (categoria != null) {
			model.addAttribute("categoria", categoria);

			return "agregarCategoria";

		} else {

			return "redirect:/";
		}

	}

	/**
	 * Borrar categoria.
	 *
	 * @param id the id
	 * @param model the model
	 * @return the string
	 */
	@GetMapping("/borrarCategoria/{id}")
	public String borrarCategoria(@PathVariable("id") Long id, Model model) {

		Categoria categoria = categoriaService.findById(id);

		if (categoria != null) {
			if(bicicletaService.numeroBicicletaCategoria(categoria)==0) {
				categoriaService.delete(categoria);
			}else {
				return "redirect:/?error=true";
			}
			
		}

		return "redirect:/";

	}

}

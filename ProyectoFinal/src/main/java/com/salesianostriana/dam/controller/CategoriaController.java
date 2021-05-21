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

@Controller

public class CategoriaController {

	@Autowired
	private BicicletaService bicicletaService;

	@Autowired
	private CategoriaService categoriaService;

	@GetMapping("/nuevaCategoria")
	public String agregarCategoria(Model model) {

		model.addAttribute("categoria", new Categoria());

		return "agregarCategoria";
	}

	@PostMapping("/nueva/categoria/refresh")
	public String refreshCategoria(@ModelAttribute("categoria") Categoria categoria, Model model) {

		categoriaService.save(categoria);

		return "redirect:/";

	}

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

	@GetMapping("/borrarCategoria/{id}")
	public String borrarCategoria(@PathVariable("id") Long id, Model model) {

		Categoria categoria = categoriaService.findById(id);

		if (categoria != null) {
			categoriaService.delete(categoria);
		}

		return "redirect:/";

	}

}

package com.salesianostriana.dam.controller;




import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import com.salesianostriana.dam.modelo.Bicicleta;
import com.salesianostriana.dam.servicios.BicicletaService;
import com.salesianostriana.dam.servicios.CategoriaService;

import lombok.RequiredArgsConstructor;


// TODO: Auto-generated Javadoc
/**
 * The Class MainController.
 */
@Controller

/**
 * Instantiates a new main controller.
 *
 * @param bici the bici
 * @param servi the servi
 */
@RequiredArgsConstructor
public class MainController {
	
	/** The bici. */
	private final BicicletaService bici;
	
	/** The servi. */
	private final CategoriaService servi;
	
	
	/**
	 * Todas las bicis.
	 *
	 * @param idCategoria the id categoria
	 * @param model the model
	 * @return the string
	 */
	@GetMapping("/")
	public String todasLasBicis(@RequestParam(name="idCategoria", required = false)Long idCategoria, Model model) {
		
		model.addAttribute("categorias", servi.findAll());
		
		List<Bicicleta> bicicletas;
		
		if(idCategoria == null) {
			
			bicicletas = bici.findAll();
		}else {
			bicicletas =  bici.findByCategoriaId(idCategoria);
			
		}
		model.addAttribute("bicicletas", bicicletas);
		
		return "index";
		
	}
	
}
	
	
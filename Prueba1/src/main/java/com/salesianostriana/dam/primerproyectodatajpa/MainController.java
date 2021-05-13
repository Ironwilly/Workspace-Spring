package com.salesianostriana.dam.primerproyectodatajpa;

import java.time.LocalDate;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {
	
	@GetMapping("/agregar")
	public String agregar(Model model) {
		
		model.addAttribute("bicicleta",new Bicicleta("Lapierre","Zesty"));
		
		return "Formulario1";
		
		
		
	}
	
	@GetMapping({"/","index"})
	public String inicial(@RequestParam(name="gustan",required = false,defaultValue = "modelos")String gustan,Model model) {
		
		
		model.addAttribute("gustan",gustan);
		return "index";
	}
}

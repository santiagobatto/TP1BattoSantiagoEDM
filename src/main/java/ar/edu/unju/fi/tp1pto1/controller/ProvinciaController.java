package ar.edu.unju.fi.tp1pto1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import ar.edu.unju.fi.tp1pto1.model.Provincia;

@Controller

public class ProvinciaController {
	
// Provincia unaProvincia = new Provincia();
	@Autowired
	Provincia unaProvincia;
	
	@GetMapping({"/provincia"})
	public String cargarProvincia(Model model) {
		unaProvincia.setNombre("Jujuy Argentina");
		model.addAttribute("santiago", unaProvincia);
		return "provincia";
	}
	
}

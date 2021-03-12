package com.cristianduarte.seguridadlaboral.app.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cristianduarte.seguridadlaboral.app.dao.IPersonaDao;
import com.cristianduarte.seguridadlaboral.app.models.entity.Persona;

@Controller
public class PersonaController {
	
	@Autowired
	private IPersonaDao personaDao;

	@RequestMapping(value = "/persona")
	public String metodoController(Model model) {
		
		model.addAttribute("titulo", "Listado de personas");
		model.addAttribute("personas", personaDao.findAll());
		
		return "vista";
	}
	
	@GetMapping(value="/registrarpersona")
	public String crear(Model model){
		
		Persona persona = new Persona();
		
		model.addAttribute("titulo", "Registrar persona");
		model.addAttribute("persona", persona);
		System.out.println(persona.getId());
		
		return "registroPersona";
	}

	@PostMapping(value="/registrarpersona")
	public String registrar(Persona persona, Model model) {
		
		personaDao.save(persona);
		
		return "redirect:persona";
	}
}

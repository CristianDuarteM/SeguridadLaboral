package com.cristianduarte.seguridadlaboral.app.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cristianduarte.seguridadlaboral.app.dao.IPersonaDao;

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

}

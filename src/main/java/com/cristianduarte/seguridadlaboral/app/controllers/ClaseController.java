package com.cristianduarte.seguridadlaboral.app.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ClaseController {
	
	
	@RequestMapping(value="/prueba")
	public String metodoController(){
		return "vista";
	}

}

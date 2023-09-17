package com.proyecto.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class EnlaceController {

	//Registro
	@RequestMapping("/")
	public String verLogin() {	return "intranetLogin";  }
	
	@RequestMapping("/verCrudPrestamistaGeneral")
	public String verCrudPrestamistaGeneral() {	return "intranetCrudPrestamistaGeneral";  }

	@RequestMapping("/verCrudPrestamistaGrupal")
	public String verCrudPrestamistaGrupal() {	return "intranetCrudPrestamistaGrupal";  }
	
	@RequestMapping("/verSolcicitoPrestamo")
	public String verSolcicitoPrestamo() {	return "intranetSolcicitoPrestamo";  }

}

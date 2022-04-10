package com.proyecto.controller;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.proyecto.entidad.Reclamo;
import com.proyecto.service.ReclamoService;

@Controller
public class ReclamoRegistraController {
	
	
	@Autowired
	private ReclamoService service;
	
	@RequestMapping("/registroReclamo")
	@ResponseBody
	public HashMap<String, Object> registroReclamo(Reclamo obj){
		HashMap<String, Object> salida = new HashMap<>();
		try {
			Reclamo objSalida =  service.insertaReclamo(obj);
			if (objSalida == null) {
				salida.put("mensaje", "Error en el registro");
			}else {
				salida.put("mensaje", "Registro exitoso");
			}
		} catch (Exception e) {
			salida.put("mensaje", "Error en el registro");
			e.printStackTrace();
		}
		return salida;
	}

}

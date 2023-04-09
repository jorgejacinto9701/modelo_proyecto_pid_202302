package com.proyecto.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class EnlaceController {

	//Registro
	@RequestMapping("/")
	public String verLogin() {	return "intranetLogin";  }
	
	@RequestMapping("/verAgregarCuenta")
	public String verAgregarCuenta() {	return "intranetAgregarCuenta";  }

	@RequestMapping("/verAgregarDepositos")
	public String verAgregarDepositos() {	return "intranetAgregarDepositos";  }
	
	@RequestMapping("/verDashboard")
	public String verDashboard() {	return "intranetDashboard";  }
	
	@RequestMapping("/verOportunidades")
	public String verOportunidades() {	return "intranetOportunidades";  }
	
	@RequestMapping("/verCapitalista")
	public String verCapitalista() {	return "intranetCapitalista";  }
	
	@RequestMapping("/verCuentas")
	public String verCuentas() {	return "intranetCuentas";  }
	
	@RequestMapping("/verDepositosRetiros")
	public String verDepositosRetiros() {	return "intranetDepositosRetiros";  }
	
	@RequestMapping("/verEmpresas")
	public String verEmpresas() {	return "intranetEmpresas";  }
	
	@RequestMapping("/verBancos")
	public String verBancos() {	return "intranetBancos";  }
}

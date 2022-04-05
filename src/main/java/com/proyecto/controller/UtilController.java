package com.proyecto.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.proyecto.entidad.Cliente;
import com.proyecto.entidad.Marca;
import com.proyecto.entidad.Pais;
import com.proyecto.entidad.TipoReclamo;
import com.proyecto.entidad.Ubigeo;
import com.proyecto.service.ClienteService;
import com.proyecto.service.MarcaService;
import com.proyecto.service.PaisService;
import com.proyecto.service.TipoReclamoService;
import com.proyecto.service.UbigeoService;

@Controller
public class UtilController {

	@Autowired
	private PaisService paisServicio;

	@Autowired
	private MarcaService marcaServicio;

	@Autowired
	private ClienteService clienteServicio;

	@Autowired
	private TipoReclamoService tipoReclamoServicio;

	@Autowired
	private UbigeoService ubigeoServicio;

	@ResponseBody
	@RequestMapping("/listaCliente")
	public List<Cliente> listaCliente() {
		return clienteServicio.listaCliente();
	}

	@ResponseBody
	@RequestMapping("/listaTipoReclamo")
	public List<TipoReclamo> listaTipoReclamo() {
		return tipoReclamoServicio.listaTipoReclamo();
	}

	@ResponseBody
	@RequestMapping("/listaPais")
	public List<Pais> listaPais() {
		return paisServicio.listaPais();
	}

	@ResponseBody
	@RequestMapping("/listaMarca")
	public List<Marca> listaMarca() {
		return marcaServicio.listaMarca();
	}

	@RequestMapping("/listaDepartamentos")
	@ResponseBody
	public List<String> verDepartamentos() {
		return ubigeoServicio.listaDepartamentos();
	}

	@RequestMapping("/listaProvincias")
	@ResponseBody
	public List<String> verProvincias(String departamento) {
		return ubigeoServicio.listaProvincias(departamento);
	}

	@RequestMapping("/listaDistritos")
	@ResponseBody
	public List<Ubigeo> verDistritos(String departamento, String provincia) {
		return ubigeoServicio.listaDistritos(departamento, provincia);
	}
}

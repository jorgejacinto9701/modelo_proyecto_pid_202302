package com.proyecto.service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.proyecto.entidad.Opcion;
import com.proyecto.entidad.Rol;
import com.proyecto.entidad.Usuario;

public interface UsuarioService {

	public abstract Usuario login(Usuario bean);

	public abstract List<Opcion> traerEnlacesDeUsuario(int idUsuario);

	public abstract List<Rol> traerRolesDeUsuario(int idUsuario);

	public Page<Usuario> findAll(Pageable pageable);

	public Usuario findById(int id);

	public Usuario save(Usuario bean);

	public void delete(int id);

}

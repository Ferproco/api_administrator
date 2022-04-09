package com.nkseguridad.app.Service;

import java.util.List;

import com.nkseguridad.app.Entity.UsuarioNegocio;

public interface IUsuarioNegocioService {

	public List<UsuarioNegocio> findAllByIdUsuario(Long id);
}

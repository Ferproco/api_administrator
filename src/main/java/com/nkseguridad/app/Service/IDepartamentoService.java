package com.nkseguridad.app.Service;

import java.util.List;

import com.nkseguridad.app.Entity.Departamento;


public interface IDepartamentoService  {
	
	public List<Departamento> findAll();
	public List<Departamento> findByPais(Long idpais);
	
}

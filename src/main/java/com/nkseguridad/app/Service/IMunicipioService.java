package com.nkseguridad.app.Service;

import java.util.List;

import com.nkseguridad.app.Entity.Municipio;

public interface IMunicipioService {
	
	public List<Municipio> findAll();	
	public List<Municipio> findByCoddepartamento(Long coddepartamento);

}

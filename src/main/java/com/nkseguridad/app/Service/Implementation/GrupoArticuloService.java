package com.nkseguridad.app.Service.Implementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.nkseguridad.app.Entity.GrupoArticulo;

import com.nkseguridad.app.Repository.IGrupoArticuloRepository;
import com.nkseguridad.app.Service.IGrupoArticuloService;

@Service
public class GrupoArticuloService implements IGrupoArticuloService {

	@Autowired
	private IGrupoArticuloRepository grupoArticuloRepository;
	
	
	
	@Override
	public List<GrupoArticulo> findAll() {
		// TODO Auto-generated method stub
		return (List<GrupoArticulo>)grupoArticuloRepository.findAll();
	}

}

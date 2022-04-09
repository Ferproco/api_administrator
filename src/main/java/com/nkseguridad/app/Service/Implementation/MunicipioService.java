package com.nkseguridad.app.Service.Implementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nkseguridad.app.Entity.Municipio;
import com.nkseguridad.app.Repository.IMunicipioRepository;
import com.nkseguridad.app.Service.IMunicipioService;

@Service
public class MunicipioService implements IMunicipioService {

	@Autowired
	private IMunicipioRepository municipioRepository;
	
	@Override
	public List<Municipio> findAll() {
		// TODO Auto-generated method stub
		return (List<Municipio>)municipioRepository.findAll();
	}

	@Override
	public List<Municipio> findByCoddepartamento(Long coddepartamento) {
		// TODO Auto-generated method stub
		return municipioRepository.findByCoddepartamento(coddepartamento);
	}

}

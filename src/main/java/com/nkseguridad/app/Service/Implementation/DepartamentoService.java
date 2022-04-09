package com.nkseguridad.app.Service.Implementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nkseguridad.app.Entity.Departamento;
import com.nkseguridad.app.Repository.IDepartamentoRepository;
import com.nkseguridad.app.Service.IDepartamentoService;

@Service
public class DepartamentoService implements IDepartamentoService{

	
	@Autowired
	private IDepartamentoRepository departamentoRepository;
	
	@Override
	public List<Departamento> findAll() {
		// TODO Auto-generated method stub
		return (List<Departamento>)departamentoRepository.findAll();
	}

	@Override
	public List<Departamento> findByPais(Long codpais) {
		// TODO Auto-generated method stub
		return (List<Departamento>)departamentoRepository.findByCodpais(codpais);
	}

}

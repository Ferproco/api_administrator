package com.nkseguridad.app.Service.Implementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nkseguridad.app.Entity.TipoContribuyente;
import com.nkseguridad.app.Repository.ITipoContribuyenteRepository;
import com.nkseguridad.app.Service.ITipoContribuyenteService;



@Service
public class TipoContribuyenteService implements ITipoContribuyenteService {
	
	@Autowired
	private ITipoContribuyenteRepository tipocontribuyenteRepository;

	@Override
	public List<TipoContribuyente> findAll() {
		// TODO Auto-generated method stub
		return (List<TipoContribuyente>)tipocontribuyenteRepository.findAll();
	}
	
	
}

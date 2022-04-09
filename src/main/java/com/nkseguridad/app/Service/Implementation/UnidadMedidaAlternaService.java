package com.nkseguridad.app.Service.Implementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nkseguridad.app.Entity.UnidadMedidaAlterna;
import com.nkseguridad.app.Repository.IUnidadMedidaAlternaRepository;
import com.nkseguridad.app.Service.IUnidadMedidaAlternaService;

@Service
public class UnidadMedidaAlternaService implements IUnidadMedidaAlternaService {

	
	@Autowired
	private IUnidadMedidaAlternaRepository unidadmedidaRepository;
	
	@Override
	public List<UnidadMedidaAlterna> findAll() {
		// TODO Auto-generated method stub
		return (List<UnidadMedidaAlterna>)unidadmedidaRepository.findAll();
	}

}

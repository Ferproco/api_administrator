package com.nkseguridad.app.Service.Implementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nkseguridad.app.Entity.Unidadmedida;
import com.nkseguridad.app.Repository.IUnidadMedidaRepository;
import com.nkseguridad.app.Service.IUnidadMedidaService;

@Service
public class UnidadMedidaService implements IUnidadMedidaService {


	@Autowired
	private IUnidadMedidaRepository UnidadMedidaRepository;
	
	@Override
	public List<Unidadmedida> findAll() {
		// TODO Auto-generated method stub
		return  (List<Unidadmedida>)UnidadMedidaRepository.findAll();
	}

	@Override
	public Unidadmedida findByCodigo(String abrevunidadmedida) {
		// TODO Auto-generated method stub
		return UnidadMedidaRepository.findById(abrevunidadmedida).orElse(null);
	}

	@Override
	public Unidadmedida save(Unidadmedida unidadmedida) {
		// TODO Auto-generated method stub
		return UnidadMedidaRepository.save(unidadmedida);
	}

	@Override
	public Unidadmedida Update(Unidadmedida unidadmedida) {
		// TODO Auto-generated method stub
		return UnidadMedidaRepository.save(unidadmedida);
	}

	@Override
	public boolean findByExisteCodigo(String abrevunidadmedida) {
		// TODO Auto-generated method stub
		return false;
	}

}

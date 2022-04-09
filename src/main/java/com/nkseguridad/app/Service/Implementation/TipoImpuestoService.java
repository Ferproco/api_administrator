package com.nkseguridad.app.Service.Implementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nkseguridad.app.Entity.TipoImpuesto;
import com.nkseguridad.app.Repository.ITipoImpuestoRepository;
import com.nkseguridad.app.Service.ITipoImpuestoService;

@Service
public class TipoImpuestoService implements ITipoImpuestoService {

	@Autowired
	private ITipoImpuestoRepository tipoimpuestoRepository;
	
	
	@Override
	public List<TipoImpuesto> findAll() {
		// TODO Auto-generated method stub
		return (List<TipoImpuesto>)tipoimpuestoRepository.findAll();
	}


	@Override
	public TipoImpuesto save(TipoImpuesto tipoimpuesto) {
		// TODO Auto-generated method stub
		return tipoimpuestoRepository.save(tipoimpuesto);
	}


	@Override
	public TipoImpuesto findByIdTipoImppuesto(Long id) {
		// TODO Auto-generated method stub
		return tipoimpuestoRepository.findById(id).orElse(null);
	}


	@Override
	public boolean existebyIdTipoImpuesto(Long id) {
		// TODO Auto-generated method stub
		return tipoimpuestoRepository.existsById(id);
	}


	@Override
	public void eliminar(TipoImpuesto tipoimpuesto) {
		// TODO Auto-generated method stub
		tipoimpuestoRepository.delete(tipoimpuesto);
	}

}

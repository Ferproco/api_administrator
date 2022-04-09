package com.nkseguridad.app.Service.Implementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nkseguridad.app.Entity.FormaPago;
import com.nkseguridad.app.Repository.IFormaPagoRepository;
import com.nkseguridad.app.Service.IFormaPagoService;

@Service
public class FormaPagoService implements IFormaPagoService {

	@Autowired
	private IFormaPagoRepository FormaPagoRepository;
	@Override
	public List<FormaPago> findAll() {
		// TODO Auto-generated method stub
		return (List<FormaPago>)FormaPagoRepository.findAll();
	}

	@Override
	public FormaPago findByCodigo(Long codigo) {
		// TODO Auto-generated method stub
		return FormaPagoRepository.findById(codigo).orElse(null);
	}

	@Override
	public boolean existebyCodigo(Long codigo) {
		// TODO Auto-generated method stub
		return FormaPagoRepository.existsById(codigo);
	}

	@Override
	public FormaPago save(FormaPago formapago) {
		// TODO Auto-generated method stub
		
		return FormaPagoRepository.save(formapago);
	}

	@Override
	public void eliminar(FormaPago formapago) {
		// TODO Auto-generated method stub
	   FormaPagoRepository.delete(formapago);
	}

}

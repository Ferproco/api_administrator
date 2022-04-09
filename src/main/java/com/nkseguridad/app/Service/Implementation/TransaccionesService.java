package com.nkseguridad.app.Service.Implementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nkseguridad.app.Entity.Transacciones;
import com.nkseguridad.app.Repository.ITransaccionesRepository;
import com.nkseguridad.app.Service.ITransaccionesService;

@Service
public class TransaccionesService implements ITransaccionesService {

	@Autowired 
	private ITransaccionesRepository transaccionRepository;
	
	@Override
	public List<Transacciones> findAll() {
		// TODO Auto-generated method stub
		return (List<Transacciones>)transaccionRepository.findAll();
	}

	@Override
	public Transacciones save(Transacciones transaccion) {
		// TODO Auto-generated method stub
		return transaccionRepository.save(transaccion);
	}

	@Override
	public boolean findByExisteCodigo(Long codigo) {
		// TODO Auto-generated method stub
		return false;
	}

}

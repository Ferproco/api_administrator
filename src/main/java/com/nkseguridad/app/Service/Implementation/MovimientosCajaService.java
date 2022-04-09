package com.nkseguridad.app.Service.Implementation;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nkseguridad.app.Entity.MovimientosCaja;
import com.nkseguridad.app.Repository.IMovimientosCajaRepository;
import com.nkseguridad.app.Service.IMovimientosCajaService;

@Service
public class MovimientosCajaService implements IMovimientosCajaService {
	
	@Autowired
	private IMovimientosCajaRepository MovimientosCajaRepository;
	@Override
	public List<MovimientosCaja> findAll() {
		// TODO Auto-generated method stub
		return (List<MovimientosCaja>)MovimientosCajaRepository.findAll();
	}

	

	@Override
	public boolean existebyCodigo(Integer codigo) {
		// TODO Auto-generated method stub
		return MovimientosCajaRepository.existsById(codigo);
	}

	@Override
	public MovimientosCaja save(MovimientosCaja movimientoscaja) {
		// TODO Auto-generated method stub
		return MovimientosCajaRepository.save(movimientoscaja);
	}

	@Override
	public List<MovimientosCaja> findByCodigoCaja(String codigocaja) {
		// TODO Auto-generated method stub
		return MovimientosCajaRepository.findByCodigocaja(codigocaja);
	}

	/*
	 * @Override public List<MovimientosCaja> findByFecha(Date fecha) { // TODO
	 * Auto-generated method stub return
	 * (List<MovimientosCaja>)MovimientosCajaRepository.findByFecha(fecha); }
	 */

}

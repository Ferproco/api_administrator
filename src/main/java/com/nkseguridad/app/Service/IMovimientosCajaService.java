package com.nkseguridad.app.Service;

import java.util.Date;
import java.util.List;

import com.nkseguridad.app.Entity.MovimientosCaja;


public interface IMovimientosCajaService {

	public List<MovimientosCaja> findAll();
	public boolean existebyCodigo(Integer codigo);
	public MovimientosCaja save(MovimientosCaja movimientoscaja);
	public List<MovimientosCaja> findByCodigoCaja(String codigocaja);
	//public List<MovimientosCaja> findByFecha(Date fecha);
}

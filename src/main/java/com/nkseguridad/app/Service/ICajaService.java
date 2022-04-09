package com.nkseguridad.app.Service;

import java.util.List;

import com.nkseguridad.app.Entity.Caja;
import com.nkseguridad.app.Entity.CajaNegocio;
import com.nkseguridad.app.Model.CajaNegocioFilter;

public interface ICajaService {

	public List<Caja> findAll();
	public List<CajaNegocio> findAllSucursal(CajaNegocioFilter filter);
	public Caja findById(Long codigo);
	public Caja save(Caja caja);
	public Caja updaCaja(Caja caja);
	public boolean findByExisteId(Long codigo);
}

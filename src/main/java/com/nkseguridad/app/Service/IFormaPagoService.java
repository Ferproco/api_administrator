package com.nkseguridad.app.Service;

import java.util.List;

import com.nkseguridad.app.Entity.FormaPago;


public interface IFormaPagoService {
	public List<FormaPago> findAll();
	public FormaPago findByCodigo(Long codigo);
	public boolean existebyCodigo(Long codigo);
	public FormaPago save(FormaPago formapago);
	public void eliminar(FormaPago formapago);

}

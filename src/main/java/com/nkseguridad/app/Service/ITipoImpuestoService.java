package com.nkseguridad.app.Service;

import java.util.List;

import com.nkseguridad.app.Entity.FormaPago;
import com.nkseguridad.app.Entity.TipoImpuesto;

public interface ITipoImpuestoService {

	public List<TipoImpuesto> findAll();
	public TipoImpuesto save(TipoImpuesto tipoimpuesto);
	public TipoImpuesto findByIdTipoImppuesto(Long id);
	public boolean existebyIdTipoImpuesto(Long id);
	public void eliminar(TipoImpuesto tipoimpuesto);
}

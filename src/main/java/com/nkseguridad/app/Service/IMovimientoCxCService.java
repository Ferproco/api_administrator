package com.nkseguridad.app.Service;

import java.util.List;

import com.nkseguridad.app.Entity.Kardex;
import com.nkseguridad.app.Entity.MovimientosCxC;
import com.nkseguridad.app.Model.ArticuloFilterKardex;

public interface IMovimientoCxCService {

	public List<MovimientosCxC> findAll();
}

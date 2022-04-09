package com.nkseguridad.app.Service;

import java.util.List;

import com.nkseguridad.app.Entity.Articulo;
import com.nkseguridad.app.Entity.Kardex;
import com.nkseguridad.app.Model.ArticuloFilterKardex;

public interface IKardexService {
	public List<Kardex> findAll();
	public List<Kardex> findAllMovimientosInventario(ArticuloFilterKardex ObjFilter);
}

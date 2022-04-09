package com.nkseguridad.app.Service;

import java.util.List;

import com.nkseguridad.app.Entity.Almacen;
import com.nkseguridad.app.Entity.FormaPago;

public interface IAlmacenService {

	public List<Almacen> findAll();
	public Almacen save(Almacen almacen);
	public boolean findByExisteCodigo(Long id);	
	public Almacen findByCodigo(Long id);
	public void eliminar(Almacen almacen);
	public void desactivarprincipal();
}

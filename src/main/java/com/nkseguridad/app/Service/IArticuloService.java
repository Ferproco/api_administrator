package com.nkseguridad.app.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.nkseguridad.app.Entity.Almacen;
import com.nkseguridad.app.Entity.Articulo;
import com.nkseguridad.app.Entity.Contacto;
import com.nkseguridad.app.Entity.Impuesto;
import com.nkseguridad.app.Model.ArticuloFilterKardex;

public interface IArticuloService {
 
	public List<Articulo> findAll();
	public List<Articulo> findAllTipoProducto(Long Tipo);
	public Articulo save(Articulo articulo);
	public boolean findByExisteCodigo(Long codigo);
	public Articulo findByCodigo(String codigo);
	public void eliminar(Articulo articulo);
	public Articulo findById(Long id);
	
	public List<Articulo> findAllFilterProducto(ArticuloFilterKardex ObjFilter);
}

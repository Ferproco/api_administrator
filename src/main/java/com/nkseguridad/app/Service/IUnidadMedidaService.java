package com.nkseguridad.app.Service;

import java.util.List;

import com.nkseguridad.app.Entity.Unidadmedida;

public interface IUnidadMedidaService {
	public List<Unidadmedida> findAll();
	public Unidadmedida findByCodigo(String abrevunidadmedida);
	public Unidadmedida save(Unidadmedida unidadmedida);
	public Unidadmedida Update(Unidadmedida unidadmedida);
	public boolean findByExisteCodigo(String abrevunidadmedida);
}

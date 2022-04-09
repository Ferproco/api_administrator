package com.nkseguridad.app.Service;

import java.util.*;

import com.nkseguridad.app.Entity.Impuesto;
import com.nkseguridad.app.Entity.Negocio;

public interface INegocioService {

	public List<Negocio> findAll();
	public Negocio findByCodigo(String codnegocio);
	public Negocio findById(Long id);
	public Negocio save(Negocio negocio);
	public Negocio findByExisteCodigo(Negocio negocio);
	public Negocio updaNegocio(Negocio negocio);
	public void eliminar(Negocio negocio);
}

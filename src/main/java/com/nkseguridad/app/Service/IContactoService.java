package com.nkseguridad.app.Service;

import java.util.List;


import com.nkseguridad.app.Entity.Contacto;
import com.nkseguridad.app.Entity.FormaPago;

public interface IContactoService {
	public List<Contacto> findAll();
	public Contacto findByCodigo(Long codigo);
	public List<Contacto> findAllTipoContacto(Long Tipo);
	public Contacto findByNumeroIdentificacion(String numero);
	public Contacto save(Contacto contacto);
	public void eliminar(Contacto contacto);
}

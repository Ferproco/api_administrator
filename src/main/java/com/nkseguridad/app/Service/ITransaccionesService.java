package com.nkseguridad.app.Service;

import java.util.List;


import com.nkseguridad.app.Entity.Transacciones;

public interface ITransaccionesService {

	public List<Transacciones> findAll();
	public Transacciones save(Transacciones transaccion);
	public boolean findByExisteCodigo(Long codigo);
}

package com.nkseguridad.app.Service;
import java.util.List;

import com.nkseguridad.app.Entity.Ruta;

public interface IRutaService {

	public List<Ruta> findAll();
	public Ruta findByIdRuta(Long codigo);
	public boolean existebyIdRuta(Long codigo);
	public Ruta save(Ruta ruta);
}

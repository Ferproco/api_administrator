package com.nkseguridad.app.Service.Implementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nkseguridad.app.Entity.TipoIdentificacion;
import com.nkseguridad.app.Repository.ITipoIdentificacionRepository;
import com.nkseguridad.app.Service.ITipoIdentificacionService;

@Service
public class TipoIdentificacionService implements ITipoIdentificacionService {

	@Autowired
	private ITipoIdentificacionRepository tipoidentificacionRepository;
	@Override
	public List<TipoIdentificacion> findAll() {
		// TODO Auto-generated method stub
		return (List<TipoIdentificacion>)tipoidentificacionRepository.findAll();
	}

}

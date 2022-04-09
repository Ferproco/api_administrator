package com.nkseguridad.app.Service.Implementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nkseguridad.app.Entity.TipoContacto;
import com.nkseguridad.app.Repository.ITipoContactoRepository;
import com.nkseguridad.app.Service.ITipoContactoService;

@Service
public class TipoContactoService implements ITipoContactoService {

	@Autowired
	private ITipoContactoRepository tipocontactoRepository;
	
	@Override
	public List<TipoContacto> findAll() {
		// TODO Auto-generated method stub
		return (List<TipoContacto>)tipocontactoRepository.findAll();
	}

}

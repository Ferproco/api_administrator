package com.nkseguridad.app.Service.Implementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nkseguridad.app.Entity.UsuarioNegocio;
import com.nkseguridad.app.Repository.IUsuarioNegocioRepository;
import com.nkseguridad.app.Service.IUsuarioNegocioService;

@Service
public class UsuarioNegocioService implements IUsuarioNegocioService {

	@Autowired
	private IUsuarioNegocioRepository UsuarioNegocioRepository;
	
	@Override
	public List<UsuarioNegocio> findAllByIdUsuario(Long id) {
		// TODO Auto-generated method stub
		return (List<UsuarioNegocio>)UsuarioNegocioRepository.findNegocioByIdUsuario(id);
	}

}

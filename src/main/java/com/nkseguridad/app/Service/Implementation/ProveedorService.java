package com.nkseguridad.app.Service.Implementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nkseguridad.app.Entity.Cliente;
import com.nkseguridad.app.Entity.Proveedor;
import com.nkseguridad.app.Repository.IProveedorRepository;
import com.nkseguridad.app.Service.IProveedorService;

@Service
public class ProveedorService implements IProveedorService {

	@Autowired
	private IProveedorRepository ProveedorRepository;
	
	@Override
	public List<Proveedor> findAll() {
		// TODO Auto-generated method stub
		return (List<Proveedor>)ProveedorRepository.findAll();
	}

}

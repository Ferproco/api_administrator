package com.nkseguridad.app.Service.Implementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nkseguridad.app.Entity.ListaPrecio;
import com.nkseguridad.app.Repository.IListaPrecioRepository;
import com.nkseguridad.app.Service.IListaPrecioService;

@Service
public class ListaPrecioService implements IListaPrecioService {

	@Autowired
	private IListaPrecioRepository listaprecioRepository;
	
	@Override
	public List<ListaPrecio> findAll() {
		// TODO Auto-generated method stub
		return (List<ListaPrecio>)listaprecioRepository.findAll();
	}

}

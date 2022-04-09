package com.nkseguridad.app.Service.Implementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nkseguridad.app.Entity.Pais;
import com.nkseguridad.app.Repository.IPaisRepository;
import com.nkseguridad.app.Service.IPaisService;

@Service
public class PaisService implements IPaisService {

	@Autowired 
	private IPaisRepository paisRepository;
	
	@Override
	public List<Pais> findAll() {
		// TODO Auto-generated method stub
		return (List<Pais>)paisRepository.findAll();
	}

}

package com.nkseguridad.app.Service.Implementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nkseguridad.app.Entity.Familia;
import com.nkseguridad.app.Repository.IFamiliaRepository;
import com.nkseguridad.app.Service.IFamiliaService;

@Service
public class FamiliaService implements IFamiliaService {
	@Autowired
	private IFamiliaRepository FamiliaRepository;
	
	@Override
	public List<Familia> findAll() {
		// TODO Auto-generated method stub
		return (List<Familia>)FamiliaRepository.findAll();
	}

	@Override
	public Familia findByCodigo(Long codigo) {
		// TODO Auto-generated method stub
		return FamiliaRepository.findById(codigo).orElse(null);
	}

	@Override
	public Familia save(Familia familia) {
		// TODO Auto-generated method stub
		return FamiliaRepository.save(familia);
	}

	@Override
	public Familia updateFamilia(Familia familia) {
		// TODO Auto-generated method stub
		return FamiliaRepository.save(familia);
	}

	@Override
	public boolean findByExisteCodigo(Long codigo) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void eliminar(Familia familia) {
		// TODO Auto-generated method stub
		FamiliaRepository.delete(familia);
		
	}

}

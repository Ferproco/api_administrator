package com.nkseguridad.app.Service.Implementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.nkseguridad.app.Entity.Almacen;
import com.nkseguridad.app.Repository.IAlmacenRepository;
import com.nkseguridad.app.Service.IAlmacenService;



@Service
public class AlmacenService implements IAlmacenService {
	
	@Autowired
	private IAlmacenRepository almacenRepository;
	
	@Override
	public List<Almacen> findAll() {
		// TODO Auto-generated method stub
		Sort defaultSort = createStaticSort();
		return (List<Almacen>)almacenRepository.findAllOrderBy(defaultSort);
	}
	
	public Sort createStaticSort() {
        String[] arrayOrdre = {"nombre"};
        return  Sort.by(arrayOrdre);
        }

	@Override
	public Almacen save(Almacen almacen) {
		// TODO Auto-generated method stub
		return almacenRepository.save(almacen);
	}

	@Override
	public boolean findByExisteCodigo(Long id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Almacen findByCodigo(Long id) {
		// TODO Auto-generated method stub
		return almacenRepository.findById(id).orElse(null);
	}

	@Override
	public void eliminar(Almacen almacen) {
		// TODO Auto-generated method stub
		almacenRepository.delete(almacen);
	}

	@Override
	public void desactivarprincipal() {
		// TODO Auto-generated method stub
		almacenRepository.desactivarprincipal();
	}


}

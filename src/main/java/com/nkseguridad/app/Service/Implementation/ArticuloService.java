package com.nkseguridad.app.Service.Implementation;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nkseguridad.app.Entity.Articulo;
import com.nkseguridad.app.Model.ArticuloFilterKardex;
import com.nkseguridad.app.Repository.IArticuloRepository;
import com.nkseguridad.app.Service.IArticuloService;

@Service
public class ArticuloService implements IArticuloService {

	@Autowired
	private IArticuloRepository articuloRepository;
	
	@Override
	public List<Articulo> findAll() {
		// TODO Auto-generated method stub
		return (List<Articulo>)articuloRepository.findAll();
	}

	@Override
	public Articulo save(Articulo articulo) {
		// TODO Auto-generated method stub
		return articuloRepository.save(articulo);
	}

	@Override
	public boolean findByExisteCodigo(Long codigo) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Articulo findByCodigo(String codigo) {
		// TODO Auto-generated method stub
		return articuloRepository.findByCodigo(codigo);
	}

	@Override
	public void eliminar(Articulo articulo) {
		// TODO Auto-generated method stub
		articuloRepository.delete(articulo);
		
	}

	@Override
	public List<Articulo> findAllTipoProducto(Long Tipo) {
		// TODO Auto-generated method stub
		if (Tipo == 5)
			return (List<Articulo>)articuloRepository.findAll();
		else
			return (List<Articulo>)articuloRepository.findByCodtipoproducto(Tipo);
	}

	@Override
	public Articulo findById(Long id) {
		// TODO Auto-generated method stub
		return articuloRepository.findById(id).orElse(null);
	}

	@Override
	public List<Articulo> findAllFilterProducto(ArticuloFilterKardex ObjFilter) {
		// TODO Auto-generated method stub
		SimpleDateFormat formater = new SimpleDateFormat("dd-MM-yyyy");
		Date desdee= null;
		Date hastaa = null;
		List<Articulo> list = null;
		try {			
			System.out.println("La nueva conversion "+ formater.format(desdee));
		}
		catch(Exception g) {
			
		}
		System.out.print("La fecha como salio " + ObjFilter.getFechadesde() + " hasta " + ObjFilter.getFechahasta());
		if (ObjFilter.getCodalmacen() <= 0) {
			list = articuloRepository.findAllFilterProducto(ObjFilter.getFechadesde(), ObjFilter.getFechahasta());
		}
		else {
			list = articuloRepository.findAllFilterProductoPorAlmacen(ObjFilter.getFechadesde(), ObjFilter.getFechahasta(), ObjFilter.getCodalmacen());
		}
		
		return list;
	}

		
}

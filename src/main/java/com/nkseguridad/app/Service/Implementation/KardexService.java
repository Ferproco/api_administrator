package com.nkseguridad.app.Service.Implementation;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nkseguridad.app.Entity.Articulo;
import com.nkseguridad.app.Entity.Kardex;
import com.nkseguridad.app.Model.ArticuloFilterKardex;
import com.nkseguridad.app.Repository.IKardexRepository;
import com.nkseguridad.app.Service.IKardexService;

@Service
public class KardexService implements IKardexService {

	@Autowired
	private IKardexRepository KardexRepository;
	
	@Override
	public List<Kardex> findAll() {
		// TODO Auto-generated method stub
		return (List<Kardex>)KardexRepository.findAll();
	}

	@Override
	public List<Kardex> findAllMovimientosInventario(ArticuloFilterKardex ObjFilter) {
		// TODO Auto-generated method stub
		SimpleDateFormat formater = new SimpleDateFormat("dd-MM-yyyy");
		Date desdee= null;
		Date hastaa = null;
		List<Kardex> list = null;
		try {

			System.out.println("La nueva conversion "+ formater.format(desdee));
		}
		catch(Exception g) {
			
		}
		System.out.print("El filtro es " + ObjFilter.toString());
		if (ObjFilter.getCodalmacen() <= 0) {
			System.out.print("menor que cero");
			list = KardexRepository.findAllMovimientoInventario(ObjFilter.getFechadesde(), ObjFilter.getFechahasta(), ObjFilter.getArticulo_id());
		}
		else {		
			System.out.print("mayor que cero");
			list = KardexRepository.findAllMovimientoInventarioPorAlmcen(ObjFilter.getFechadesde(), ObjFilter.getFechahasta(), ObjFilter.getArticulo_id(), ObjFilter.getCodalmacen());
		}
		return list;
	}

}

package com.nkseguridad.app.Service.Implementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.nkseguridad.app.Entity.DetallesDocumentoVenta;
import com.nkseguridad.app.Repository.IDetallesDocumentoVentaRepository;
import com.nkseguridad.app.Service.IDetallesDocumentoVentaService;

@Service
public class DetallesDocumentoVentaService implements IDetallesDocumentoVentaService {

	@Autowired
	private IDetallesDocumentoVentaRepository detallesdocumentoventaRepository;
	
	@Override
	public List<DetallesDocumentoVenta> findAll() {
		// TODO Auto-generated method stub
		return (List<DetallesDocumentoVenta>)detallesdocumentoventaRepository.findAll();
	}

	/*@Override
	public  List<DetallesDocumentoVenta> findByCoddocumentoventa(Long documentoid) {
		// TODO Auto-generated method stub
		return (List<DetallesDocumentoVenta>)detallesdocumentoventaRepository.findByDocumentoId(documentoid);
	}*/

}

package com.nkseguridad.app.Service.Implementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nkseguridad.app.Entity.DetallesDocumentoCompra;
import com.nkseguridad.app.Entity.DetallesDocumentoVenta;
import com.nkseguridad.app.Repository.IDetallesDocumentoCompraRepository;
import com.nkseguridad.app.Repository.IDetallesDocumentoVentaRepository;
import com.nkseguridad.app.Service.IDetallesDocumentoCompraService;

@Service
public class DetallesDocumentoCompraService implements IDetallesDocumentoCompraService{

	@Autowired
	private IDetallesDocumentoCompraRepository detallesdocumentocompraRepository;
	
	@Override
	public List<DetallesDocumentoCompra> findAll() {
		// TODO Auto-generated method stub
		return (List<DetallesDocumentoCompra>)detallesdocumentocompraRepository.findAll();
	}

	/*@Override
	public List<DetallesDocumentoCompra> findByCoddocumentocompra(Long coddocumentocompra) {
		// TODO Auto-generated method stub
		return (List<DetallesDocumentoCompra>)detallesdocumentocompraRepository.findByCoddocumentocompra(coddocumentocompra);
	}*/

}

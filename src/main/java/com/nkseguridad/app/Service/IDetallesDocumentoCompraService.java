package com.nkseguridad.app.Service;

import java.util.List;

import com.nkseguridad.app.Entity.DetallesDocumentoCompra;

public interface IDetallesDocumentoCompraService {
	public List<DetallesDocumentoCompra> findAll();
	//public  List<DetallesDocumentoCompra> findByCoddocumentocompra(Long coddocumentocompra);

}

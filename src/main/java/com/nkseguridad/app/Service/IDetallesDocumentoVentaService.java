package com.nkseguridad.app.Service;

import java.util.List;


import com.nkseguridad.app.Entity.DetallesDocumentoVenta;

public interface IDetallesDocumentoVentaService {
	public List<DetallesDocumentoVenta> findAll();
	//public  List<DetallesDocumentoVenta> findByCoddocumentoventa(Long coddocumentoventa);
	
}

package com.nkseguridad.app.Service;

import java.util.List;


import com.nkseguridad.app.Entity.DocumentoVenta;

public interface IDocumentoVentaService {
	
	public List<DocumentoVenta> findAll(); 
	public DocumentoVenta findById(Long id);
	public List<DocumentoVenta> findByTipodocumento(String tipodocumento);
	public DocumentoVenta findByNumerodocumento(String numerodocumento);
	public DocumentoVenta save(DocumentoVenta documentoventa);
	
}

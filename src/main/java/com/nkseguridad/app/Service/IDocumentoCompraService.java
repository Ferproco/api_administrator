package com.nkseguridad.app.Service;

import java.util.List;

import com.nkseguridad.app.Entity.DocumentoCompra;


public interface IDocumentoCompraService {

	public List<DocumentoCompra> findAll(); 
	public DocumentoCompra findById(Long id);
	public List<DocumentoCompra> findByTipodocumento(String tipodocumento);
	public DocumentoCompra findByNumerodocumento(String numerodocumento);
	public DocumentoCompra save(DocumentoCompra documentocompra);
}

package com.nkseguridad.app.Service.Implementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nkseguridad.app.Entity.DocumentoCompra;
import com.nkseguridad.app.Repository.IDocumentoCompraRepository;
import com.nkseguridad.app.Service.IDocumentoCompraService;

@Service
public class DocumentoCompraService implements IDocumentoCompraService {

	@Autowired
	private IDocumentoCompraRepository documentoRepository;
	
	@Override
	public List<DocumentoCompra> findAll() {
		// TODO Auto-generated method stub
		return (List<DocumentoCompra>)documentoRepository.findAll();
	}

	@Override
	public DocumentoCompra findById(Long id) {
		// TODO Auto-generated method stub
		return documentoRepository.findById(id).orElse(null);
	}

	@Override
	public List<DocumentoCompra> findByTipodocumento(String tipodocumento) {
		// TODO Auto-generated method stub
		return documentoRepository.findByTipodocumento(tipodocumento);
	}

	@Override
	public DocumentoCompra findByNumerodocumento(String numerodocumento) {
		// TODO Auto-generated method stub
		return documentoRepository.findByNumerodocumento(numerodocumento);
	}

	@Override
	public DocumentoCompra save(DocumentoCompra documentocompra) {
		// TODO Auto-generated method stub
		return documentoRepository.save(documentocompra);
	}

}

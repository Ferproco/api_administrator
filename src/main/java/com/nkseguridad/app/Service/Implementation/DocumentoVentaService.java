package com.nkseguridad.app.Service.Implementation;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.nkseguridad.app.Entity.DocumentoVenta;
import com.nkseguridad.app.Repository.IDocumentoVentaRepository;
import com.nkseguridad.app.Service.IDocumentoVentaService;

@Service
public class DocumentoVentaService implements IDocumentoVentaService {

	@Autowired
	private IDocumentoVentaRepository documentoRepository;
	
	@Override
	public List<DocumentoVenta> findAll() {
		// TODO Auto-generated method stub
		return (List<DocumentoVenta>)documentoRepository.findAll();
	}

	@Override
	public DocumentoVenta findById(Long id) {
		// TODO Auto-generated method stub
		return documentoRepository.findById(id).orElse(null);
	}

	@Override
	public List<DocumentoVenta> findByTipodocumento(String tipodocumento) {
		// TODO Auto-generated method stub
		return documentoRepository.findByTipodocumento(tipodocumento);
	}

	@Override
	public DocumentoVenta findByNumerodocumento(String numerodocumento) {
		// TODO Auto-generated method stub
		return documentoRepository.findByNumerodocumento(numerodocumento);
	}

	@Override
	@Transactional
	public DocumentoVenta save(DocumentoVenta documentoventa) {
		// TODO Auto-generated method stub
		return documentoRepository.save(documentoventa);
	}

}

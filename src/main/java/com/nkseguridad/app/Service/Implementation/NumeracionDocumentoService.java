package com.nkseguridad.app.Service.Implementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nkseguridad.app.Entity.Articulo;
import com.nkseguridad.app.Entity.NumeracionDocumento;
import com.nkseguridad.app.Repository.INumeracionDocumentoRepository;
import com.nkseguridad.app.Service.INumeracionDocumentoService;

@Service
public class NumeracionDocumentoService implements INumeracionDocumentoService {

	@Autowired
	private INumeracionDocumentoRepository numeraciondocumentoRepository;
	
	@Override
	public List<NumeracionDocumento> findAll() {
		// TODO Auto-generated method stub
		return (List<NumeracionDocumento>)numeraciondocumentoRepository.findAll();
	}

	@Override
	public NumeracionDocumento save(NumeracionDocumento numeraciondocumento) {
		// TODO Auto-generated method stub
		return numeraciondocumentoRepository.save(numeraciondocumento);
	}

	@Override
	public boolean findByExisteCodigo(Long codigo) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public NumeracionDocumento findByCodigo(Long codigo) {
		// TODO Auto-generated method stub
		return numeraciondocumentoRepository.findById(codigo).orElse(null);
	}

	@Override
	public void eliminar(NumeracionDocumento numeraciondocumento) {
		// TODO Auto-generated method stub
		numeraciondocumentoRepository.delete(numeraciondocumento);
	}

	@Override
	public List<NumeracionDocumento> findAllTipodocumento(Long tipodocumento) {
		// TODO Auto-generated method stub
		return (List<NumeracionDocumento>)numeraciondocumentoRepository.findByCodtipodocumento(tipodocumento);
	}

	@Override
	public NumeracionDocumento findByIdnumeraciondocumento(Long id) {
		// TODO Auto-generated method stub
		return numeraciondocumentoRepository.findById(id).orElse(null);
	}

	@Override
	public NumeracionDocumento findByCodtipodocumentoandPrincipalSQL(Long codigo,Boolean principal) {
		// TODO Auto-generated method stub
		return numeraciondocumentoRepository.findByCodtipodocumentoandPrincipalSQL(codigo,principal);
	}

	@Override
	public List<NumeracionDocumento> findByTipodedocumento(String tipodedocumento) {
		// TODO Auto-generated method stub
		return numeraciondocumentoRepository.findByTipodedocumento(tipodedocumento);
	}

	@Override
	public NumeracionDocumento findByPrefijo(String prefijo) {
		// TODO Auto-generated method stub
		return numeraciondocumentoRepository.findByPrefijo(prefijo);
	}

	
}

package com.nkseguridad.app.Service.Implementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nkseguridad.app.Entity.TipoDocumento;
import com.nkseguridad.app.Repository.ITipoDocumentoRepository;
import com.nkseguridad.app.Service.ITipoDocumentoService;

@Service
public class TipoDocumentoService implements ITipoDocumentoService {

	
	@Autowired
	private ITipoDocumentoRepository tipodocumentoRepository;
	
	@Override
	public List<TipoDocumento> findAll() {
		// TODO Auto-generated method stub
		return (List<TipoDocumento>)tipodocumentoRepository.findAll();
	}

	@Override
	public TipoDocumento save(TipoDocumento tipodocumento) {
		// TODO Auto-generated method stub
		return tipodocumentoRepository.save(tipodocumento);
	}

	@Override
	public boolean findByExisteCodigo(Long codigo) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public TipoDocumento findByCodigo(Long codigo) {
		// TODO Auto-generated method stub
		return tipodocumentoRepository.findById(codigo).orElse(null);
	}

	@Override
	public void eliminar(TipoDocumento tipodocumento) {
		// TODO Auto-generated method stub
		 tipodocumentoRepository.delete(tipodocumento);
	}

}

package com.nkseguridad.app.Service;

import java.util.List;

import com.nkseguridad.app.Entity.TipoDocumento;

public interface ITipoDocumentoService {
	
	public List<TipoDocumento> findAll();
	public TipoDocumento save(TipoDocumento tipodocumento);
	public boolean findByExisteCodigo(Long codigo);
	public TipoDocumento findByCodigo(Long codigo);
	public void eliminar(TipoDocumento tipodocumento);

}

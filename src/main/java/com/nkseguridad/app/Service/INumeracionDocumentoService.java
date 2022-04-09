package com.nkseguridad.app.Service;

import java.util.List;

import com.nkseguridad.app.Entity.NumeracionDocumento;

public interface INumeracionDocumentoService {

	public List<NumeracionDocumento> findAll();
	public NumeracionDocumento save(NumeracionDocumento numeraciondocumento);
	public boolean findByExisteCodigo(Long codigo);
	public NumeracionDocumento findByCodigo(Long codigo);
	public void eliminar(NumeracionDocumento numeraciondocumento);
	public List<NumeracionDocumento> findAllTipodocumento(Long tipodocumento);
	public NumeracionDocumento findByIdnumeraciondocumento(Long id);
	public NumeracionDocumento findByCodtipodocumentoandPrincipalSQL(Long codigo,Boolean principal);
	public List<NumeracionDocumento> findByTipodedocumento(String tipodedocumento);
	public NumeracionDocumento findByPrefijo(String prefijo);
}

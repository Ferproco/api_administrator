package com.nkseguridad.app.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.nkseguridad.app.Entity.DocumentoVenta;
import com.nkseguridad.app.Entity.NumeracionDocumento;

@Repository
public interface INumeracionDocumentoRepository extends CrudRepository<NumeracionDocumento,Long> {

	NumeracionDocumento findByPrefijo(String prefijo);
	List<NumeracionDocumento> findByTipodedocumento(String tipodedocumento);
	List<NumeracionDocumento> findByCodtipodocumento(Long Tipo);
	
	@Query("Select p from NumeracionDocumento p where p.codtipodocumento=?1 and p.principal=?2")
	public NumeracionDocumento findByCodtipodocumentoandPrincipalSQL(Long codtipodocumento,boolean principal);
	}

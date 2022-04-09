 package com.nkseguridad.app.Repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.nkseguridad.app.Entity.DocumentoVenta;

@Repository
public interface IDocumentoVentaRepository extends CrudRepository<DocumentoVenta, Long> {

	List<DocumentoVenta> findByTipodocumento(String tipodocumento);
    DocumentoVenta findByNumerodocumento(String numerodocumento);
}

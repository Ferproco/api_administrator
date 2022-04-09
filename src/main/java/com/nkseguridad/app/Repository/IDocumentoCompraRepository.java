package com.nkseguridad.app.Repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.nkseguridad.app.Entity.DocumentoCompra;

@Repository
public interface IDocumentoCompraRepository extends CrudRepository<DocumentoCompra, Long> {

	List<DocumentoCompra> findByTipodocumento(String tipodocumento);
    DocumentoCompra findByNumerodocumento(String numerodocumento);
}

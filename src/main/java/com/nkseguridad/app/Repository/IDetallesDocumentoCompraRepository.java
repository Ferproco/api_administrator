package com.nkseguridad.app.Repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.nkseguridad.app.Entity.DetallesDocumentoCompra;

public interface IDetallesDocumentoCompraRepository extends CrudRepository<DetallesDocumentoCompra, Long>{

	//List<DetallesDocumentoCompra> findByCoddocumentocompra(Long coddocumentocompra);
}

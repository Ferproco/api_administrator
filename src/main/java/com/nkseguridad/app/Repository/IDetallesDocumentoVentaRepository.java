package com.nkseguridad.app.Repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


import com.nkseguridad.app.Entity.DetallesDocumentoVenta;

@Repository
public interface IDetallesDocumentoVentaRepository extends CrudRepository<DetallesDocumentoVenta,Long> {
	
	//List<DetallesDocumentoVenta> findByDocumentoId(Long documentoid);

}

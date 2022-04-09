package com.nkseguridad.app.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.nkseguridad.app.Entity.TipoDocumento;

@Repository
public interface ITipoDocumentoRepository extends CrudRepository<TipoDocumento, Long> {

}

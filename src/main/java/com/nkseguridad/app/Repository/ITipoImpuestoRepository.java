package com.nkseguridad.app.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.nkseguridad.app.Entity.TipoImpuesto;

@Repository
public interface ITipoImpuestoRepository extends CrudRepository<TipoImpuesto,Long> {

}

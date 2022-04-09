package com.nkseguridad.app.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.nkseguridad.app.Entity.MovimientosCxC;
import com.nkseguridad.app.Entity.MovimientosCxP;

@Repository
public interface IMovimientoCxPRepository extends CrudRepository<MovimientosCxP, Long> {

}

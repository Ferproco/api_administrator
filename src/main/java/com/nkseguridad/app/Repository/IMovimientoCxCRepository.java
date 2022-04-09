package com.nkseguridad.app.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.nkseguridad.app.Entity.MovimientosCxC;

@Repository
public interface IMovimientoCxCRepository extends CrudRepository<MovimientosCxC, Long>{

}

package com.nkseguridad.app.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.nkseguridad.app.Entity.Impuesto;

@Repository
public interface IImpuestoRepository extends CrudRepository<Impuesto, Long> {

}

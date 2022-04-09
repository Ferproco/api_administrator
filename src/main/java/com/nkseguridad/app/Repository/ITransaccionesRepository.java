package com.nkseguridad.app.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.nkseguridad.app.Entity.Transacciones;

@Repository
public interface ITransaccionesRepository extends CrudRepository<Transacciones,Long> {

}

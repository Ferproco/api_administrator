package com.nkseguridad.app.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.nkseguridad.app.Entity.FormaPago;


@Repository
public interface IFormaPagoRepository extends CrudRepository<FormaPago, Long> {

}

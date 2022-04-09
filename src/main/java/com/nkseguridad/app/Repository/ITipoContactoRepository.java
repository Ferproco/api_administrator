package com.nkseguridad.app.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.nkseguridad.app.Entity.TipoContacto;

@Repository
public interface ITipoContactoRepository extends CrudRepository<TipoContacto,Long> {

}

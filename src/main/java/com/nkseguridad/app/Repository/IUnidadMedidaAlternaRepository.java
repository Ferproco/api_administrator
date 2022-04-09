package com.nkseguridad.app.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.nkseguridad.app.Entity.UnidadMedidaAlterna;

@Repository
public interface IUnidadMedidaAlternaRepository extends CrudRepository<UnidadMedidaAlterna,Long> {

}

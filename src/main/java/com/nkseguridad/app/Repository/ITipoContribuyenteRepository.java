package com.nkseguridad.app.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.nkseguridad.app.Entity.TipoContribuyente;

@Repository
public interface ITipoContribuyenteRepository extends CrudRepository<TipoContribuyente,Long> {

}

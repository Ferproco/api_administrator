package com.nkseguridad.app.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.nkseguridad.app.Entity.Familia;


@Repository
public interface IFamiliaRepository extends CrudRepository<Familia, Long> {

}

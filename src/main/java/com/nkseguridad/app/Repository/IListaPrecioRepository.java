package com.nkseguridad.app.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.nkseguridad.app.Entity.ListaPrecio;

@Repository
public interface IListaPrecioRepository extends CrudRepository<ListaPrecio, Long>{

}

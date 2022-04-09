package com.nkseguridad.app.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.nkseguridad.app.Entity.Proveedor;

@Repository
public interface IProveedorRepository extends CrudRepository<Proveedor, String> {

}

package com.nkseguridad.app.Repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


import com.nkseguridad.app.Entity.Empleado;

@Repository
public interface IEmpleadoRepository extends CrudRepository<Empleado, Long> {
	Empleado findByNumeroidentificacion(String numero);
	List<Empleado> findByCodtipoempleado(Long Tipo);

}

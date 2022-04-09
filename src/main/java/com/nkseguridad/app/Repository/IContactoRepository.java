package com.nkseguridad.app.Repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.nkseguridad.app.Entity.Contacto;

@Repository
public interface IContactoRepository extends CrudRepository<Contacto,Long>{

	Contacto findByNumeroidentificacion(String numero);
	List<Contacto> findByCodtipocontacto(Long Tipo);

}

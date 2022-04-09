package com.nkseguridad.app.Repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


import com.nkseguridad.app.Entity.PersonaContacto;

@Repository
public interface IPersonaContactoRepository extends CrudRepository<PersonaContacto, Long> {
	
	List<PersonaContacto> findByCodcontacto(Long codcontacto);

}

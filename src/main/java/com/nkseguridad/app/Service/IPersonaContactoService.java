package com.nkseguridad.app.Service;

import java.util.List;

import com.nkseguridad.app.Entity.PersonaContacto;

public interface IPersonaContactoService {
	
	public List<PersonaContacto> findAll();
	public PersonaContacto findById(Long id);
	public  List<PersonaContacto> findByCodcontacto(Long codcontacto);
	public PersonaContacto save(PersonaContacto personacontacto);
	public void eliminar(PersonaContacto personacontacto);
}

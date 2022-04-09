package com.nkseguridad.app.Service.Implementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nkseguridad.app.Entity.PersonaContacto;
import com.nkseguridad.app.Repository.IPersonaContactoRepository;
import com.nkseguridad.app.Service.IPersonaContactoService;

@Service
public class PersonaContactoService implements IPersonaContactoService {

	@Autowired
	private IPersonaContactoRepository personacontactoRepository;
	
	@Override
	public List<PersonaContacto> findAll() {
		// TODO Auto-generated method stub
		return (List<PersonaContacto>)personacontactoRepository.findAll();
	}

	@Override
	public PersonaContacto findById(Long id) {
		// TODO Auto-generated method stub
		return personacontactoRepository.findById(id).orElse(null);
	}

	@Override
	public List<PersonaContacto> findByCodcontacto(Long codcontacto) {
		// TODO Auto-generated method stub
		return (List<PersonaContacto>)personacontactoRepository.findByCodcontacto(codcontacto);
	}

	@Override
	public PersonaContacto save(PersonaContacto personacontacto) {
		// TODO Auto-generated method stub
		return personacontactoRepository.save(personacontacto);
	}

	@Override
	public void eliminar(PersonaContacto personacontacto) {
		// TODO Auto-generated method stub
		personacontactoRepository.delete(personacontacto);
	}

}

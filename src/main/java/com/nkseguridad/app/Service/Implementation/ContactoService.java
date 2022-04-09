package com.nkseguridad.app.Service.Implementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nkseguridad.app.Entity.Contacto;

import com.nkseguridad.app.Repository.IContactoRepository;
import com.nkseguridad.app.Service.IContactoService;

@Service
public class ContactoService implements IContactoService {

	
	@Autowired
	private IContactoRepository contactoRepository;
	
	@Override
	public List<Contacto> findAll() {
		// TODO Auto-generated method stub
		return (List<Contacto>)contactoRepository.findAll();
	}
	@Override
	public List<Contacto> findAllTipoContacto(Long Tipo) {
		// TODO Auto-generated method stub
		if (Tipo == 3)
			return (List<Contacto>)contactoRepository.findAll();
		else
			return (List<Contacto>)contactoRepository.findByCodtipocontacto(Tipo);
	}

	@Override
	public Contacto findByNumeroIdentificacion(String numero) {
		// TODO Auto-generated method stub
		return contactoRepository.findByNumeroidentificacion(numero);
	}

	@Override
	public Contacto save(Contacto contacto) {
		// TODO Auto-generated method stub
		return contactoRepository.save(contacto);
	}

	@Override
	public Contacto findByCodigo(Long id) {
		// TODO Auto-generated method stub
		return contactoRepository.findById(id).orElse(null);
	}

	@Override
	public void eliminar(Contacto contacto) {
		// TODO Auto-generated method stub
		contactoRepository.delete(contacto);
	}
	

}

package com.nkseguridad.app.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


import com.nkseguridad.app.Entity.Contacto;
import com.nkseguridad.app.Entity.FormaPago;
import com.nkseguridad.app.Service.IContactoService;

@RestController
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST, RequestMethod.PUT, RequestMethod.DELETE})
@RequestMapping("api")
public class ContactoController {
	@Autowired
	private IContactoService ContactoServicio;
	
	@GetMapping("contacto")
	public ResponseEntity<?> ListarContactos(){
		List<Contacto> LstContactos = ContactoServicio.findAll();
		if (LstContactos!=null) {
			if (LstContactos.size()!=0) 
				return new ResponseEntity<>(LstContactos,HttpStatus.OK);			
			else 
				return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);		
		}
		else 
			return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);	
	}
	
	@GetMapping("contacto/{id}")
	public ResponseEntity<?> BuscarPorCodigo(@PathVariable(name = "id") Long id) {

		Contacto contacto = ContactoServicio.findByCodigo(id);
		if (contacto != null) {
			return new ResponseEntity<>(contacto, HttpStatus.OK);
		} else {
			return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
		}
	}
	
	@GetMapping("contacto/tipo/{tipo}")
	public ResponseEntity<?> ListarContactosPorTipo(@PathVariable(name = "tipo") Long tipo){
		List<Contacto> LstContactos = ContactoServicio.findAllTipoContacto(tipo);
		if (LstContactos!=null) {
			if (LstContactos.size()!=0) 
				return new ResponseEntity<>(LstContactos,HttpStatus.OK);			
			else 
				return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);		
		}
		else 
			return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);	
	}
	
	@PostMapping("contacto")
	public ResponseEntity<?> GuardarContacto(@RequestBody Contacto contacto){
		Contacto contactoOut;
		try {
			Contacto contactoUpdate = ContactoServicio.findByNumeroIdentificacion(contacto.getNumeroidentificacion());
			if (contactoUpdate != null) {
				contactoUpdate.setLugarenvio(contacto.getLugarenvio());
				contactoUpdate.setCodlistaprecio(contacto.getCodlistaprecio());
				contactoUpdate.setDireccionexogena(contacto.getDireccionexogena());
				contactoUpdate.setCoddepartamento(contacto.getCoddepartamento());
				contactoUpdate.setCodmunicipio(contacto.getCodmunicipio());
				contactoUpdate.setId(contacto.getId());
				contactoUpdate.setCodvendedor(contacto.getCodvendedor());
				contactoUpdate.setCodnegocio(contacto.getCodnegocio());
				contactoUpdate.setNumeroidentificacion(contacto.getNumeroidentificacion());
				contactoUpdate.setCodtipoidentificacion(contacto.getCodtipoidentificacion());
				contactoUpdate.setCodtipopersona(contacto.getCodtipopersona());
				contactoUpdate.setCodpais(contacto.getCodpais());
				contactoUpdate.setRazonsocial(contacto.getRazonsocial());
				contactoUpdate.setTelefonomovil(contacto.getTelefonomovil());
				contactoUpdate.setTelefonofijo1(contacto.getTelefonofijo1());
				contactoUpdate.setTelefonofijo2(contacto.getTelefonofijo2());
				contactoUpdate.setTelefonofax(contacto.getTelefonofax());
				contactoUpdate.setDireccionfiscal(contacto.getDireccionfiscal());
				contactoUpdate.setCorreoe(contacto.getCorreoe());
				contactoUpdate.setCodtipocontacto(contacto.getCodtipocontacto());
				contactoUpdate.setCodformapago(contacto.getCodformapago());
				contactoUpdate.setCodtipocontibuyente(contacto.getCodtipocontibuyente());
				contactoUpdate.setStatus(contacto.getStatus());
				contactoUpdate.setNombreprimero(contacto.getNombreprimero());
				contactoUpdate.setNombresegundo(contacto.getNombresegundo());
				contactoUpdate.setApellidoprimero(contacto.getApellidoprimero());
				contactoUpdate.setApellidosegundo(contacto.getApellidosegundo());
				contactoUpdate.setPaginaweb(contacto.getPaginaweb());
				contactoUpdate.setLimitecreditohasta(contacto.getLimitecreditohasta());
				contactoUpdate.setFechacreditodesde(contacto.getFechacreditodesde());
				contactoUpdate.setFechacreditohasta(contacto.getFechacreditohasta());
				contactoUpdate.setObservaciones(contacto.getObservaciones());
				contactoUpdate.setDescuentocondicionado(contacto.getDescuentocondicionado());
				contactoUpdate.setCodigodv(contacto.getCodigodv());
				contactoUpdate.setResponsableiva(contacto.getResponsableiva());
				contactoOut = ContactoServicio.save(contactoUpdate);
			}
			else {
				contactoOut = ContactoServicio.save(contacto);
			}
			if (contactoOut!=null) {
				return new ResponseEntity<>(contactoOut, HttpStatus.OK);
			}
			else {
				return new ResponseEntity<Void>(HttpStatus.CONFLICT);
			}
		}
		catch(Exception m) {
			return new ResponseEntity<Void>(HttpStatus.CONFLICT);
		}	
	}
	
	
	@DeleteMapping("contacto/{id}")
	public ResponseEntity<Void> BorrarContacto(@PathVariable(name = "id") Long id){

		try {
			Contacto contactoUpdate = ContactoServicio.findByCodigo(id);
			if (contactoUpdate!=null) {
				ContactoServicio.eliminar(contactoUpdate);
				return new ResponseEntity<Void>(HttpStatus.OK);
			}
			else {
				return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
			}			
		}
		catch(Exception m) {
			return new ResponseEntity<Void>(HttpStatus.CONFLICT);
		}
	}

}

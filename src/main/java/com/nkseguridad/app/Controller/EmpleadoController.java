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
import com.nkseguridad.app.Entity.Empleado;
import com.nkseguridad.app.Service.IEmpleadoService;

@RestController
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST, RequestMethod.PUT, RequestMethod.DELETE})
@RequestMapping("api")
public class EmpleadoController {
	
	@Autowired
	private IEmpleadoService empleadoServicio;
	
	@GetMapping("empleado")
	public ResponseEntity<?> ListarEmpleados(){
		List<Empleado> LstEmpleados = empleadoServicio.findAll();
		if (LstEmpleados!=null) {
			if (LstEmpleados.size()!=0) 
				return new ResponseEntity<>(LstEmpleados,HttpStatus.OK);			
			else 
				return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);		
		}
		else 
			return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);	
	}
	@GetMapping("empleado/{id}")
	public ResponseEntity<?> BuscarPorCodigo(@PathVariable(name = "id") Long id) {

		Empleado empleado = empleadoServicio.findByCodigo(id);
		if (empleado != null) {
			return new ResponseEntity<>(empleado, HttpStatus.OK);
		} else {
			return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
		}
	}
	
	@GetMapping("empleado/tipo/{tipo}")
	public ResponseEntity<?> ListarEmpleadosPorTipo(@PathVariable(name = "tipo") Long tipo){
		List<Empleado> LstEmpleados = empleadoServicio.findAllTipoEmpleado(tipo);
		if (LstEmpleados!=null) {
			if (LstEmpleados.size()!=0) 
				return new ResponseEntity<>(LstEmpleados,HttpStatus.OK);			
			else 
				return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);		
		}
		else 
			return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);	
	}
	@PostMapping("empleado")
	public ResponseEntity<?> GuardarEmpleado(@RequestBody Empleado empleado){
		Empleado empleadoOut;
		try {
			Empleado empleadoUpdate = empleadoServicio.findByNumeroIdentificacion(empleado.getNumeroidentificacion());
			if (empleadoUpdate != null) {
				
				empleadoUpdate.setCoddepartamento(empleado.getCoddepartamento());
				empleadoUpdate.setCodmunicipio(empleado.getCodmunicipio());
				empleadoUpdate.setId(empleado.getId());
				empleadoUpdate.setCodnegocio(empleado.getCodnegocio());
				empleadoUpdate.setNumeroidentificacion(empleado.getNumeroidentificacion());
				empleadoUpdate.setCodtipoidentificacion(empleado.getCodtipoidentificacion());
				empleadoUpdate.setCodpais(empleado.getCodpais());
			    empleadoUpdate.setTelefonomovil(empleado.getTelefonomovil());
				empleadoUpdate.setTelefonofijo1(empleado.getTelefonofijo1());
				empleadoUpdate.setTelefonofijo2(empleado.getTelefonofijo2());
				empleadoUpdate.setTelefonofax(empleado.getTelefonofax());
				empleadoUpdate.setDireccionfiscal(empleado.getDireccionfiscal());
				empleadoUpdate.setCorreoe(empleado.getCorreoe());
				empleadoUpdate.setCodtipoempleado(empleado.getCodtipoempleado());
				empleadoUpdate.setStatus(empleado.getStatus());
				empleadoUpdate.setNombreprimero(empleado.getNombreprimero());
				empleadoUpdate.setNombresegundo(empleado.getNombresegundo());
				empleadoUpdate.setApellidoprimero(empleado.getApellidoprimero());
				empleadoUpdate.setApellidosegundo(empleado.getApellidosegundo());
				empleadoUpdate.setCodigodv(empleado.getCodigodv());
			
				empleadoOut = empleadoServicio.save(empleadoUpdate);
			}
			else {
				empleadoOut = empleadoServicio.save(empleado);
			}
			if (empleadoOut!=null) {
				return new ResponseEntity<>(empleadoOut, HttpStatus.OK);
			}
			else {
				return new ResponseEntity<Void>(HttpStatus.CONFLICT);
			}
		}
		catch(Exception m) {
			return new ResponseEntity<Void>(HttpStatus.CONFLICT);
		}	
	}
	
	@DeleteMapping("empleado/{id}")
	public ResponseEntity<Void> BorrarEmpleado(@PathVariable(name = "id") Long id){

		try {
			Empleado empleadoUpdate = empleadoServicio.findByCodigo(id);
			if (empleadoUpdate!=null) {
				empleadoServicio.eliminar(empleadoUpdate);
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

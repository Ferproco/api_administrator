package com.nkseguridad.app.Controller;

import java.io.Console;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.nkseguridad.app.Entity.FormaPago;
import com.nkseguridad.app.Entity.Impuesto;
import com.nkseguridad.app.Service.IFormaPagoService;


@RestController
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST, RequestMethod.PUT, RequestMethod.DELETE})
@RequestMapping("api")
public class FormaPagoController {
	@Autowired
	private IFormaPagoService FormaPagoService;

	@GetMapping("formapago")
	public ResponseEntity<?> ListarFormaPagos() {
		List<FormaPago> LstFormaPagos = FormaPagoService.findAll();
		if (LstFormaPagos != null) {
			if (LstFormaPagos.size() != 0) {
				return new ResponseEntity<>(LstFormaPagos, HttpStatus.OK);
			} else {
				return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
			}
		} else {
			return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
		}
	}

	@GetMapping("formapago/{id}")
	public ResponseEntity<?> BuscarPorCodigo(@PathVariable(name = "id") Long id) {

		FormaPago formaPago = FormaPagoService.findByCodigo(id);
		if (formaPago != null) {
			return new ResponseEntity<>(formaPago, HttpStatus.OK);
		} else {
			return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
		}
	}


	@PostMapping("formapago")
	public ResponseEntity<?> GuardarFormaPago(@RequestBody FormaPago formaPago) {
		FormaPago formaPagoOut;
		try {
			FormaPago formaPagoUpdate = FormaPagoService.findByCodigo(formaPago.getId());
			if (formaPagoUpdate!=null) {
				formaPagoUpdate.setCodnegocio(formaPago.getCodnegocio());
				formaPagoUpdate.setNombre(formaPago.getNombre());				
				formaPagoUpdate.setDias(formaPago.getDias());				
				formaPagoUpdate.setStatus(formaPago.getStatus());	
				formaPagoOut= FormaPagoService.save(formaPagoUpdate);
			} 
			else {
				formaPagoOut= FormaPagoService.save(formaPago);				
			}
			if (formaPagoOut!=null) {
				return new ResponseEntity<>(formaPagoOut, HttpStatus.OK);
			}
			else {
				return new ResponseEntity<Void>(HttpStatus.CONFLICT);
			}
		} 
		catch (Exception m) {
			System.out.print("Error guardando "+m);
			
			return new ResponseEntity<Void>(HttpStatus.CONFLICT);
		}
	}

	@DeleteMapping("formapago/{id}")
	public ResponseEntity<Void> BorrarFormPago(@PathVariable(name = "id") Long id){

		try {
			FormaPago formaPagoUpdate = FormaPagoService.findByCodigo(id);
			if (formaPagoUpdate!=null) {
				FormaPagoService.eliminar(formaPagoUpdate);
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

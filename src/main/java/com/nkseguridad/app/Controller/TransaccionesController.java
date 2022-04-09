package com.nkseguridad.app.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.nkseguridad.app.Entity.Impuesto;
import com.nkseguridad.app.Entity.Transacciones;
import com.nkseguridad.app.Service.IImpuestoService;
import com.nkseguridad.app.Service.ITransaccionesService;

@RestController
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST, RequestMethod.PUT, RequestMethod.DELETE})
@RequestMapping("api")
public class TransaccionesController {
	
	@Autowired
	private ITransaccionesService transaccionServicio;
	
	@GetMapping("transacciones")
	public ResponseEntity<?> ListarTransacciones(){
		List<Transacciones> LstTransacciones = transaccionServicio.findAll();
		if (LstTransacciones!=null) {
			if (LstTransacciones.size()!=0) {
				return new ResponseEntity<>(LstTransacciones,HttpStatus.OK);
			}
			else {
				return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
			}
		}
		else {
			return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
		}
		
	}
	@PostMapping("transacciones")
	public ResponseEntity<?> GuardarTransacciones(@RequestBody Transacciones transaccion) {
		if (!transaccionServicio.findByExisteCodigo(transaccion.getNumerotransaccion())) {
			Transacciones TransaccionObj = transaccionServicio.save(transaccion);
			return new ResponseEntity<>(TransaccionObj, HttpStatus.CREATED);
		} else {
			return new ResponseEntity<Void>(HttpStatus.CONFLICT);
		}

	}


}

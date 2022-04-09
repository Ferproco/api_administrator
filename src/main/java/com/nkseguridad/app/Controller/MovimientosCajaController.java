package com.nkseguridad.app.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.nkseguridad.app.Entity.MovimientosCaja;
import com.nkseguridad.app.Service.IMovimientosCajaService;

@RestController
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST, RequestMethod.PUT, RequestMethod.DELETE})
@RequestMapping("api")
public class MovimientosCajaController {
	
	@Autowired
	private IMovimientosCajaService MovimientosCajaService;
	
	@GetMapping("movimientoscaja")
	public ResponseEntity<?> ListarMovimientosCaja() {
		List<MovimientosCaja> LstMovimientos = MovimientosCajaService.findAll();
		if (LstMovimientos != null) {
			if (LstMovimientos.size() != 0) {
				return new ResponseEntity<>(LstMovimientos, HttpStatus.OK);
			} else {
				return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
			}
		} else {
			return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
		}
	}
	
	
	@GetMapping("movimientoscaja/{codigocaja}")
	public ResponseEntity<?> ListarMovimientosCajaXCodigoCaja(@PathVariable(name="codigocaja") String codigocaja) {
		List<MovimientosCaja> LstMovimientos = MovimientosCajaService.findByCodigoCaja(codigocaja);
		if (LstMovimientos != null) {
			if (LstMovimientos.size() != 0) {
				return new ResponseEntity<>(LstMovimientos, HttpStatus.OK);
			} else {
				return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
			}
		} else {
			return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
		}
	}

}

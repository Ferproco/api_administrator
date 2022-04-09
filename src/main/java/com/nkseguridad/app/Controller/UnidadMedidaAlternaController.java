package com.nkseguridad.app.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.nkseguridad.app.Entity.Kardex;
import com.nkseguridad.app.Entity.UnidadMedidaAlterna;
import com.nkseguridad.app.Service.IUnidadMedidaAlternaService;

@RestController
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST, RequestMethod.PUT, RequestMethod.DELETE})
@RequestMapping("api")
public class UnidadMedidaAlternaController {
	
	@Autowired
	private IUnidadMedidaAlternaService unidadmedidaalternaService;
	
	@GetMapping("unidadmedidaalterna")
	public ResponseEntity<?> ListarUnidadesAlternas() {
		List<UnidadMedidaAlterna> LstUnidadesAlternas = unidadmedidaalternaService.findAll();
		if (LstUnidadesAlternas != null) {
			if (LstUnidadesAlternas.size() != 0) {
				return new ResponseEntity<>(LstUnidadesAlternas, HttpStatus.OK);
			} 
			else
				return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
		} 
		else
			return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
	}

}

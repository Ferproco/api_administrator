package com.nkseguridad.app.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.nkseguridad.app.Entity.Impuesto;
import com.nkseguridad.app.Entity.Ruta;
import com.nkseguridad.app.Entity.Unidadmedida;
import com.nkseguridad.app.Service.IUnidadMedidaService;

@RestController
@RequestMapping("api")
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST, RequestMethod.PUT, RequestMethod.DELETE})
public class UnidadMedidaController {

	@Autowired
	private IUnidadMedidaService UnidadMedidaService;
	
	@GetMapping("unidadmedida")	
	public ResponseEntity<?> ListarUnidades() {
		List<Unidadmedida> LstUnidades = UnidadMedidaService.findAll();
		if (LstUnidades != null) {
			if (LstUnidades.size() != 0) {
				return new ResponseEntity<>(LstUnidades, HttpStatus.OK);
			} else {
				return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
			}
		} else {
			return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
		}
	}
	
	@GetMapping("unidadmedida/{abrevunidadmedida}")
	public ResponseEntity<?> BuscarPorCodigo(@PathVariable(name = "abrevunidadmedida") String abrevunidadmedida) {

		Unidadmedida Unidad = UnidadMedidaService.findByCodigo(abrevunidadmedida);
		if (Unidad != null) {
			return new ResponseEntity<>(Unidad, HttpStatus.OK);
		} else {
			return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
		}
	}
	
	@PostMapping("unidadmedida")
	public ResponseEntity<?> GuardarUnidades(@RequestBody Unidadmedida unidad) {
		if (!UnidadMedidaService.findByExisteCodigo(unidad.getAbrevunidadmedida())) {
			Unidadmedida UnidadObj = UnidadMedidaService.save(unidad);
			return new ResponseEntity<>(UnidadObj, HttpStatus.CREATED);
		} else {
			return new ResponseEntity<Void>(HttpStatus.CONFLICT);
		}

	}

}

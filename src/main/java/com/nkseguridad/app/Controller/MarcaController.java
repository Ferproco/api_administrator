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

import com.nkseguridad.app.Entity.Articulo;
import com.nkseguridad.app.Entity.Impuesto;
import com.nkseguridad.app.Entity.Marca;
import com.nkseguridad.app.Service.IArticuloService;
import com.nkseguridad.app.Service.IMarcaService;

@RestController
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST, RequestMethod.PUT, RequestMethod.DELETE})
@RequestMapping("api")
public class MarcaController {

	@Autowired
	private IMarcaService marcaServicio;
	
	@GetMapping("marca")
	public ResponseEntity<?> ListarMarcas(){
		List<Marca> LstMarcas = marcaServicio.findAll();
		if (LstMarcas!=null) {
			if (LstMarcas.size()!=0) {
				return new ResponseEntity<>(LstMarcas,HttpStatus.OK);
			}
			else {
				return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
			}
		}
		else {
			return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
		}
		
	}
	
	@PostMapping("marca")
	public ResponseEntity<?> GuardarMarcas(@RequestBody Marca marca) {
		if (!marcaServicio.findByExisteCodigo(marca.getId())) {
			Marca marcaObj = marcaServicio.save(marca);
			return new ResponseEntity<>(marcaObj, HttpStatus.CREATED);
		} 
		else {
			return new ResponseEntity<Void>(HttpStatus.CONFLICT);
		}

	}

}

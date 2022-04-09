package com.nkseguridad.app.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.nkseguridad.app.Entity.Almacen;
import com.nkseguridad.app.Entity.Municipio;
import com.nkseguridad.app.Service.IAlmacenService;
import com.nkseguridad.app.Service.IMunicipioService;

@RestController
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST, RequestMethod.PUT, RequestMethod.DELETE})
@RequestMapping("api")
public class MunicipioController {
	
	@Autowired
	private IMunicipioService municipioServicio;
	
	@GetMapping("municipio")
	public ResponseEntity<?> ListarMunicipio(){
		List<Municipio> LstMunicipios = municipioServicio.findAll();
		if (LstMunicipios!=null) {
			if (LstMunicipios.size()!=0) {
				return new ResponseEntity<>(LstMunicipios,HttpStatus.OK);
			}
			else {
				return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
			}
		}
		else {
			return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
		}
		
	}
	@GetMapping("municipio/{coddepartamento}")
	public ResponseEntity<?> ListarMunicipiosXDepartamento(@PathVariable(name = "coddepartamento") Long coddepartamento){
		
		List<Municipio> LstMunicipios = municipioServicio.findByCoddepartamento(coddepartamento);
		if (LstMunicipios!=null) {
			if (LstMunicipios.size()!=0) {
				return new ResponseEntity<>(LstMunicipios,HttpStatus.OK);
			}
			else {
				return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
			}
		}
		else {
			return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
		}
		
		
	}

}

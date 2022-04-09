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


import com.nkseguridad.app.Entity.GrupoArticulo;
import com.nkseguridad.app.Service.IGrupoArticuloService;

@RestController
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST, RequestMethod.PUT, RequestMethod.DELETE})
@RequestMapping("api")
public class GrupoArticuloController {

	@Autowired
	private IGrupoArticuloService grupoArticuloService;
	
	@GetMapping("grupoarticulo")
	public ResponseEntity<?> ListarGrupoArticulos(){
		List<GrupoArticulo> LstGrupoArticulos = grupoArticuloService.findAll();
		if (LstGrupoArticulos!=null) {
			if (LstGrupoArticulos.size()!=0) {
				return new ResponseEntity<>(LstGrupoArticulos,HttpStatus.OK);
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

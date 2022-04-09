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


import com.nkseguridad.app.Entity.TipoContribuyente;
import com.nkseguridad.app.Service.ITipoContribuyenteService;

@RestController
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST, RequestMethod.PUT, RequestMethod.DELETE})
@RequestMapping("api")
public class TipoContribuyenteController {
	
	@Autowired
	private ITipoContribuyenteService tipocontribuyenteServicio;
	
	@GetMapping("tipocontribuyente")
	public ResponseEntity<?> ListarTipoContribuyentes(){
		List<TipoContribuyente> LstTipoContribuyentes = tipocontribuyenteServicio.findAll();
		if (LstTipoContribuyentes!=null) {
			if (LstTipoContribuyentes.size()!=0) {
				return new ResponseEntity<>(LstTipoContribuyentes,HttpStatus.OK);
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

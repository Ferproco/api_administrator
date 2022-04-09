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

import com.nkseguridad.app.Entity.Almacen;
import com.nkseguridad.app.Entity.TipoContacto;
import com.nkseguridad.app.Service.ITipoContactoService;

@RestController
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST, RequestMethod.PUT, RequestMethod.DELETE})
@RequestMapping("api")
public class TipoContactoController {
	
	@Autowired
	private ITipoContactoService tipocontactoService;
	
	@GetMapping("tipocontacto")
	public ResponseEntity<?> ListarTipoContacto(){
		List<TipoContacto> LstTipoContactos = tipocontactoService.findAll();
		if (LstTipoContactos!=null) {
			if (LstTipoContactos.size()!=0) {
				return new ResponseEntity<>(LstTipoContactos,HttpStatus.OK);
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

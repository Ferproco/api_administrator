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

import com.nkseguridad.app.Entity.Ruta;
import com.nkseguridad.app.Entity.TipoIdentificacion;
import com.nkseguridad.app.Service.ITipoIdentificacionService;


@RestController
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST, RequestMethod.PUT, RequestMethod.DELETE})
@RequestMapping("api")
public class TipoIdentificacionController {
	
	@Autowired
	private ITipoIdentificacionService tipoidentificacionService;
	
	@GetMapping("tipoidentificacion")
	public ResponseEntity<?> ListarTipoIdentificacion() {
		List<TipoIdentificacion> LstTipoIdentificacion = tipoidentificacionService.findAll();
		if (LstTipoIdentificacion != null) {
			if (LstTipoIdentificacion.size() != 0) {
				return new ResponseEntity<>(LstTipoIdentificacion, HttpStatus.OK);
			} else {
				return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
			}
		} else {
			return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
		}
	}

}

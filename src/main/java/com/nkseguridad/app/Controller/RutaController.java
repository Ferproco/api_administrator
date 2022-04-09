 package com.nkseguridad.app.Controller;

import java.io.Console;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.nkseguridad.app.Entity.Ruta;
import com.nkseguridad.app.Service.IRutaService;
import com.nkseguridad.app.Service.Implementation.VendedorService;

@RestController
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST, RequestMethod.PUT, RequestMethod.DELETE})
@RequestMapping("api")
public class RutaController {

	@Autowired
	private IRutaService RutaService;

	@GetMapping("ruta")
	public ResponseEntity<?> ListarRutas() {
		List<Ruta> LstRutas = RutaService.findAll();
		if (LstRutas != null) {
			if (LstRutas.size() != 0) {
				return new ResponseEntity<>(LstRutas, HttpStatus.OK);
			} else {
				return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
			}
		} else {
			return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
		}
	}
  
	@GetMapping("ruta/{codigo}")
	public ResponseEntity<?> BuscarPorCodigo(@PathVariable(name = "codigo") Long codigo) {

		Ruta Ruta = RutaService.findByIdRuta(codigo);
		if (Ruta != null) {
			return new ResponseEntity<>(Ruta, HttpStatus.OK);
		} else {
			return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
		}
	}
	
	@PostMapping("ruta")
	public ResponseEntity<?> GuardarRuta(@RequestBody Ruta Ruta) {
		try {
			Ruta RutaUpdate = RutaService.findByIdRuta(Ruta.getIdruta());
			if (RutaUpdate!=null) {
				return new ResponseEntity<Void>(HttpStatus.FOUND);
			} 
			else {				
				Ruta RutaOut= RutaService.save(Ruta);
				if (RutaOut!=null) {
					return new ResponseEntity<>(RutaOut, HttpStatus.OK);
				}
				else {
					return new ResponseEntity<Void>(HttpStatus.CONFLICT);
				}
				
			}
		} 
		catch (Exception m) {
			System.out.print("Error guardando "+m);
			return new ResponseEntity<Void>(HttpStatus.CONFLICT);
		}
	}


	@PutMapping("ruta")
	public ResponseEntity<?> ModificarRuta(@RequestBody Ruta Ruta) {
		try {
			Ruta RutaUpdate = RutaService.findByIdRuta(Ruta.getIdruta());
			if (RutaUpdate!=null) {
				RutaUpdate.setCodigovendedor(Ruta.getCodigovendedor());
				RutaUpdate.setCodigozona(Ruta.getCodigozona());
				RutaUpdate.setCodigozona(Ruta.getCodigozona());
				RutaUpdate.setCodnegocio(Ruta.getCodnegocio());
				RutaUpdate.setDesdedos(Ruta.getDesdedos());
				RutaUpdate.setDesdeuno(Ruta.getDesdeuno());
				RutaUpdate.setHastados(Ruta.getHastados());
				RutaUpdate.setHastauno(Ruta.getHastauno());
				RutaUpdate.setNombre(Ruta.getNombre());
				RutaUpdate.setVendedor(Ruta.getVendedor());
				RutaUpdate.setZona(Ruta.getZona());
				RutaUpdate.setStatus(Ruta.getStatus() );
				Ruta RutaOut= RutaService.save(RutaUpdate);
				if (RutaOut!=null) {
					return new ResponseEntity<>(RutaOut, HttpStatus.OK);
				}
				else {
					return new ResponseEntity<Void>(HttpStatus.CONFLICT);
				}
			} 
			else {
				return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
			}
		} 
		catch (Exception m) {
			System.out.print("Error guardando "+m);
			return new ResponseEntity<Void>(HttpStatus.CONFLICT);
		}
	}
}

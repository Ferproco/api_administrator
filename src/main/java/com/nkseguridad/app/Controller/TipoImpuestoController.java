package com.nkseguridad.app.Controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.nkseguridad.app.Entity.FormaPago;
import com.nkseguridad.app.Entity.Impuesto;
import com.nkseguridad.app.Entity.Ruta;
import com.nkseguridad.app.Entity.TipoImpuesto;
import com.nkseguridad.app.Service.ITipoImpuestoService;

@RestController
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST, RequestMethod.PUT, RequestMethod.DELETE})
@RequestMapping("api")
public class TipoImpuestoController {
	
	@Autowired
	private ITipoImpuestoService tipoimpuestoServicio;
	
	@GetMapping("tipoimpuesto")	
	public ResponseEntity<?> ListarTipoImpuestos(){
		List<TipoImpuesto> LstTipoImpuesto = tipoimpuestoServicio.findAll();
		if (LstTipoImpuesto!=null) {
			if (LstTipoImpuesto.size()!=0) {
				return new ResponseEntity<>(LstTipoImpuesto,HttpStatus.OK);
			}
			else {
				return new ResponseEntity<>(new ArrayList<TipoImpuesto>(),HttpStatus.NOT_FOUND);
			}
		}
		else {
			return new ResponseEntity<>(new ArrayList<TipoImpuesto>(), HttpStatus.NOT_FOUND);
		}
		
	}
	@PostMapping("tipoimpuesto")
	public ResponseEntity<?> GuardarTipoImpuesto(@RequestBody TipoImpuesto tipoimpuesto) {
		TipoImpuesto TipoimpuestoOut;
		try {
			TipoImpuesto TipoImpuestoUpdate = tipoimpuestoServicio.findByIdTipoImppuesto(tipoimpuesto.getId());
			if (TipoImpuestoUpdate!=null) {
				TipoImpuestoUpdate.setNombretipoimpuesto(tipoimpuesto.getNombretipoimpuesto());
				TipoImpuestoUpdate.setStatus(tipoimpuesto.getStatus());
								
				TipoimpuestoOut = tipoimpuestoServicio.save(TipoImpuestoUpdate);
			} 
			else {				
				TipoimpuestoOut = tipoimpuestoServicio.save(tipoimpuesto);			
			}
			if (TipoimpuestoOut!=null) {
				return new ResponseEntity<>(TipoimpuestoOut, HttpStatus.OK);
			}
			else {
				return new ResponseEntity<Void>(HttpStatus.CONFLICT);
			}
		} 
		catch (Exception m) {
			System.out.print("Error guardando "+m);
			return new ResponseEntity<Void>(HttpStatus.CONFLICT);
		}
	}
	@GetMapping("tipoimpuesto/{id}")
	public ResponseEntity<?> BuscarPorCodigo(@PathVariable(name = "id") Long id) {

		TipoImpuesto tipoimpuesto = tipoimpuestoServicio.findByIdTipoImppuesto(id);
		if (tipoimpuesto != null) {
			return new ResponseEntity<>(tipoimpuesto, HttpStatus.OK);
		} else {
			return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
		}
	}


	@DeleteMapping("tipoimpuesto/{id}")
	public ResponseEntity<Void> BorrarTipoImpuesto(@PathVariable(name = "id") Long id){

		try {
			TipoImpuesto formaPagoUpdate = tipoimpuestoServicio.findByIdTipoImppuesto(id);
			if (formaPagoUpdate!=null) {
				tipoimpuestoServicio.eliminar(formaPagoUpdate);
				return new ResponseEntity<Void>(HttpStatus.OK);
			}
			else {
				return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
			}			
		}
		catch(Exception m) {
			return new ResponseEntity<Void>(HttpStatus.CONFLICT);
		}
	}

}

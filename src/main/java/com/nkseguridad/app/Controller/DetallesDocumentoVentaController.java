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
import com.nkseguridad.app.Entity.DetallesDocumentoVenta;
import com.nkseguridad.app.Service.IDetallesDocumentoVentaService;

@RestController
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST, RequestMethod.PUT, RequestMethod.DELETE})
@RequestMapping("api")
public class DetallesDocumentoVentaController {
	
	@Autowired
	private IDetallesDocumentoVentaService detallesdocumentoventaServicio;
	
	@GetMapping("detallesdocumentoventa")
	public ResponseEntity<?> ListarDetallesDocumentoVenta(){
		List<DetallesDocumentoVenta> LstDetallesDocumentoVentas = detallesdocumentoventaServicio.findAll();
		if (LstDetallesDocumentoVentas!=null) {
			if (LstDetallesDocumentoVentas.size()!=0) 
				return new ResponseEntity<>(LstDetallesDocumentoVentas,HttpStatus.OK);			
			else 
				return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);		
		}
		else 
			return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);	
	}
	
	/*@GetMapping("detallesdocumentoventa/{id}")
	public ResponseEntity<?> BuscarDetallesPorCodigoDocumentoVenta(@PathVariable(name = "id") Long id) {

		List<DetallesDocumentoVenta> LstDetallesDocumentoVentas = detallesdocumentoventaServicio.findByCoddocumentoventa(id);
		if (LstDetallesDocumentoVentas!=null) {
			if (LstDetallesDocumentoVentas.size()!=0) 
				return new ResponseEntity<>(LstDetallesDocumentoVentas,HttpStatus.OK);			
			else 
				return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);		
		}
		else 
			return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);	
	}*/

}

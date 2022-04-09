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

import com.nkseguridad.app.Entity.DetallesDocumentoCompra;
import com.nkseguridad.app.Service.IDetallesDocumentoCompraService;

@RestController
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST, RequestMethod.PUT, RequestMethod.DELETE})
@RequestMapping("api")
public class DetallesDocumentoCompraController {
	@Autowired
	private IDetallesDocumentoCompraService detallesdocumentocompraServicio;
	
	@GetMapping("detallesdocumentocompra")
	public ResponseEntity<?> ListarDetallesDocumentoCompra(){
		List<DetallesDocumentoCompra> LstDetallesDocumentoCompras = detallesdocumentocompraServicio.findAll();
		if (LstDetallesDocumentoCompras!=null) {
			if (LstDetallesDocumentoCompras.size()!=0) 
				return new ResponseEntity<>(LstDetallesDocumentoCompras,HttpStatus.OK);			
			else 
				return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);		
		}
		else 
			return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);	
	}
	
	/*@GetMapping("detallesdocumentocompra/{id}")
	public ResponseEntity<?> BuscarDetallesPorCodigoDocumentoCompra(@PathVariable(name = "id") Long id) {

		List<DetallesDocumentoCompra> LstDetallesDocumentoCompras = detallesdocumentocompraServicio.findByCoddocumentocompra(id);
		if (LstDetallesDocumentoCompras!=null) {
			if (LstDetallesDocumentoCompras.size()!=0) 
				return new ResponseEntity<>(LstDetallesDocumentoCompras,HttpStatus.OK);			
			else 
				return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);		
		}
		else 
			return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);	
	}
*/

}

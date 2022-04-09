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

import com.nkseguridad.app.Entity.Cliente;
import com.nkseguridad.app.Entity.Proveedor;
import com.nkseguridad.app.Service.IProveedorService;

@RestController
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST, RequestMethod.PUT, RequestMethod.DELETE})
@RequestMapping("api")
public class ProveedorController {
	
	@Autowired
	private IProveedorService ProveedorService;
	
	@GetMapping("proveedor")
	public ResponseEntity<?> ListarProveedor(){
		List<Proveedor> LstProveedores = ProveedorService.findAll();
		if (LstProveedores!=null) {
			if (LstProveedores.size()!=0) {
				return new ResponseEntity<>(LstProveedores,HttpStatus.OK);
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

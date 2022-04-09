package com.nkseguridad.app.Controller;

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

import com.nkseguridad.app.Entity.Impuesto;
import com.nkseguridad.app.Entity.TipoDocumento;
import com.nkseguridad.app.Service.ITipoDocumentoService;

@RestController
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST, RequestMethod.PUT, RequestMethod.DELETE})
@RequestMapping("api")
public class TipoDocumentoController {

	
	@Autowired
	private ITipoDocumentoService tipodocumentoServicio;
	
	@GetMapping("tipodocumento")
	public ResponseEntity<?> ListarTipoDocumento(){
		List<TipoDocumento> LstTipoDocumentos = tipodocumentoServicio.findAll();
		if (LstTipoDocumentos!=null) {
			if (LstTipoDocumentos.size()!=0) {
				return new ResponseEntity<>(LstTipoDocumentos,HttpStatus.OK);
			}
			else {
				return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
			}
		}
		else {
			return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
		}
		
	}
	@PostMapping("tipodocumento")
	public ResponseEntity<?> GuardarTipoDocumento(@RequestBody TipoDocumento tipodocumento) {
		if (!tipodocumentoServicio.findByExisteCodigo(tipodocumento.getIdtipodocumento())) {
			TipoDocumento TipoDocumentoObj = tipodocumentoServicio.save(tipodocumento);
			return new ResponseEntity<>(TipoDocumentoObj, HttpStatus.CREATED);
		} 
		else {
			return new ResponseEntity<Void>(HttpStatus.CONFLICT);
		}

	}
	
	@DeleteMapping("tipodocumento/{id}")
	public ResponseEntity<Void> BorrarTipoDocumento(@PathVariable(name = "id") Long id){

		try {
			TipoDocumento TipoDocumentoObj = tipodocumentoServicio.findByCodigo(id);
			if (TipoDocumentoObj!=null) {
				tipodocumentoServicio.eliminar(TipoDocumentoObj);
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

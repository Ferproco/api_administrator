package com.nkseguridad.app.Controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.nkseguridad.app.Entity.Impuesto;
import com.nkseguridad.app.Entity.Negocio;
import com.nkseguridad.app.Entity.UsuarioNegocio;
import com.nkseguridad.app.Service.INegocioService;
import com.nkseguridad.app.Service.IUsuarioNegocioService;

@RestController
@CrossOrigin(origins = "*", methods = { RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT,
		RequestMethod.DELETE })
@RequestMapping("api")
public class NegocioController {

	@Autowired
	private INegocioService NegocioService;
	
	@Autowired
	private IUsuarioNegocioService UsuarioNegocioService;

	@GetMapping("negocio")
	public ResponseEntity<?> ListarNegocios() {
		List<Negocio> LstNegocios = NegocioService.findAll();
		if (LstNegocios != null) {
			if (LstNegocios.size() != 0) {
				return new ResponseEntity<>(LstNegocios, HttpStatus.OK);
			} else
				return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
		} else {
			return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
		}
	}

	@GetMapping("negocio/{codigo}")
	public ResponseEntity<?> ObtenerNegocioCodigo(@PathVariable(name = "codigo") String codigo) {

		Negocio ObjNegocio = NegocioService.findByCodigo(codigo);
		if (ObjNegocio != null) {
			return new ResponseEntity<>(ObjNegocio, HttpStatus.OK);
		} else {
			return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
		}
	}

	@GetMapping("negocio/buscarid/{id}")
	public ResponseEntity<?> ObtenerNegocioById(@PathVariable(name = "id") Long id) {

		Negocio ObjNegocio = NegocioService.findById(id);
		if (ObjNegocio != null) {
			return new ResponseEntity<>(ObjNegocio, HttpStatus.OK);
		} else {
			return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
		}
	}
	
	@GetMapping("negocio/listarxusuario/{id}")
	public ResponseEntity<?> ObtenerNegocioByIdUsuario(@PathVariable(name = "id") Long id) {

		List<UsuarioNegocio> LstObjNegocio = UsuarioNegocioService.findAllByIdUsuario(id);
		if (LstObjNegocio != null) {
			return new ResponseEntity<>(LstObjNegocio, HttpStatus.OK);
		} else {
			return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
		}
	}

	@PostMapping("negocio")
	public ResponseEntity<?> GuardarNegocio(@RequestBody Negocio negocio) {
		Negocio negocioOut;
		try {
			Negocio negocioUpdate = NegocioService.findByExisteCodigo(negocio);
			if (negocioUpdate != null) {
				negocioUpdate.setActualizadoel(new Date());
				negocioUpdate.setCantidadusuario(negocio.getCantidadusuario());
				negocioUpdate.setCodnegocio(negocio.getCodnegocio());
				negocioUpdate.setContribuyente(negocio.getContribuyente());
				negocioUpdate.setDireccion(negocio.getDireccion());
				negocioUpdate.setDominio(negocio.getDominio());
				negocioUpdate.setEmail(negocio.getEmail());
				negocioUpdate.setHabilitado(negocio.isHabilitado());
				negocioUpdate.setIp(negocio.getIp());
				negocioUpdate.setNombre(negocio.getNombre());
				negocioUpdate.setPuerto(negocio.getPuerto());
				negocioUpdate.setTelefono(negocio.getTelefono());
				negocioUpdate.setTelefonomovil(negocio.getTelefonomovil());
				negocioUpdate.setTiempocierresesion(negocio.getTiempocierresesion());
				negocioUpdate.setWeb(negocio.getWeb());
				negocioOut = NegocioService.save(negocioUpdate);				
			} 
			else {
				negocioOut = NegocioService.save(negocio);
				return new ResponseEntity<>(negocioOut, HttpStatus.CREATED);
			}
			if (negocioOut!=null) {
				return new ResponseEntity<>(negocioOut, HttpStatus.OK);
			}
			else {
				return new ResponseEntity<Void>(HttpStatus.CONFLICT);
			}

		} catch (Exception e) {
			return new ResponseEntity<Void>(HttpStatus.CONFLICT);
		}

	}
	
	@DeleteMapping("negocio/{id}")
	public ResponseEntity<Void> BorrarImpuesto(@PathVariable(name = "id") Long id){

		try {
			Negocio ObjNegocio = NegocioService.findById(id);
			if (ObjNegocio!=null) {
				NegocioService.eliminar(ObjNegocio);
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

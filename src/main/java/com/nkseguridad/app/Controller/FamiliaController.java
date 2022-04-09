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
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.nkseguridad.app.Entity.Almacen;
import com.nkseguridad.app.Entity.Familia;
import com.nkseguridad.app.Service.IFamiliaService;


@RestController
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST, RequestMethod.PUT, RequestMethod.DELETE})
@RequestMapping("api")

public class FamiliaController {
	@Autowired
	private IFamiliaService FamiliaService;

	@GetMapping("familia")
	public ResponseEntity<?> ListarFamilias() {
		List<Familia> LstFamilia = FamiliaService.findAll();
		if (LstFamilia != null) {
			if (LstFamilia.size() != 0) {
				return new ResponseEntity<>(LstFamilia, HttpStatus.OK);
			} else {
				return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
			}
		} else {
			return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
		}
	}
	
	@GetMapping("familia/{id}")
	public ResponseEntity<?> BuscarPorCodigo(@PathVariable(name = "id") Long id) {
		Familia Familia = FamiliaService.findByCodigo(id);
		if (Familia != null) {
			return new ResponseEntity<>(Familia, HttpStatus.OK);
		} else {
			return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
		}
	}

	@PostMapping("familia")
	public ResponseEntity<?> GuardarFamilia(@RequestBody Familia familia) {
		Familia familiaOut;
		try {
			if (familia != null) {
				
				Familia familiaupdate = FamiliaService.findByCodigo(familia.getCodfamilia());
				if (familiaupdate != null) {
					familiaupdate.setCodnegocio(familia.getCodnegocio());
					familiaupdate.setNomfamilia(familia.getNomfamilia());
					familiaupdate.setStatus(familia.getStatus());
					
					familiaOut = FamiliaService.save(familiaupdate);
					
				} 
				else {
					familiaOut = FamiliaService.save(familia);
				}	
				
				if (familiaOut!=null) {
					return new ResponseEntity<>(familiaOut, HttpStatus.OK);
				}
				else {
					return new ResponseEntity<Void>(HttpStatus.CONFLICT);
				}
			}
			else {
				return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
			}
			
		}catch (Exception e) {
			return new ResponseEntity<Void>(HttpStatus.CONFLICT);
		}


	}

	@PutMapping("familia")
	public ResponseEntity<?> ModificarFamilia(@RequestBody Familia Familia) {
		Familia FamiliaUpdate = FamiliaService.findByCodigo(Familia.getCodfamilia());
		if (FamiliaUpdate != null) {
			FamiliaUpdate.setNomfamilia(Familia.getNomfamilia());
			FamiliaUpdate.setCodnegocio(Familia.getCodnegocio());
			
			Familia FamiliaResult = FamiliaService.updateFamilia(FamiliaUpdate);
			if (FamiliaResult != null) {
				return new ResponseEntity<>(FamiliaResult, HttpStatus.OK);
			} else {
				return new ResponseEntity<Void>(HttpStatus.CONFLICT);
			}
		} else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}

	@DeleteMapping("familia/{id}")
	public ResponseEntity<Void> BorrarFamilia(@PathVariable(name = "id") Long id){

		try {
			Familia familiaUpdate = FamiliaService.findByCodigo(id);
			if (familiaUpdate!=null) {
				FamiliaService.eliminar(familiaUpdate);
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

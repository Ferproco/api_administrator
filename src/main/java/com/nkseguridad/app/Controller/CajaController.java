package com.nkseguridad.app.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.nkseguridad.app.Entity.Caja;
import com.nkseguridad.app.Entity.CajaNegocio;
import com.nkseguridad.app.Model.CajaNegocioFilter;
import com.nkseguridad.app.Service.ICajaService;


@RestController
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST, RequestMethod.PUT, RequestMethod.DELETE})
@RequestMapping("api")
public class CajaController {

	@Autowired
	private ICajaService CajaService;
	
	@GetMapping("caja")
	public ResponseEntity<?> ListarCajas() {
		List<Caja> LstCaja = CajaService.findAll();
		if (LstCaja != null) {
			if (LstCaja.size() != 0) {
				return new ResponseEntity<>(LstCaja, HttpStatus.OK);
			} else {
				return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
			}
		} else {
			return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
		}
	}

	@GetMapping("caja/{codigocaja}")
	public ResponseEntity<?> BuscarPorCodigo(@PathVariable(name = "codigocaja") Long codigocaja) {
		Caja caja = CajaService.findById(codigocaja);
		if (caja != null) {
			return new ResponseEntity<>(caja, HttpStatus.OK);
		} else {
			return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
		}
	}
	
	@PostMapping("caja/sucursal")
	public ResponseEntity<?> ListarCajasxSucursal(@RequestBody CajaNegocioFilter filter) {
		List<CajaNegocio> LstCaja = CajaService.findAllSucursal(filter);
		if (LstCaja != null) {
			if (LstCaja.size() != 0) {
				return new ResponseEntity<>(LstCaja, HttpStatus.OK);
			} else {
				return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
			}
		} else {
			return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
		}
	}
	
	@GetMapping("caja/{codigocaja}/{Fechadesde}/{Fechahasta}")
	public ResponseEntity<?> BuscarPorCodigoFecha(@PathVariable(name = "codigocaja") Long codigocaja,
												 @PathVariable(name = "Fechadesde") String Fechadesde,
												 @PathVariable(name = "Fechahasta") String Fechahasta) {
		Caja caja = CajaService.findById(codigocaja);
		if (caja != null) {
			return new ResponseEntity<>(caja, HttpStatus.OK);
		} else {
			return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
		}
	}


	@PostMapping("caja")
	public ResponseEntity<?> GuardarCaja(@RequestBody Caja caja) {
		if (!CajaService.findByExisteId(caja.getId())) 
		{
			Caja CajaObj = CajaService.save(caja);
			if (CajaObj != null)    {
				return new ResponseEntity<>(CajaObj, HttpStatus.CREATED);
			} else {
				return new ResponseEntity<Void>(HttpStatus.CONFLICT);
			}
			
		} 
		else 
		{
			return new ResponseEntity<Void>(HttpStatus.FOUND);
		}

	}

	@PutMapping("caja")
	public ResponseEntity<?> ModificarCaja(@RequestBody Caja caja) {
		Caja CajaUpdate = CajaService.findById(caja.getId());
		if (CajaUpdate != null) {
			CajaUpdate.setNombrecaja(caja.getNombrecaja());
			CajaUpdate.setCodnegocio(caja.getCodnegocio());
			CajaUpdate.setCodigocontable(caja.getCodigocontable());
			CajaUpdate.setFacturable(caja.getFacturable());
			CajaUpdate.setStatus(caja.getStatus());
			CajaUpdate.setTipocaja(caja.getTipocaja());
		
			//VendedorUpdate.setLstComisiones(Vendedor.getLstComisiones());
			Caja CajaResult = CajaService.updaCaja(CajaUpdate);
			if (CajaResult != null) {
				return new ResponseEntity<>(CajaResult , HttpStatus.OK);
			} else {
				return new ResponseEntity<Void>(HttpStatus.CONFLICT);
			}
		} else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}


}

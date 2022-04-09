package com.nkseguridad.app.Controller;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.InputStreamResource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.nkseguridad.app.Entity.Cliente;
import com.nkseguridad.app.Entity.Contacto;
import com.nkseguridad.app.Entity.DocumentoVenta;
import com.nkseguridad.app.Report.PDFDocumentGenerator;
import com.nkseguridad.app.Service.IClienteService;
import com.nkseguridad.app.Service.IDocumentoVentaService;
import com.nkseguridad.app.Service.Implementation.DocumentoVentaService;

@RestController
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST, RequestMethod.PUT, RequestMethod.DELETE})
@RequestMapping("api")
public class DocumentoVentaController {

	@Autowired
	private IDocumentoVentaService documentoventaService;
	
	@GetMapping("documentoventa")
	public ResponseEntity<?> ListarFacturas(){
		List<DocumentoVenta> lstFacturas = documentoventaService.findAll();
		if (lstFacturas!=null) {
			if (lstFacturas.size()!=0) {
				return new ResponseEntity<>(lstFacturas,HttpStatus.OK);
			}
			else {
				return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
			}
		}
		else {
			return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
		}
		
	}
	
	@GetMapping("documentoventa/{id}")
	public ResponseEntity<?> BuscarPorCodigo(@PathVariable(name = "id") Long id) {

		DocumentoVenta documento = documentoventaService.findById(id);
		if (documento != null) {
			return new ResponseEntity<>(documento, HttpStatus.OK);
		} else {
			return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
		}
	}
	
	@GetMapping("documentoventa/tipo/{tipodocumento}")
	public ResponseEntity<?> ListarDocumentosPorTipo(@PathVariable(name = "tipodocumento") String tipodocumento){
		List<DocumentoVenta> LstDocumentos = documentoventaService.findByTipodocumento(tipodocumento);
		if (LstDocumentos!=null) {
			if (LstDocumentos.size()!=0) 
				return new ResponseEntity<>(LstDocumentos,HttpStatus.OK);			
			else 
				return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);		
		}
		else 
			return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);	
	}
	
	@PostMapping("documentoventa")
	public ResponseEntity<?> GuardarDocumentoVenta(@RequestBody DocumentoVenta documento){
		DocumentoVenta documentoOut;
		try {
			DocumentoVenta documentoUpdate =  documentoventaService.findByNumerodocumento(documento.getNumerodocumento());
			if (documentoUpdate != null) {
				return new ResponseEntity<Void>(HttpStatus.FOUND);	
				/*documentoUpdate.setBaseimp(documento.getBaseimp());
			    documentoUpdate.setCodcontacto(documento.getCodcontacto());
				documentoUpdate.setCodformapago(documento.getCodformapago());
				documentoUpdate.setCodnegocio(documento.getCodnegocio());
				documentoUpdate.setCodruta(documento.getCodruta());
				documentoUpdate.setCodvendedor(documento.getCodvendedor());
				documentoUpdate.setContable(documento.getContable());
				documentoUpdate.setFecha(documento.getFecha());
				documentoUpdate.setFechaemision(documento.getFechaemision());
				documentoUpdate.setFechavencimiento(documento.getFechavencimiento());
				
				documentoUpdate.setIsrl(documento.getIsrl());
				documentoUpdate.setNumcontrol(documento.getNumcontrol());
				documentoUpdate.setNumerodocumento(documento.getNumerodocumento());
				documentoUpdate.setNumeroz(documento.getNumeroz());
				documentoUpdate.setNumretencion(documento.getNumretencion());
				documentoUpdate.setObservacion(documento.getObservacion());
				documentoUpdate.setPctiva_a(documento.getPctiva_a());
				documentoUpdate.setPctiva_b(documento.getPctiva_b());
				documentoUpdate.setReferencia(documento.getReferencia());
				documentoUpdate.setStatus(documento.getStatus());
				documentoUpdate.setStatus_cobro(documento.getStatus_cobro());
				documentoUpdate.setStatus_impresion(documento.getStatus_impresion());
				documentoUpdate.setTipodocumento(documento.getTipodocumento());
				
				
				documentoOut = documentoventaService.save(documentoUpdate);*/
			}
			else {
				documentoOut = documentoventaService.save(documento);
			}
			if (documentoOut!=null) {
				return new ResponseEntity<>(documentoOut, HttpStatus.OK);
			}
			else {
				return new ResponseEntity<Void>(HttpStatus.CONFLICT);
			}
		}
		catch(Exception m) {
			return new ResponseEntity<Void>(HttpStatus.CONFLICT);
		}	
	}
	
	//@GetMapping("documentoventa/{id}")
	@RequestMapping(value = "pdfreport/{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_PDF_VALUE)
	public ResponseEntity<InputStreamResource> DocumentVentaReport(@PathVariable(name = "id") Long id){

		DocumentoVenta documento = documentoventaService.findById(id);
		//if (documento != null) {
			ByteArrayInputStream bis = PDFDocumentGenerator.DocumentReport(documento);
			HttpHeaders headers = new HttpHeaders();
			headers.add("Content-Disposition", "attachment; filename=citiesreport.pdf");

			return ResponseEntity.ok().headers(headers).contentType(MediaType.APPLICATION_PDF)
					.body(new InputStreamResource(bis));
		//}
		/*else {
			return new ResponseEntity<Void>(HttpStatus.CONFLICT);
		}*/
	
	}

}

package com.nkseguridad.app.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.nkseguridad.app.Entity.DocumentoCompra;
import com.nkseguridad.app.Service.IDocumentoCompraService;

@RestController
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST, RequestMethod.PUT, RequestMethod.DELETE})
@RequestMapping("api")
public class DocumentoCompraController {

	
	@Autowired
	private IDocumentoCompraService documentocompraService;
	
	@GetMapping("documentocompra")
	public ResponseEntity<?> ListarFacturas(){
		List<DocumentoCompra> lstFacturas = documentocompraService.findAll();
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
	
	@GetMapping("documentocompra/{id}")
	public ResponseEntity<?> BuscarPorCodigo(@PathVariable(name = "id") Long id) {

		DocumentoCompra documento = documentocompraService.findById(id);
		if (documento != null) {
			return new ResponseEntity<>(documento, HttpStatus.OK);
		} else {
			return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
		}
	}
	
	@GetMapping("documentocompra/tipo/{tipodocumento}")
	public ResponseEntity<?> ListarDocumentosPorTipo(@PathVariable(name = "tipodocumento") String tipodocumento){
		List<DocumentoCompra> LstDocumentos = documentocompraService.findByTipodocumento(tipodocumento);
		if (LstDocumentos!=null) {
			if (LstDocumentos.size()!=0) 
				return new ResponseEntity<>(LstDocumentos,HttpStatus.OK);			
			else 
				return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);		
		}
		else 
			return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);	
	}
	
	@PostMapping("documentocompra")
	public ResponseEntity<?> GuardarDocumentoCompra(@RequestBody DocumentoCompra documento){
		DocumentoCompra documentoOut;
		try {
			DocumentoCompra documentoUpdate =  documentocompraService.findByNumerodocumento(documento.getNumerodocumento());
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
				documentoUpdate.setDocumentoid(documento.getDocumentoid());
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
				
				
				documentoOut = documentocompraService.save(documentoUpdate);*/
			}
			else {
				documentoOut = documentocompraService.save(documento);
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
	

}

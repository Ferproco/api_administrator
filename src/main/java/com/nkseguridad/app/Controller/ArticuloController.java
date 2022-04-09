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

import com.nkseguridad.app.Entity.Articulo;
import com.nkseguridad.app.Entity.Kardex;
import com.nkseguridad.app.Mapper.Mapper;
import com.nkseguridad.app.Model.ArticuloFilterKardex;
import com.nkseguridad.app.Model.MArticuloKardex;
import com.nkseguridad.app.Model.MKardex;
import com.nkseguridad.app.Service.IAlmacenService;
import com.nkseguridad.app.Service.IArticuloService;
import com.nkseguridad.app.Service.IKardexService;

 @RestController
 @CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST, RequestMethod.PUT, RequestMethod.DELETE})
 @RequestMapping("api")

 public class ArticuloController {

	@Autowired
	private IArticuloService articuloServicio;
	
	@Autowired
	private IKardexService kardexServicio;
	
	@Autowired
	private IAlmacenService almacenServicio;
	
	@GetMapping("articulo")
	public ResponseEntity<?> ListarArticulos(){
		List<Articulo> LstArticulos = articuloServicio.findAll();
		if (LstArticulos!=null) {
			if (LstArticulos.size()!=0) {
				return new ResponseEntity<>(LstArticulos,HttpStatus.OK);
			}
			else {
				return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
			}
		}
		else {
			return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
		}
		
	}
	
	@GetMapping("articulo/tipo/{tipo}")
	public ResponseEntity<?> ListarArticulosPorTipo(@PathVariable(name = "tipo") Long tipo){
		List<Articulo> LstArticulos = articuloServicio.findAllTipoProducto(tipo);
		if (LstArticulos!=null) {
			if (LstArticulos.size()!=0) 
				return new ResponseEntity<>(LstArticulos,HttpStatus.OK);			
			else 
				return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);		
		}
		else 
			return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);	
	}
	
	
	@PostMapping("articulo")
	public ResponseEntity<?> GuardarArticulos(@RequestBody Articulo articulo) {
		Articulo articuloOut;
		System.out.print("Articulo enviado" + articulo.toString());
		try {
			Articulo articuloUpdate = articuloServicio.findByCodigo(articulo.getCodigo());
			
			if (articuloUpdate != null) {				
				articuloUpdate.setNomarticulo(articulo.getNomarticulo());
				articuloUpdate.setPreciosugerido(articulo.getPreciosugerido());
				articuloUpdate.setCodfamilia(articulo.getCodfamilia());
				articuloUpdate.setCodimpuesto(articulo.getCodimpuesto());
				articuloUpdate.setCodmarca(articulo.getCodmarca());
				articuloUpdate.setCodnegocio(articulo.getCodnegocio());
				articuloUpdate.setCodigo(articulo.getCodigo());
				articuloUpdate.setCodigobarraprincipal(articulo.getCodigobarraprincipal());
				articuloUpdate.setCodtipoproducto(articulo.getCodtipoproducto());
				articuloUpdate.setCodunidadmedida(articulo.getCodunidadmedida());
				articuloUpdate.setColor(articulo.getColor());
				articuloUpdate.setDescripcionlarga(articulo.getDescripcionlarga());
				articuloUpdate.setReferencia(articulo.getReferencia());
				articuloUpdate.setSerial(articulo.getSerial());
				articuloUpdate.setCantidadreorden(articulo.getCantidadreorden());
				articuloUpdate.setPeso(articulo.getPeso());
				articuloUpdate.setStatus(articulo.getStatus());
				articuloUpdate.setStockminimo(articulo.getStockminimo());
				articuloUpdate.setStockmaximo(articulo.getStockmaximo());
				articuloUpdate.setTalla(articulo.getTalla());
				articuloUpdate.setEsimpoconsumo(articulo.getEsimpoconsumo());
				articuloUpdate.setPorcentajeimpoconsumo(articulo.getPorcentajeimpoconsumo());
				articuloUpdate.setValorimpoconsumo(articulo.getValorimpoconsumo());  
				articuloUpdate.setTipoiva(articulo.getTipoiva());
				articuloUpdate.setIvaincluido(articulo.getIvaincluido());
				
				articuloUpdate.setLstmovimientoskardex(null);
				articuloUpdate.setLstmovimientoskardex(articulo.getLstmovimientoskardex());
				articuloUpdate.setLstunidadesalternas(articulo.getLstunidadesalternas());
		
				articuloOut=articuloServicio.save(articuloUpdate);
			}
			else {
				articuloOut = articuloServicio.save(articulo);
			}
			if (articuloOut!=null) {
				return new ResponseEntity<>(articuloOut, HttpStatus.OK);
			}
			else {
				return new ResponseEntity<Void>(HttpStatus.CONFLICT);
			}
			
		}catch (Exception e) {
			return new ResponseEntity<Void>(HttpStatus.CONFLICT);
		}
		
	}
	
	@GetMapping("articulo/{id}")
	public ResponseEntity<?> BuscarPorId(@PathVariable(name = "id") Long id) {

		Articulo articulo = articuloServicio.findById(id);
		if (articulo != null) {
			return new ResponseEntity<>(articulo, HttpStatus.OK);
		} else {
			return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
		}
		
	}

	@DeleteMapping("articulo/{id}")
	public ResponseEntity<Void> BorrarArticulo(@PathVariable(name = "id") Long id){

		try {
			Articulo articuloUpdate = articuloServicio.findById(id);
			if (articuloUpdate!=null) {
				articuloServicio.eliminar(articuloUpdate);
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
	
	@PostMapping("transacciones/articulos")
	public ResponseEntity<?> ListarArticulosTransacciones(@RequestBody ArticuloFilterKardex filterarticulo) {
		try {
			System.out.println("el filtro trae " + filterarticulo.toString());
			List<Articulo> LstArticulos = articuloServicio.findAllFilterProducto(filterarticulo);
			if (LstArticulos!=null) {
				if (LstArticulos.size()!=0) {
					List<MArticuloKardex> LstMapperArticuloKardex = new ArrayList<>();
					for (Articulo articulo: LstArticulos) {
						MArticuloKardex articulokardexmapper = Mapper.convertirArticuloKardex(articulo);
						System.out.print(articulokardexmapper);
						filterarticulo.setArticulo_id(articulokardexmapper.getId());
						List<Kardex> LstKardexArticulos = kardexServicio.findAllMovimientosInventario(filterarticulo);
						for (Kardex kardex: LstKardexArticulos) {
							kardex.setAlmacen(almacenServicio.findByCodigo(kardex.getCodalmacen()));
						}
						articulokardexmapper.setLstmovimientoskardex(LstKardexArticulos);
						LstMapperArticuloKardex.add(articulokardexmapper);
					}
					
					return new ResponseEntity<>(LstMapperArticuloKardex,HttpStatus.OK);	
				}							
				else 
					return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
			}
			return new ResponseEntity<>(filterarticulo,HttpStatus.OK);
			
		}catch (Exception e) {
			return new ResponseEntity<Void>(HttpStatus.CONFLICT);
		}
		
	}
}

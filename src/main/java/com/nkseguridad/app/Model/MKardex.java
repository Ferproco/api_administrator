package com.nkseguridad.app.Model;

import java.util.Date;
import com.nkseguridad.app.Entity.Almacen;
import com.nkseguridad.app.Entity.Articulo;
import com.nkseguridad.app.Entity.Kardex;
import com.nkseguridad.app.Entity.Unidadmedida;

public class MKardex {
	
	
	private Long id;
	private Long documento_id;
	private Long articulo_id;
	private String tipo;
	private Date fecha;
	private String documentoasociado;
	private Double cantidad;
	private Double montoxunidad;
	private Long codunidadmedida;
	private Long codunidadalterna;
	private Double cantidadalterna;
	private Double montoxunidadalterna;
	private Double montototal;
	private Long codalmacen;

	private String concepto;
	private String origen;
	private Long codnegocio;
	private String numerocontrol;
	private String status;
	private Unidadmedida unidadmedida;
	private Almacen almacen;
	private Articulo articulo;

	public MKardex() {

	}

	
	public MKardex(Long id, Long documento_id, Long articulo_id, String tipo,
			Date fecha, String documentoasociado, Double cantidad, Double montoxunidad, Long codunidadmedida,
			Long codunidadalterna, Double cantidadalterna, Double montoxunidadalterna, Double montototal,
			Long codalmacen, String concepto, String origen, Long codnegocio, String numerocontrol, String status,
			Unidadmedida unidadmedida, Almacen almacen, Articulo articulo) {
		super();
		this.id = id;
		this.documento_id = documento_id;
		this.articulo_id = articulo_id;
		this.tipo = tipo;
		this.fecha = fecha;
		this.documentoasociado = documentoasociado;
		this.cantidad = cantidad;
		this.montoxunidad = montoxunidad;
		this.codunidadmedida = codunidadmedida;
		this.codunidadalterna = codunidadalterna;
		this.cantidadalterna = cantidadalterna;
		this.montoxunidadalterna = montoxunidadalterna;
		this.montototal = montototal;
		this.codalmacen = codalmacen;
		this.concepto = concepto;
		this.origen = origen;
		this.codnegocio = codnegocio;
		this.numerocontrol = numerocontrol;
		this.status = status;
		this.unidadmedida = unidadmedida;
		this.almacen = almacen;
		this.articulo = articulo;
	}
	
	public MKardex(Kardex kardexIn) {
		super();
		this.id = kardexIn.getId();
		this.documento_id = kardexIn.getDocumento_id();
		this.articulo_id = kardexIn.getArticulo_id();
		this.tipo = kardexIn.getTipo();
		this.fecha = kardexIn.getFecha();
		this.documentoasociado = kardexIn.getDocumentoasociado();
		this.cantidad = kardexIn.getCantidad();
		this.montoxunidad = kardexIn.getMontoxunidad();
		this.codunidadmedida = kardexIn.getCodunidadmedida();
		//this.codunidadalterna = kardexIn.c;
		this.cantidadalterna = kardexIn.getCantidadalterna();
		this.montoxunidadalterna = kardexIn.getMontoxunidadalterna();
		this.montototal = kardexIn.getMontototal();
		this.codalmacen = kardexIn.getCodalmacen();
		this.concepto = kardexIn.getConcepto();
		this.origen = kardexIn.getOrigen();
		this.codnegocio = kardexIn.getCodnegocio();
		this.numerocontrol = kardexIn.getNumerocontrol();
		this.status = kardexIn.getStatus();
		this.unidadmedida = kardexIn.getUnidadmedida();
		this.almacen = kardexIn.getAlmacen();
		//this.articulo = kardexIn.getArticulo();
		
	}


	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getDocumento_id() {
		return documento_id;
	}

	public void setDocumento_id(Long documento_id) {
		this.documento_id = documento_id;
	}

	public Long getArticulo_id() {
		return articulo_id;
	}

	public void setArticulo_id(Long articulo_id) {
		this.articulo_id = articulo_id;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public String getDocumentoasociado() {
		return documentoasociado;
	}

	public void setDocumentoasociado(String documentoasociado) {
		this.documentoasociado = documentoasociado;
	}

	public Double getCantidad() {
		return cantidad;
	}

	public void setCantidad(Double cantidad) {
		this.cantidad = cantidad;
	}

	public Double getMontoxunidad() {
		return montoxunidad;
	}

	public void setMontoxunidad(Double montoxunidad) {
		this.montoxunidad = montoxunidad;
	}

	public Long getCodunidadmedida() {
		return codunidadmedida;
	}

	public void setCodunidadmedida(Long codunidadmedida) {
		this.codunidadmedida = codunidadmedida;
	}

	public Long getCodunidadalterna() {
		return codunidadalterna;
	}

	public void setCodunidadalterna(Long codunidadalterna) {
		this.codunidadalterna = codunidadalterna;
	}

	public Double getCantidadalterna() {
		return cantidadalterna;
	}

	public void setCantidadalterna(Double cantidadalterna) {
		this.cantidadalterna = cantidadalterna;
	}

	public Double getMontoxunidadalterna() {
		return montoxunidadalterna;
	}

	public void setMontoxunidadalterna(Double montoxunidadalterna) {
		this.montoxunidadalterna = montoxunidadalterna;
	}

	public Double getMontototal() {
		return montototal;
	}

	public void setMontototal(Double montototal) {
		this.montototal = montototal;
	}

	public Long getCodalmacen() {
		return codalmacen;
	}

	public void setCodalmacen(Long codalmacen) {
		this.codalmacen = codalmacen;
	}

	public String getConcepto() {
		return concepto;
	}

	public void setConcepto(String concepto) {
		this.concepto = concepto;
	}

	public String getOrigen() {
		return origen;
	}

	public void setOrigen(String origen) {
		this.origen = origen;
	}

	public Long getCodnegocio() {
		return codnegocio;
	}

	public void setCodnegocio(Long codnegocio) {
		this.codnegocio = codnegocio;
	}

	public String getNumerocontrol() {
		return numerocontrol;
	}

	public void setNumerocontrol(String numerocontrol) {
		this.numerocontrol = numerocontrol;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Unidadmedida getUnidadmedida() {
		return unidadmedida;
	}

	public void setUnidadmedida(Unidadmedida unidadmedida) {
		this.unidadmedida = unidadmedida;
	}

	public Almacen getAlmacen() {
		return almacen;
	}

	public void setAlmacen(Almacen almacen) {
		this.almacen = almacen;
	}

	public Articulo getArticulo() {
		return articulo;
	}

	public void setArticulo(Articulo articulo) {
		this.articulo = articulo;
	}
	
	

}

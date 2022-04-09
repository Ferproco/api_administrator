package com.nkseguridad.app.Entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="transacciones",schema="public")
public class Transacciones implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="numerotransaccion")
	private Long numerotransaccion;
	
    private String codigoarticulo;
    private String tipo;
    private Date fecha;
    private String documentoasociado;
    private Double cantidad;
    private Double monto;
    private String almacen;
    private String unidadmedida;
    private String concepto;
    private String origen;
    private String codnegocio;
    private String unidadmedidaalterna;
    private String codigocontable;
    private Double cantidadalterna;
    private Double montoprecio;
    private String nombrealmacen;
    private String nombrearticulo;
    private String nombreunidadmedida;
    private String  nombreunidadmedidaalterna;
    private Long codigofamilia;
    private String nombrefamilia;
    private String codigogrupoarticulo;
    private String nombregrupoarticulo;
    private Long codigomarca;
    private String nombremarca;
    private Double costounitario;
    private String numerocontrol;
    
	public Long getNumerotransaccion() {
		return numerotransaccion;
	}
	public void setNumerotransaccion(Long numerotransaccion) {
		this.numerotransaccion = numerotransaccion;
	}
	public String getCodigoarticulo() {
		return codigoarticulo;
	}
	public void setCodigoarticulo(String codigoarticulo) {
		this.codigoarticulo = codigoarticulo;
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
	public Double getMonto() {
		return monto;
	}
	public void setMonto(Double monto) {
		this.monto = monto;
	}
	public String getAlmacen() {
		return almacen;
	}
	public void setAlmacen(String almacen) {
		this.almacen = almacen;
	}
	public String getUnidadmedida() {
		return unidadmedida;
	}
	public void setUnidadmedida(String unidadmedida) {
		this.unidadmedida = unidadmedida;
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
	public String getCodnegocio() {
		return codnegocio;
	}
	public void setCodnegocio(String codnegocio) {
		this.codnegocio = codnegocio;
	}
	public String getUnidadmedidaalterna() {
		return unidadmedidaalterna;
	}
	public void setUnidadmedidaalterna(String unidadmedidaalterna) {
		this.unidadmedidaalterna = unidadmedidaalterna;
	}
	public String getCodigocontable() {
		return codigocontable;
	}
	public void setCodigocontable(String codigocontable) {
		this.codigocontable = codigocontable;
	}
	public Double getCantidadalterna() {
		return cantidadalterna;
	}
	public void setCantidadalterna(Double cantidadalterna) {
		this.cantidadalterna = cantidadalterna;
	}
	public Double getMontoprecio() {
		return montoprecio;
	}
	public void setMontoprecio(Double montoprecio) {
		this.montoprecio = montoprecio;
	}
	public String getNombrealmacen() {
		return nombrealmacen;
	}
	public void setNombrealmacen(String nombrealmacen) {
		this.nombrealmacen = nombrealmacen;
	}
	public String getNombrearticulo() {
		return nombrearticulo;
	}
	public void setNombrearticulo(String nombrearticulo) {
		this.nombrearticulo = nombrearticulo;
	}
	public String getNombreunidadmedida() {
		return nombreunidadmedida;
	}
	public void setNombreunidadmedida(String nombreunidadmedida) {
		this.nombreunidadmedida = nombreunidadmedida;
	}
	public String getNombreunidadmedidaalterna() {
		return nombreunidadmedidaalterna;
	}
	public void setNombreunidadmedidaalterna(String nombreunidadmedidaalterna) {
		this.nombreunidadmedidaalterna = nombreunidadmedidaalterna;
	}
	public Long getCodigofamilia() {
		return codigofamilia;
	}
	public void setCodigofamilia(Long codigofamilia) {
		this.codigofamilia = codigofamilia;
	}
	public String getNombrefamilia() {
		return nombrefamilia;
	}
	public void setNombrefamilia(String nombrefamilia) {
		this.nombrefamilia = nombrefamilia;
	}
	public String getCodigogrupoarticulo() {
		return codigogrupoarticulo;
	}
	public void setCodigogrupoarticulo(String codigogrupoarticulo) {
		this.codigogrupoarticulo = codigogrupoarticulo;
	}
	public String getNombregrupoarticulo() {
		return nombregrupoarticulo;
	}
	public void setNombregrupoarticulo(String nombregrupoarticulo) {
		this.nombregrupoarticulo = nombregrupoarticulo;
	}
	public Long getCodigomarca() {
		return codigomarca;
	}
	public void setCodigomarca(Long codigomarca) {
		this.codigomarca = codigomarca;
	}
	public String getNombremarca() {
		return nombremarca;
	}
	public void setNombremarca(String nombremarca) {
		this.nombremarca = nombremarca;
	}
	public Double getCostounitario() {
		return costounitario;
	}
	public void setCostounitario(Double costounitario) {
		this.costounitario = costounitario;
	}
	public String getNumerocontrol() {
		return numerocontrol;
	}
	public void setNumerocontrol(String numerocontrol) {
		this.numerocontrol = numerocontrol;
	}

}

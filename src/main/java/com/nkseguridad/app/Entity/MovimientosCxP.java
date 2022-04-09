package com.nkseguridad.app.Entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "movimientoscxp", schema = "public")
public class MovimientosCxP implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 519104991998282924L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private Long id;	
	private String tipo;
	private Integer numerocxc;	
	
	@Column(name="codnegocio")
	private Long codnegocio;
	
	private Date fecha;
	private String concepto;
	private String referencia;
	private Double monto;
	private String codigocontable;
	private String documentostr;
	
	@ManyToOne
	@JoinColumn(name = "codnegocio", insertable = false, updatable = false)
	private Negocio negocio;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public Integer getNumerocxc() {
		return numerocxc;
	}

	public void setNumerocxc(Integer numerocxc) {
		this.numerocxc = numerocxc;
	}

	public Long getCodnegocio() {
		return codnegocio;
	}

	public void setCodnegocio(Long codnegocio) {
		this.codnegocio = codnegocio;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public String getConcepto() {
		return concepto;
	}

	public void setConcepto(String concepto) {
		this.concepto = concepto;
	}

	public String getReferencia() {
		return referencia;
	}

	public void setReferencia(String referencia) {
		this.referencia = referencia;
	}

	public Double getMonto() {
		return monto;
	}

	public void setMonto(Double monto) {
		this.monto = monto;
	}

	public String getCodigocontable() {
		return codigocontable;
	}

	public void setCodigocontable(String codigocontable) {
		this.codigocontable = codigocontable;
	}

	public String getDocumentostr() {
		return documentostr;
	}

	public void setDocumentostr(String documentostr) {
		this.documentostr = documentostr;
	}

	public Negocio getNegocio() {
		return negocio;
	}

	public void setNegocio(Negocio negocio) {
		this.negocio = negocio;
	} 

	


}

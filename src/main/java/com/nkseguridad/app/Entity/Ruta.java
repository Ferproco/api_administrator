  package com.nkseguridad.app.Entity;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "rutas", schema = "public")
public class Ruta implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -8834059398404021573L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idruta")
	private Long idruta;
	
	@Column(name = "nombre", nullable = false, length = 120)
	private String nombre;	
	private Long codigozona;
	private Long codigovendedor;
	private Long codnegocio;
	
	private String desdeuno;
	private String hastauno;
	private String desdedos;
	private String hastados;		
	private String status;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "codigozona", insertable = false, updatable = false)
	private Zona zona;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "codigovendedor", insertable = false, updatable = false)
	private Vendedor vendedor;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "codnegocio", insertable = false, updatable = false)
	private Negocio negocio;

	public Long getIdruta() {
		return idruta;
	}

	public void setIdruta(Long idruta) {
		this.idruta = idruta;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Long getCodigozona() {
		return codigozona;
	}

	public void setCodigozona(Long codigozona) {
		this.codigozona = codigozona;
	}

	public Long getCodigovendedor() {
		return codigovendedor;
	}

	public void setCodigovendedor(Long codigovendedor) {
		this.codigovendedor = codigovendedor;
	}

	public Long getCodnegocio() {
		return codnegocio;
	}

	public void setCodnegocio(Long codnegocio) {
		this.codnegocio = codnegocio;
	}

	public String getDesdeuno() {
		return desdeuno;
	}

	public void setDesdeuno(String desdeuno) {
		this.desdeuno = desdeuno;
	}

	public String getHastauno() {
		return hastauno;
	}

	public void setHastauno(String hastauno) {
		this.hastauno = hastauno;
	}

	public String getDesdedos() {
		return desdedos;
	}

	public void setDesdedos(String desdedos) {
		this.desdedos = desdedos;
	}

	public String getHastados() {
		return hastados;
	}

	public void setHastados(String hastados) {
		this.hastados = hastados;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Zona getZona() {
		return zona;
	}

	public void setZona(Zona zona) {
		this.zona = zona;
	}

	public Vendedor getVendedor() {
		return vendedor;
	}

	public void setVendedor(Vendedor vendedor) {
		this.vendedor = vendedor;
	}

	public Negocio getNegocio() {
		return negocio;
	}

	public void setNegocio(Negocio negocio) {
		this.negocio = negocio;
	}		
	


}

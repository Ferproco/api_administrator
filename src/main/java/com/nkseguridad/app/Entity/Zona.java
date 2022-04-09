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
@Table(name = "zonas", schema = "public")
public class Zona implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -2771219205999752823L;		
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long codzona;
	
	@Column(name = "nomzona", nullable = false, length = 120)
	private String nomzona;
	
	@Column(name = "codnegocio", nullable = false, length = 15)
	private Long codnegocio;
	
	private String status;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "codnegocio", insertable = false, updatable = false)
	private Negocio negocio;
	
	
	public Long getCodzona() {
		return codzona;
	}
	public void setCodzona(Long codzona) {
		this.codzona = codzona;
	}
	public String getNomzona() {
		return nomzona;
	}
	public void setNomzona(String nomzona) {
		this.nomzona = nomzona;
	}
	public Long getCodnegocio() {
		return codnegocio;
	}
	public void setCodnegocio(Long codnegocio) {
		this.codnegocio = codnegocio;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Negocio getNegocio() {
		return negocio;
	}
	public void setNegocio(Negocio negocio) {
		this.negocio = negocio;
	}


}

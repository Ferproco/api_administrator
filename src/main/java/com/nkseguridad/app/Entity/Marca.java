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
@Table(name = "marca", schema = "public")
public class Marca implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -5233708009259466908L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long id;
	@Column(name = "nommarca",length=120)
	private String nommarca;
	private Long codnegocio;
	@Column(name = "status",length=10)
	private String status;
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "codnegocio", insertable = false, updatable = false)
	private Negocio negocio;
	
	public Negocio getNegocio() {
		return negocio;
	}
	public void setNegocio(Negocio negocio) {
		this.negocio = negocio;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNommarca() {
		return nommarca;
	}
	public void setNommarca(String nommarca) {
		this.nommarca = nommarca;
	}
	public Long getCodnegocio() {
		return codnegocio;
	}
	public void setCodnegocio(Long codnegocio) {
		this.codnegocio = codnegocio;
	}
	
	
	
  	

}

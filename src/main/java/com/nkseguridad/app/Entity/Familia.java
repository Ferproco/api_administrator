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
@Table(name = "familia", schema = "public")
public class Familia implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -8340543287616596516L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "codfamilia")
	private Long codfamilia;
	
	@Column(name = "nomfamilia",length=120)
	private String nomfamilia;
	
	@Column(name = "codnegocio")
	private Long codnegocio;
	
	
	@Column(name = "imagen")
	private Byte[] imagen;
	@Column(name = "status")
	private String status;
	
	@ManyToOne
	@JoinColumn(name = "codnegocio", insertable = false, updatable = false)
	private Negocio negocio;
	
	public Long getCodnegocio() {
		return codnegocio;
	}

	public void setCodnegocio(Long codnegocio) {
		this.codnegocio = codnegocio;
	}

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

	public Long getCodfamilia() {
		return codfamilia;
	}

	public void setCodfamilia(Long codfamilia) {
		this.codfamilia = codfamilia;
	}

	public String getNomfamilia() {
		return nomfamilia;
	}

	public void setNomfamilia(String nomfamilia) {
		this.nomfamilia = nomfamilia;
	}


	public Byte[] getImagen() {
		return imagen;
	}

	public void setImagen(Byte[] imagen) {
		this.imagen = imagen;
	}

	
	public Familia() {
		
	}

	
	

}

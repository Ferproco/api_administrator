package com.nkseguridad.app.Entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "cajanegocio", schema = "public")
public class CajaNegocio implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7738321368390459227L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idcajanegocio;
	
	@Column(name = "codnegocio")
	private Long codnegocio;
	
	@Column(name = "idusuario")
	private Long idusuario;
	
	@Column(name = "codigocaja")
	private Long codigocaja;
	
		
	@ManyToOne
 	@JoinColumn(name = "codigocaja", insertable = false, updatable = false)
 	private Caja caja;

	public Long getIdcajanegocio() {
		return idcajanegocio;
	}

	public void setIdcajanegocio(Long idcajanegocio) {
		this.idcajanegocio = idcajanegocio;
	}

	public Long getCodnegocio() {
		return codnegocio;
	}

	public void setCodnegocio(Long codnegocio) {
		this.codnegocio = codnegocio;
	}

	public Long getIdusuario() {
		return idusuario;
	}

	public void setIdusuario(Long idusuario) {
		this.idusuario = idusuario;
	}

	public Long getCodigocaja() {
		return codigocaja;
	}

	public void setCodigocaja(Long codigocaja) {
		this.codigocaja = codigocaja;
	}

	public Caja getCaja() {
		return caja;
	}

	public void setCaja(Caja caja) {
		this.caja = caja;
	}
	
	
	
}

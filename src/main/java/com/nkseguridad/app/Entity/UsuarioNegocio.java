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
@Table(name = "usuarionegocio", schema = "public")
public class UsuarioNegocio implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3927419182107996813L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idusuarionegocio;
	
	@Column(name = "idusuario")
	private Long idusuario;
	
	private Long codnegocio;
	
	@ManyToOne
 	@JoinColumn(name = "codnegocio", insertable = false, updatable = false)
 	private Negocio negocio;

	public Long getIdusuarionegocio() {
		return idusuarionegocio;
	}

	public void setIdusuarionegocio(Long idusuarionegocio) {
		this.idusuarionegocio = idusuarionegocio;
	}

	public Long getIdusuario() {
		return idusuario;
	}

	public void setIdusuario(Long idusuario) {
		this.idusuario = idusuario;
	}

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
	
	
	
}

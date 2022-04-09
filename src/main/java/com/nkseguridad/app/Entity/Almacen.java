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
@Table(name="almacen",schema="public")
public class Almacen implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="idalmacen")
	private Long idalmacen;
	
	@Column(name="codalmacen",length=3)
	private String codalmacen;
	
	@Column(name="codnegocio")
	private Long codnegocio;
	
	@Column(name="nombre",length=120)
	private String nombre;
	
	private Boolean principal;
	
	@Column(name="tipoalmacen",length=120)
	private String tipoalmacen;
	
	@Column(name="direccion",length=255)
	private String direccion;
	
	@Column(name="status",length=10)
	private String status; 	 
	
	@ManyToOne
	@JoinColumn(name = "codnegocio", insertable = false, updatable = false)
	private Negocio negocio;
	
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public Long getIdalmacen() {
		return idalmacen;
	}
	public void setIdalmacen(Long idalmacen) {
		this.idalmacen = idalmacen;
	}
	public String getCodalmacen() {
		return codalmacen;
	}
	public void setCodalmacen(String codalmacen) {
		this.codalmacen = codalmacen;
	}
	public Long getCodnegocio() {
		return codnegocio;
	}
	public void setCodnegocio(Long codnegocio) {
		this.codnegocio = codnegocio;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Boolean getPrincipal() {
		return principal;
	}
	public void setPrincipal(Boolean principal) {
		this.principal = principal;
	}
	public String getTipoalmacen() {
		return tipoalmacen;
	}
	public void setTipoalmacen(String tipoalmacen) {
		this.tipoalmacen = tipoalmacen;
	}
	public Negocio getNegocio() {
		return negocio;
	}
	public void setNegocio(Negocio negocio) {
		this.negocio = negocio;
	}
	
}

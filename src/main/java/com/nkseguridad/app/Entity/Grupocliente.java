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
@Table(name = "grupocliente", schema = "public")
public class Grupocliente implements Serializable {
	
	/**
	 * 
	 */
	
	private static final long serialVersionUID = 6482138986133069178L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)	
	private Long idgrupocliente;

    @Column(name = "nombre", nullable = false, length = 120)	
    private String nombre;
    
    @Column(name = "codnegocio")
    private Long codnegocio;
    
    @Column(name = "status", nullable = false, length = 10)
    private String status;
    
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "codnegocio", updatable = false, insertable = false)
    private Negocio negocio;
    
    
	public Long getIdgrupocliente() {
		return idgrupocliente;
	}
	public void setIdgrupocliente(Long idgrupocliente) {
		this.idgrupocliente = idgrupocliente;
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
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	

}

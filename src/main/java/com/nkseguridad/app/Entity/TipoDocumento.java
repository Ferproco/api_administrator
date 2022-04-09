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
@Table(name="tipodocumento",schema="public")
public class TipoDocumento implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="idtipodocumento")
	private Long idtipodocumento;  
	
	@Column(name= "nombre",length=120)
	private String nombre;
	
    @Column(name="status",length=10)
    private String status;
    
    private String nombrelogicodocumento;
    
    private String tipo;
    
	@Column(name = "codpais", nullable = true)
	private Long codpais;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "codpais", insertable = false, updatable = false)
	private Pais pais;

	public Long getIdtipodocumento() {
		return idtipodocumento;
	}

	public void setIdtipodocumento(Long idtipodocumento) {
		this.idtipodocumento = idtipodocumento;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getNombrelogicodocumento() {
		return nombrelogicodocumento;
	}

	public void setNombrelogicodocumento(String nombrelogicodocumento) {
		this.nombrelogicodocumento = nombrelogicodocumento;
	}

	public Long getCodpais() {
		return codpais;
	}

	public void setCodpais(Long codpais) {
		this.codpais = codpais;
	}

	public Pais getPais() {
		return pais;
	}

	public void setPais(Pais pais) {
		this.pais = pais;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	
}

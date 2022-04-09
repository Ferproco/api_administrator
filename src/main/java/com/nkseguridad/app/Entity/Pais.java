package com.nkseguridad.app.Entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "pais", schema = "public")
public class Pais implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 7761843299255344427L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long Id;
	
	@Column(name = "codigo", length = 4, insertable = false, updatable = false)
	private String codigo;
	
	@Column(name = "nombre", length = 120, insertable = false, updatable = false)
	private String nombre;
	
	@Column(name = "status", length = 10, insertable = false, updatable = false)
	private String status;

	
	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public Long getId() {
		return Id;
	}

	public void setId(Long id) {
		Id = id;
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
	

}

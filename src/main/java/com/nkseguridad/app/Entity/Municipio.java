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
@Table(name = "municipio", schema = "public")
public class Municipio implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "codigo", length = 4, insertable = false, updatable = false)
	private String codigo;
	
	@Column(name = "nombre", length = 120, insertable = false, updatable = false)
	private String nombre;
	
	@Column(name = "status", length = 10, insertable = false, updatable = false)
	private String status;
	
	@Column(name = "codciudad")
	private String codciudad;
	
	@Column(name = "coddepartamento")
	private Long coddepartamento;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "coddepartamento", insertable = false, updatable = false)
	private Departamento departamento;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
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

	public Long getCoddepartamento() {
		return coddepartamento;
	}

	public void setCoddepartamento(Long coddepartamento) {
		this.coddepartamento = coddepartamento;
	}

	public Departamento getDepartamento() {
		return departamento;
	}

	public void setDepartamento(Departamento departamento) {
		this.departamento = departamento;
	}
	

}

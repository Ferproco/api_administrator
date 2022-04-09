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
@Table(name = "tipoidentificacion", schema = "public")
public class TipoIdentificacion implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
    private Long id;
	
	@Column(name="codigo",length=10)
    private String codigo;
	
	@Column(name="nombre",length=120)
    private String nombre;
	
	@Column(name = "codpais", nullable = true)
	private Long codpais;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "codpais", insertable = false, updatable = false)
	private Pais pais;
	
	@Column(name = "requieredv")
	private Boolean requieredigitoveroficador;
	
	 
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
	public Boolean getRequieredigitoveroficador() {
		return requieredigitoveroficador;
	}
	public void setRequieredigitoveroficador(Boolean requieredigitoveroficador) {
		this.requieredigitoveroficador = requieredigitoveroficador;
	}
	
	
}

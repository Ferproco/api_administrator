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
@Table(name = "giro", schema = "public")
public class GiroOActividad implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3997887811521694733L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)	
	private Long idgiro;
	
	@Column(name = "codpais", nullable = true)
	private Long codpais;
	
	@Column(name = "codigo", nullable = false, length = 10)
	private String codigo;
	
	@Column(name = "descripcion", nullable = false, length = 250)
	private String descripcion;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "codpais", insertable = false, updatable = false)
	private Pais pais;

}

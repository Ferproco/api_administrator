package com.nkseguridad.app.Entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "empresa", schema = "public")
public class Empresa implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -5910219881397790223L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)	
	private Long idempresa;
	
	@Column(name = "codnegocio", nullable = false, length = 15)
	private String codnegocio;
	
	@Column(name = "razonsocial", nullable = false, length = 120)
	private String razonsocial;
	
	@Column(name = "codgirooactividad", nullable = true)
	private Long codgirooactividad;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "codgirooactividad", insertable = false, updatable = false)
	private GiroOActividad girooactividad;
	
	@Column(name = "fechainicioactividad")
	@Temporal(TemporalType.DATE)
	private Date fechainicioactividad;

	@Column(name = "fechaderesolucion", nullable = true)
	@Temporal(TemporalType.DATE)
	private Date fechaderesolucion;
	
	@Column(name = "numeroresolucion", nullable = true)
	private Integer numeroresolucion;
	
	@Column(name = "numerodocumentorepresentantelegal", nullable = true)
	private String numerodocumentorepresentantelegal;
	
	@Column(name = "nombrerepresentantelegal", nullable = true)
	private String nombrerepresentantelegal;
	
	@Column(name = "apellidorepresentantelegal", nullable = true)
	private String apellidorepresentantelegal;
	
	@Column(name = "codpais", nullable = true)
	private Long codpais;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "codpais", insertable = false, updatable = false)
	private Pais pais;
	
	@Column(name="coddepartamento")
    private Long coddepartamento;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "coddepartamento", insertable = false, updatable = false)
	private Departamento departamento;
    
    @Column(name="codmunicipio")
    private Long codmunicipio;
    
    @ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "codmunicipio", insertable = false, updatable = false)
	private Municipio municipio;

	public Long getIdempresa() {
		return idempresa;
	}

	public void setIdempresa(Long idempresa) {
		this.idempresa = idempresa;
	}

	public String getCodnegocio() {
		return codnegocio;
	}

	public void setCodnegocio(String codnegocio) {
		this.codnegocio = codnegocio;
	}

	public String getRazonsocial() {
		return razonsocial;
	}

	public void setRazonsocial(String razonsocial) {
		this.razonsocial = razonsocial;
	}

	public Long getCodgirooactividad() {
		return codgirooactividad;
	}

	public void setCodgirooactividad(Long codgirooactividad) {
		this.codgirooactividad = codgirooactividad;
	}

	public GiroOActividad getGirooactividad() {
		return girooactividad;
	}

	public void setGirooactividad(GiroOActividad girooactividad) {
		this.girooactividad = girooactividad;
	}

	public Date getFechainicioactividad() {
		return fechainicioactividad;
	}

	public void setFechainicioactividad(Date fechainicioactividad) {
		this.fechainicioactividad = fechainicioactividad;
	}

	public Date getFechaderesolucion() {
		return fechaderesolucion;
	}

	public void setFechaderesolucion(Date fechaderesolucion) {
		this.fechaderesolucion = fechaderesolucion;
	}

	public Integer getNumeroresolucion() {
		return numeroresolucion;
	}

	public void setNumeroresolucion(Integer numeroresolucion) {
		this.numeroresolucion = numeroresolucion;
	}

	public String getNumerodocumentorepresentantelegal() {
		return numerodocumentorepresentantelegal;
	}

	public void setNumerodocumentorepresentantelegal(String numerodocumentorepresentantelegal) {
		this.numerodocumentorepresentantelegal = numerodocumentorepresentantelegal;
	}

	public String getNombrerepresentantelegal() {
		return nombrerepresentantelegal;
	}

	public void setNombrerepresentantelegal(String nombrerepresentantelegal) {
		this.nombrerepresentantelegal = nombrerepresentantelegal;
	}

	public String getApellidorepresentantelegal() {
		return apellidorepresentantelegal;
	}

	public void setApellidorepresentantelegal(String apellidorepresentantelegal) {
		this.apellidorepresentantelegal = apellidorepresentantelegal;
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

	public Long getCodmunicipio() {
		return codmunicipio;
	}

	public void setCodmunicipio(Long codmunicipio) {
		this.codmunicipio = codmunicipio;
	}

	public Municipio getMunicipio() {
		return municipio;
	}

	public void setMunicipio(Municipio municipio) {
		this.municipio = municipio;
	}

	
}

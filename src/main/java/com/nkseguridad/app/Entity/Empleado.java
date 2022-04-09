package com.nkseguridad.app.Entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
@Entity
@Table(name = "empleado", schema = "public")
public class Empleado implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private Long id;	
	 
	@Column(name="codtipoempleado")
	private Long codtipoempleado;
	    
    @Column(name="codnegocio")
    private Long codnegocio;      

    @Column(name="numeroidentificacion")
    private String numeroidentificacion; 
    
	@Column(name="codtipoidentificacion")
    private Long codtipoidentificacion; 
   
    @Column(name = "nombreprimero", nullable = true, length = 120)
    private String nombreprimero;
    
    @Column(name = "nombresegundo", nullable = true, length = 120)
    private String nombresegundo;
    
    @Column(name = "apellidoprimero", nullable = true, length = 120)
    private String apellidoprimero;
    
    @Column(name = "apellidosegundo", nullable = true, length = 120)
    private String apellidosegundo;
        
    @Column(name = "telefonomovil", nullable = true, length = 15)
    private String telefonomovil;
    
    @Column(name = "telefonofijo1", nullable = true, length = 15)
    private String telefonofijo1;
    
    @Column(name = "telefonofijo2", nullable = true, length = 15)
    private String telefonofijo2;  
   
    @Column(name = "telefonofax", nullable = true, length = 15)
    private String telefonofax;
    
    @Column(name = "direccionfiscal", nullable = false, length = 120)
    private String direccionfiscal;
    
    @Column(name = "correoe", nullable = true, length = 120)
    private String correoe;    
       
    @Column(name="codpais")
    private Long codpais;
    
    @Column(name="coddepartamento")
    private Long coddepartamento;
    
    @Column(name="codmunicipio")
    private Long codmunicipio;
    
   	@Column(name = "status", nullable = true, length = 10)
    private String status;    
       
    private Date fecharegistro;
    private Long codigodv;
    @ManyToOne
	@JoinColumn(name = "codnegocio", insertable = false, updatable = false)
	private Negocio negocio;    
    
    @ManyToOne
	@JoinColumn(name = "codtipoidentificacion", insertable = false, updatable = false)
	private TipoIdentificacion tipoidentificacion;
    @ManyToOne
  	@JoinColumn(name = "codpais", insertable = false, updatable = false)
  	private Pais pais; 
    
    public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getCodtipoempleado() {
		return codtipoempleado;
	}

	public void setCodtipoempleado(Long codtipoempleado) {
		this.codtipoempleado = codtipoempleado;
	}

	public Long getCodnegocio() {
		return codnegocio;
	}

	public void setCodnegocio(Long codnegocio) {
		this.codnegocio = codnegocio;
	}

	public String getNumeroidentificacion() {
		return numeroidentificacion;
	}

	public void setNumeroidentificacion(String numeroidentificacion) {
		this.numeroidentificacion = numeroidentificacion;
	}

	public Long getCodtipoidentificacion() {
		return codtipoidentificacion;
	}

	public void setCodtipoidentificacion(Long codtipoidentificacion) {
		this.codtipoidentificacion = codtipoidentificacion;
	}

	public String getNombreprimero() {
		return nombreprimero;
	}

	public void setNombreprimero(String nombreprimero) {
		this.nombreprimero = nombreprimero;
	}

	public String getNombresegundo() {
		return nombresegundo;
	}

	public void setNombresegundo(String nombresegundo) {
		this.nombresegundo = nombresegundo;
	}

	public String getApellidoprimero() {
		return apellidoprimero;
	}

	public void setApellidoprimero(String apellidoprimero) {
		this.apellidoprimero = apellidoprimero;
	}

	public String getApellidosegundo() {
		return apellidosegundo;
	}

	public void setApellidosegundo(String apellidosegundo) {
		this.apellidosegundo = apellidosegundo;
	}

	public String getTelefonomovil() {
		return telefonomovil;
	}

	public void setTelefonomovil(String telefonomovil) {
		this.telefonomovil = telefonomovil;
	}

	public String getTelefonofijo1() {
		return telefonofijo1;
	}

	public void setTelefonofijo1(String telefonofijo1) {
		this.telefonofijo1 = telefonofijo1;
	}

	public String getTelefonofijo2() {
		return telefonofijo2;
	}

	public void setTelefonofijo2(String telefonofijo2) {
		this.telefonofijo2 = telefonofijo2;
	}

	public String getTelefonofax() {
		return telefonofax;
	}

	public void setTelefonofax(String telefonofax) {
		this.telefonofax = telefonofax;
	}

	public String getDireccionfiscal() {
		return direccionfiscal;
	}

	public void setDireccionfiscal(String direccionfiscal) {
		this.direccionfiscal = direccionfiscal;
	}

	public String getCorreoe() {
		return correoe;
	}

	public void setCorreoe(String correoe) {
		this.correoe = correoe;
	}

	public Long getCodpais() {
		return codpais;
	}

	public void setCodpais(Long codpais) {
		this.codpais = codpais;
	}

	public Long getCoddepartamento() {
		return coddepartamento;
	}

	public void setCoddepartamento(Long coddepartamento) {
		this.coddepartamento = coddepartamento;
	}

	public Long getCodmunicipio() {
		return codmunicipio;
	}

	public void setCodmunicipio(Long codmunicipio) {
		this.codmunicipio = codmunicipio;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Date getFecharegistro() {
		return fecharegistro;
	}

	public void setFecharegistro(Date fecharegistro) {
		this.fecharegistro = fecharegistro;
	}

	public Long getCodigodv() {
		return codigodv;
	}

	public void setCodigodv(Long codigodv) {
		this.codigodv = codigodv;
	}

	public Negocio getNegocio() {
		return negocio;
	}

	public void setNegocio(Negocio negocio) {
		this.negocio = negocio;
	}

	public TipoIdentificacion getTipoidentificacion() {
		return tipoidentificacion;
	}

	public void setTipoidentificacion(TipoIdentificacion tipoidentificacion) {
		this.tipoidentificacion = tipoidentificacion;
	}

	public Pais getPais() {
		return pais;
	}

	public void setPais(Pais pais) {
		this.pais = pais;
	}

	public Departamento getDepartamento() {
		return departamento;
	}

	public void setDepartamento(Departamento departamento) {
		this.departamento = departamento;
	}

	public Municipio getMunicipio() {
		return municipio;
	}

	public void setMunicipio(Municipio municipio) {
		this.municipio = municipio;
	}

	@ManyToOne
  	@JoinColumn(name = "coddepartamento", insertable = false, updatable = false)
  	private Departamento departamento; 
    
    @ManyToOne
  	@JoinColumn(name = "codmunicipio", insertable = false, updatable = false)
  	private Municipio municipio;    
}

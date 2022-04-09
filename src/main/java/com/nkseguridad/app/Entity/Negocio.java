package com.nkseguridad.app.Entity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "negocio", schema = "public")
public class Negocio implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 28965007218210964L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)	
	private Long idnegocio;
	
	@Column(name = "codnegocio", nullable = false, length = 15)
	private String codnegocio;
	
	@Column(name = "nombre", nullable = false, length = 120)
	private String nombre;
	
	@Column(name = "direccion", nullable = false, length = 255)
	private String direccion;
	
	@Column(name = "telefono", nullable = true, length = 20)
	private String telefono;
	
	@Column(name = "email", nullable = true, length = 120)
	private String email;
	
	@Column(name = "telefonomovil" ,nullable = true, length = 20)
	private String telefonomovil;
	
	@Column(name = "web", nullable = true, length = 120)
	private String web;
	
	private String imagen;
	
	@Column(name = "mascaracontable", nullable = true, length = 25)
	private String mascaracontable;
	
	@Column(name = "contribuyente", nullable = false, length = 2)
	private String contribuyente;
	
	private boolean habilitado;
	
	private Long cantidadusuario;
	
	private Long tiempocierresesion;

	private String dominio;
	
	private String codigosii;
	
	private String ip;
	
	private Long puerto;
	
	@Column(name = "numeroresolucion", nullable = true)
	private Integer numeroresolucion;
	
	@Column(name = "numerodocumentorepresentantelegal", nullable = true)
	private String numerodocumentorepresentantelegal;
	
	@Column(name = "nombrerepresentantelegal", nullable = true)
	private String nombrerepresentantelegal;
	
	@Column(name = "apellidorepresentantelegal", nullable = true)
	private String apellidorepresentantelegal;
	
	@Column(name = "codempresa", nullable = true)
	private Long codempresa;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "codempresa", insertable = false, updatable = false)
	private Empresa empresa;
	
	@Column(name = "codpais", nullable = true)
	private Long codpais;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "codpais", insertable = false, updatable = false)
	private Pais pais;
	
	@Column(name = "fechainicioactividad")
	@Temporal(TemporalType.DATE)
	private Date fechainicioactividad;

	@Column(name = "fechaderesolucion", nullable = true)
	@Temporal(TemporalType.DATE)
	private Date fechaderesolucion;
	
	@Column(name = "creadoel")
	@Temporal(TemporalType.DATE)
	private Date creadoel;

	@Column(name = "actualizadoel", nullable = true)
	@Temporal(TemporalType.DATE)
	private Date actualizadoel;
	

	public Long getIdnegocio() {
		return idnegocio;
	}

	public void setIdnegocio(Long idnegocio) {
		this.idnegocio = idnegocio;
	}

	public String getCodnegocio() {
		return codnegocio;
	}

	public void setCodnegocio(String codnegocio) {
		this.codnegocio = codnegocio;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelefonomovil() {
		return telefonomovil;
	}

	public void setTelefonomovil(String telefonomovil) {
		this.telefonomovil = telefonomovil;
	}

	public String getWeb() {
		return web;
	}

	public void setWeb(String web) {
		this.web = web;
	}

	public String getImagen() {
		return imagen;
	}

	public void setImagen(String imagen) {
		this.imagen = imagen;
	}

	public String getMascaracontable() {
		return mascaracontable;
	}

	public void setMascaracontable(String mascaracontable) {
		this.mascaracontable = mascaracontable;
	}

	public String getContribuyente() {
		return contribuyente;
	}

	public void setContribuyente(String contribuyente) {
		this.contribuyente = contribuyente;
	}

	public boolean isHabilitado() {
		return habilitado;
	}

	public void setHabilitado(boolean habilitado) {
		this.habilitado = habilitado;
	}

	public Long getCantidadusuario() {
		return cantidadusuario;
	}

	public void setCantidadusuario(Long cantidadusuario) {
		this.cantidadusuario = cantidadusuario;
	}

	public Long getTiempocierresesion() {
		return tiempocierresesion;
	}

	public void setTiempocierresesion(Long tiempocierresesion) {
		this.tiempocierresesion = tiempocierresesion;
	}

	public String getDominio() {
		return dominio;
	}

	public void setDominio(String dominio) {
		this.dominio = dominio;
	}

	public String getCodigosii() {
		return codigosii;
	}

	public void setCodigosii(String codigosii) {
		this.codigosii = codigosii;
	}

	public String getIp() {
		return ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
	}

	public Long getPuerto() {
		return puerto;
	}

	public void setPuerto(Long puerto) {
		this.puerto = puerto;
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

	public Long getCodempresa() {
		return codempresa;
	}

	public void setCodempresa(Long codempresa) {
		this.codempresa = codempresa;
	}

	public Empresa getEmpresa() {
		return empresa;
	}

	public void setEmpresa(Empresa empresa) {
		this.empresa = empresa;
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

	public Date getCreadoel() {
		return creadoel;
	}

	public void setCreadoel(Date creadoel) {
		this.creadoel = creadoel;
	}

	public Date getActualizadoel() {
		return actualizadoel;
	}

	public void setActualizadoel(Date actualizadoel) {
		this.actualizadoel = actualizadoel;
	}
   	
	
}

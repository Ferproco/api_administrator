package com.nkseguridad.app.Entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PrePersist;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "proveedor", schema = "public")
public class Proveedor implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 6120941947340254068L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private String codigo;
    private String codgrupo;
    private String cedula;
    private String rif;
    private String telefonofijo1;
    private String telefonofijo2;
    private String telefonomovil;
    private String telefonofax;
    private String direccionfiscal;
    private String correoe;
    private String paginaweb;
    private String tipopersona;
    private Long plazocredito;
    private Double montocredito;
    private String tipocredito;
    private String unidadplazocredito;
    private String status;
    private String nombre;
    private String regimeniva;
    private String razonsocial;
    
    @Column(name = "fecharegistro")
	@Temporal(TemporalType.DATE)
    private Date fecharegistro;
	
	@PrePersist
	public void Prepersist() {
		fecharegistro = new Date();
	}    
    private String codnegocio;
    private String codigocontable;
    private String nombrecheque;
    private String aplicarretencion;
    private String tiporetencion;

	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public String getCodgrupo() {
		return codgrupo;
	}
	public void setCodgrupo(String codgrupo) {
		this.codgrupo = codgrupo;
	}
	public String getCedula() {
		return cedula;
	}
	public void setCedula(String cedula) {
		this.cedula = cedula;
	}
	public String getRif() {
		return rif;
	}
	public void setRif(String rif) {
		this.rif = rif;
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
	public String getTelefonomovil() {
		return telefonomovil;
	}
	public void setTelefonomovil(String telefonomovil) {
		this.telefonomovil = telefonomovil;
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
	public String getPaginaweb() {
		return paginaweb;
	}
	public void setPaginaweb(String paginaweb) {
		this.paginaweb = paginaweb;
	}
	public String getTipopersona() {
		return tipopersona;
	}
	public void setTipopersona(String tipopersona) {
		this.tipopersona = tipopersona;
	}
	public Long getPlazocredito() {
		return plazocredito;
	}
	public void setPlazocredito(Long plazocredito) {
		this.plazocredito = plazocredito;
	}
	public Double getMontocredito() {
		return montocredito;
	}
	public void setMontocredito(Double montocredito) {
		this.montocredito = montocredito;
	}
	public String getTipocredito() {
		return tipocredito;
	}
	public void setTipocredito(String tipocredito) {
		this.tipocredito = tipocredito;
	}
	public String getUnidadplazocredito() {
		return unidadplazocredito;
	}
	public void setUnidadplazocredito(String unidadplazocredito) {
		this.unidadplazocredito = unidadplazocredito;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getRegimeniva() {
		return regimeniva;
	}
	public void setRegimeniva(String regimeniva) {
		this.regimeniva = regimeniva;
	}
	public String getRazonsocial() {
		return razonsocial;
	}
	public void setRazonsocial(String razonsocial) {
		this.razonsocial = razonsocial;
	}
	public Date getFecharegistro() {
		return fecharegistro;
	}
	public void setFecharegistro(Date fecharegistro) {
		this.fecharegistro = fecharegistro;
	}
	public String getCodnegocio() {
		return codnegocio;
	}
	public void setCodnegocio(String codnegocio) {
		this.codnegocio = codnegocio;
	}
	public String getCodigocontable() {
		return codigocontable;
	}
	public void setCodigocontable(String codigocontable) {
		this.codigocontable = codigocontable;
	}
	public String getNombrecheque() {
		return nombrecheque;
	}
	public void setNombrecheque(String nombrecheque) {
		this.nombrecheque = nombrecheque;
	}
	public String getAplicarretencion() {
		return aplicarretencion;
	}
	public void setAplicarretencion(String aplicarretencion) {
		this.aplicarretencion = aplicarretencion;
	}
	public String getTiporetencion() {
		return tiporetencion;
	}
	public void setTiporetencion(String tiporetencion) {
		this.tiporetencion = tiporetencion;
	}
    
    
}

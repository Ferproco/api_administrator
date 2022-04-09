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

@Entity
@Table(name="listaprecio",schema="public")
public class ListaPrecio implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private Long id;
	private String numerolista;
    private Date vigentedesde;
    private String tarifa;
    private Date fechasistem;
    private String status;
    private String vigente;
    private Long codnegocio;
    private String codmoneda;
    private String simbolo;
    
    @ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "codnegocio", insertable = false, updatable = false)
	private Negocio negocio;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNumerolista() {
		return numerolista;
	}

	public void setNumerolista(String numerolista) {
		this.numerolista = numerolista;
	}

	public Date getVigentedesde() {
		return vigentedesde;
	}

	public void setVigentedesde(Date vigentedesde) {
		this.vigentedesde = vigentedesde;
	}

	public String getTarifa() {
		return tarifa;
	}

	public void setTarifa(String tarifa) {
		this.tarifa = tarifa;
	}

	public Date getFechasistem() {
		return fechasistem;
	}

	public void setFechasistem(Date fechasistem) {
		this.fechasistem = fechasistem;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getVigente() {
		return vigente;
	}

	public void setVigente(String vigente) {
		this.vigente = vigente;
	}

	public Long getCodnegocio() {
		return codnegocio;
	}

	public void setCodnegocio(Long codnegocio) {
		this.codnegocio = codnegocio;
	}

	public String getCodmoneda() {
		return codmoneda;
	}

	public void setCodmoneda(String codmoneda) {
		this.codmoneda = codmoneda;
	}

	public String getSimbolo() {
		return simbolo;
	}

	public void setSimbolo(String simbolo) {
		this.simbolo = simbolo;
	}

	public Negocio getNegocio() {
		return negocio;
	}

	public void setNegocio(Negocio negocio) {
		this.negocio = negocio;
	}

}

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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "kardex", schema = "public")
public class Kardex implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long id;

	@Column(name = "documento_id")
	private Long documento_id;

	@Column(name = "documentoc_id", nullable = true)
	private Long documentoc_id;

	@Column(name = "codcontacto")
	private Long codcontacto;

	@Column(name = "articulo_id")
	private Long articulo_id;

	@Column(name = "tipo", length = 10)
	private String tipo;

	@Column(name = "fecha")
	@Temporal(TemporalType.DATE)
	private Date fecha;

	@Column(name = "documentoasociado", length = 15)
	private String documentoasociado;

	@Column(name = "cantidad")
	private Double cantidad;

	@Column(name = "montoxunidad")
	private Double montoxunidad;

	@Column(name = "codunidadmedida")
	private Long codunidadmedida;

	@Column(name = "codunidadalterna")
	private Long codunidadalterna;

	@Column(name = "cantidadalterna")
	private Double cantidadalterna;

	@Column(name = "montoxunidadalterna")
	private Double montoxunidadalterna;

	@Column(name = "montototal")
	private Double montototal;

	@Column(name = "codalmacen")
	private Long codalmacen;

	@Column(name = "concepto", length = 120)
	private String concepto;

	@Column(name = "origen", length = 120)
	private String origen;

	@Column(name = "codnegocio")
	private Long codnegocio;

	@Column(name = "numerocontrol", length = 10)
	private String numerocontrol;

	@Column(name = "status", length = 10)
	private String status;

	public Kardex() {

	}

	@ManyToOne()
	@JoinColumn(name = "codunidadmedida", insertable = false, updatable = false)
	private Unidadmedida unidadmedida;

	/*
	 * @ManyToOne()
	 * 
	 * @JoinColumn(name = "codnegocio", insertable = false, updatable = false)
	 * private Negocio negocio;
	 */
	@ManyToOne()
	@JoinColumn(name = "codalmacen", insertable = false, updatable = false)
	private Almacen almacen;

	@ManyToOne()
	@JoinColumn(name = "codcontacto", referencedColumnName = "id", insertable = false, updatable = false)
	private Contacto contacto;
	/*
	 * @ManyToOne()
	 * 
	 * @JoinColumn(name = "articulo_id", insertable = false, updatable = false)
	 */
	// private Articulo articulo;

	/*
	 * @ManyToOne()
	 * 
	 * @JoinColumn(name = "codunidadalterna", insertable = false, updatable = false)
	 * private UnidadMedidaAlterna unidadmedidaalterna;
	 */

	public Long getCodcontacto() {
		return codcontacto;
	}

	public void setCodcontacto(Long codcontacto) {
		this.codcontacto = codcontacto;
	}

	public Contacto getContacto() {
		return contacto;
	}

	public void setContacto(Contacto contacto) {
		this.contacto = contacto;
	}

	public Long getArticulo_id() {
		return articulo_id;
	}

	public void setArticulo_id(Long articulo_id) {
		this.articulo_id = articulo_id;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getDocumentoc_id() {
		return documentoc_id;
	}

	public void setDocumentoc_id(Long documentoc_id) {
		this.documentoc_id = documentoc_id;
	}

	public Long getDocumento_id() {
		return documento_id;
	}

	public void setDocumento_id(Long documento_id) {
		this.documento_id = documento_id;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public String getDocumentoasociado() {
		return documentoasociado;
	}

	public void setDocumentoasociado(String documentoasociado) {
		this.documentoasociado = documentoasociado;
	}

	public Double getCantidad() {
		return cantidad;
	}

	public void setCantidad(Double cantidad) {
		this.cantidad = cantidad;
	}

	public Double getMontoxunidad() {
		return montoxunidad;
	}

	public void setMontoxunidad(Double montoxunidad) {
		this.montoxunidad = montoxunidad;
	}

	public Long getCodunidadmedida() {
		return codunidadmedida;
	}

	public void setCodunidadmedida(Long codunidadmedida) {
		this.codunidadmedida = codunidadmedida;
	}

	/*
	 * public Long getCodunidadalterna() { return codunidadalterna; }
	 * 
	 * public void setCodunidadalterna(Long codunidadalterna) {
	 * this.codunidadalterna = codunidadalterna; }
	 */

	public Double getCantidadalterna() {
		return cantidadalterna;
	}

	public void setCantidadalterna(Double cantidadalterna) {
		this.cantidadalterna = cantidadalterna;
	}

	public Double getMontoxunidadalterna() {
		return montoxunidadalterna;
	}

	public void setMontoxunidadalterna(Double montoxunidadalterna) {
		this.montoxunidadalterna = montoxunidadalterna;
	}

	public Double getMontototal() {
		return montototal;
	}

	public void setMontototal(Double montototal) {
		this.montototal = montototal;
	}

	public Long getCodalmacen() {
		return codalmacen;
	}

	public void setCodalmacen(Long codalmacen) {
		this.codalmacen = codalmacen;
	}

	public String getConcepto() {
		return concepto;
	}

	public void setConcepto(String concepto) {
		this.concepto = concepto;
	}

	public String getOrigen() {
		return origen;
	}

	public void setOrigen(String origen) {
		this.origen = origen;
	}

	public Long getCodnegocio() {
		return codnegocio;
	}

	public void setCodnegocio(Long codnegocio) {
		this.codnegocio = codnegocio;
	}

	public String getNumerocontrol() {
		return numerocontrol;
	}

	public void setNumerocontrol(String numerocontrol) {
		this.numerocontrol = numerocontrol;
	}

	public Unidadmedida getUnidadmedida() {
		return unidadmedida;
	}

	public void setUnidadmedida(Unidadmedida unidadmedida) {
		this.unidadmedida = unidadmedida;
	}

	/*
	 * public Negocio getNegocio() { return negocio; }
	 * 
	 * public void setNegocio(Negocio negocio) { this.negocio = negocio; }
	 */

	/*
	 * public Articulo getArticulo() { return articulo; }
	 * 
	 * public void setArticulo(Articulo articulo) { this.articulo = articulo; }
	 */

	/*
	 * public UnidadMedidaAlterna getUnidadmedidaalterna() { return
	 * unidadmedidaalterna; }
	 * 
	 * public void setUnidadmedidaalterna(UnidadMedidaAlterna unidadmedidaalterna) {
	 * this.unidadmedidaalterna = unidadmedidaalterna; }
	 */

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Almacen getAlmacen() {
		return almacen;
	}

	public void setAlmacen(Almacen almacen) {
		this.almacen = almacen;
	}

}

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
@Table(name="detallesdocumentocompra",schema="public")
public class DetallesDocumentoCompra implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
 	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
	private Long id;
 	private Long codnegocio;	 	
 	@Column(name = "detallev_id")
    private Long detallev_id;	 	
    private Long codarticulo;	    
    private Long codimpuesto;	    
    private Long codunidadmedida;
    private Long codalmacen;   
    private Double cantidad;
    private Double preciounitariosiniva;
    private Double montototalconiva;
    private Double baseimponible;
    private Double porcentajedescuento;
    private Double montodescuento;
    private Double porcentajeimpuesto;
    private Double montoimpuesto;
    private Double islr;
    private Double porcentajeislr;
    private String status;
    private String tipoarticulo;        
    private Date fecha;
    private String serial;
    private String garantia;
    private String tipodocumento;
    
    public DetallesDocumentoCompra() {
    	
    }  
    
    @ManyToOne
	@JoinColumn(name = "codnegocio", insertable = false, updatable = false)
	private Negocio negocio;   	 
    
	@ManyToOne
	@JoinColumn(name = "codimpuesto", insertable = false, updatable = false)
	private Impuesto impuesto;

	@ManyToOne
	@JoinColumn(name = "codunidadmedida", insertable = false, updatable = false)
	private Unidadmedida unidadmedida;
	
	@ManyToOne
	@JoinColumn(name = "codalmacen", insertable = false, updatable = false)
	private Almacen almacen;
            
    @ManyToOne
	@JoinColumn(name = "codarticulo", insertable = false, updatable = false)
	private Articulo articulo;

	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public Long getCodnegocio() {
		return codnegocio;
	}


	public void setCodnegocio(Long codnegocio) {
		this.codnegocio = codnegocio;
	}


	


	public Long getDetallev_id() {
		return detallev_id;
	}


	public void setDetallev_id(Long detallev_id) {
		this.detallev_id = detallev_id;
	}


	public Long getCodarticulo() {
		return codarticulo;
	}


	public void setCodarticulo(Long codarticulo) {
		this.codarticulo = codarticulo;
	}


	public Long getCodimpuesto() {
		return codimpuesto;
	}


	public void setCodimpuesto(Long codimpuesto) {
		this.codimpuesto = codimpuesto;
	}


	public Long getCodunidadmedida() {
		return codunidadmedida;
	}


	public void setCodunidadmedida(Long codunidadmedida) {
		this.codunidadmedida = codunidadmedida;
	}


	public Long getCodalmacen() {
		return codalmacen;
	}


	public void setCodalmacen(Long codalmacen) {
		this.codalmacen = codalmacen;
	}


	public Double getCantidad() {
		return cantidad;
	}


	public void setCantidad(Double cantidad) {
		this.cantidad = cantidad;
	}


	public Double getPreciounitariosiniva() {
		return preciounitariosiniva;
	}


	public void setPreciounitariosiniva(Double preciounitariosiniva) {
		this.preciounitariosiniva = preciounitariosiniva;
	}


	public Double getMontototalconiva() {
		return montototalconiva;
	}


	public void setMontototalconiva(Double montototalconiva) {
		this.montototalconiva = montototalconiva;
	}


	public Double getBaseimponible() {
		return baseimponible;
	}


	public void setBaseimponible(Double baseimponible) {
		this.baseimponible = baseimponible;
	}


	public Double getPorcentajedescuento() {
		return porcentajedescuento;
	}


	public void setPorcentajedescuento(Double porcentajedescuento) {
		this.porcentajedescuento = porcentajedescuento;
	}


	public Double getMontodescuento() {
		return montodescuento;
	}


	public void setMontodescuento(Double montodescuento) {
		this.montodescuento = montodescuento;
	}


	public Double getPorcentajeimpuesto() {
		return porcentajeimpuesto;
	}


	public void setPorcentajeimpuesto(Double porcentajeimpuesto) {
		this.porcentajeimpuesto = porcentajeimpuesto;
	}


	public Double getMontoimpuesto() {
		return montoimpuesto;
	}


	public void setMontoimpuesto(Double montoimpuesto) {
		this.montoimpuesto = montoimpuesto;
	}


	public Double getIslr() {
		return islr;
	}


	public void setIslr(Double islr) {
		this.islr = islr;
	}


	public Double getPorcentajeislr() {
		return porcentajeislr;
	}


	public void setPorcentajeislr(Double porcentajeislr) {
		this.porcentajeislr = porcentajeislr;
	}


	public String getStatus() {
		return status;
	}


	public void setStatus(String status) {
		this.status = status;
	}


	public String getTipoarticulo() {
		return tipoarticulo;
	}


	public void setTipoarticulo(String tipoarticulo) {
		this.tipoarticulo = tipoarticulo;
	}


	public Date getFecha() {
		return fecha;
	}


	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}


	public String getSerial() {
		return serial;
	}


	public void setSerial(String serial) {
		this.serial = serial;
	}


	public String getGarantia() {
		return garantia;
	}


	public void setGarantia(String garantia) {
		this.garantia = garantia;
	}


	public String getTipodocumento() {
		return tipodocumento;
	}


	public void setTipodocumento(String tipodocumento) {
		this.tipodocumento = tipodocumento;
	}


	public Negocio getNegocio() {
		return negocio;
	}


	public void setNegocio(Negocio negocio) {
		this.negocio = negocio;
	}


	public Impuesto getImpuesto() {
		return impuesto;
	}


	public void setImpuesto(Impuesto impuesto) {
		this.impuesto = impuesto;
	}


	public Unidadmedida getUnidadmedida() {
		return unidadmedida;
	}


	public void setUnidadmedida(Unidadmedida unidadmedida) {
		this.unidadmedida = unidadmedida;
	}


	public Almacen getAlmacen() {
		return almacen;
	}


	public void setAlmacen(Almacen almacen) {
		this.almacen = almacen;
	}


	public Articulo getArticulo() {
		return articulo;
	}


	public void setArticulo(Articulo articulo) {
		this.articulo = articulo;
	}

}

package com.nkseguridad.app.Entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="articulo",schema="public")
public class Articulo implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
	private Long id;
    @Column(name = "codigo",length=30)
	private String codigo;
	@Column(name="nomarticulo",length=120)
	private String nomarticulo;
	
    @Column(name="codmarca", nullable = true)
	private Long codmarca;
    @Column(name="codfamilia")
	private Long codfamilia;
    @Column(name="codunidadmedida")
    private Long codunidadmedida;
    @Column(name="codimpuesto", nullable = true)
    private Long codimpuesto;
    private long codtipoproducto;
    @Column(name="codigobarraprincipal",length=50)
	private String codigobarraprincipal;
    @Column(name="serial",length=50)
	private String serial;
    @Column(name="referencia",length=50)
   	private String referencia;
    @Column(name="status",length=10)
    private String status;
	private Double preciosugerido;
	
	@Column(name="codnegocio")
	private Long codnegocio;
	
	@Column(name="descripcionlarga",length=200)
	private String descripcionlarga;
	private Double stockminimo;
	private Double stockmaximo;
	private Double cantidadreorden;	
	private Double peso;
	private Double talla;
	
	@Column(name="color")
	private String color;
	private String tipoiva;
	private String esimpoconsumo;
	private Double valorimpoconsumo;
	private Double porcentajeimpoconsumo;
	//private Double ancho;
	//private Double alto;
	//private Double profundidad;
	//private Long facturarsinexistencia;
	private String ivaincluido;
	
	//private Date fechacreacion;
       
	@ManyToOne()
    @JoinColumn(name = "codfamilia",  insertable = false, updatable = false)
    private Familia familia;
    
   
	@ManyToOne()
    @JoinColumn(name = "codmarca",  insertable = false, updatable = false, nullable = true)
    private Marca marca;
    
    @ManyToOne()
    @JoinColumn(name = "codunidadmedida",  insertable = false, updatable = false)
    private Unidadmedida unidadmedida;
    
    @ManyToOne()
    @JoinColumn(name = "codimpuesto",  insertable = false, updatable = false)
    private Impuesto impuesto;
    
    @ManyToOne()
	@JoinColumn(name = "codnegocio", insertable = false, updatable = false)
	private Negocio negocio;
    
    
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "articulo_id", referencedColumnName = "id") // El numero de documento de esta entity documentoid
    private List<Kardex> lstmovimientoskardex;
    
  

	@OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "articulo_id", referencedColumnName = "id") // El numero de documento de esta entity documentoid
    private List<UnidadMedidaAlterna> lstunidadesalternas;
	  
	public List<UnidadMedidaAlterna> getLstunidadesalternas() {
			return lstunidadesalternas;
		}

		public void setLstunidadesalternas(List<UnidadMedidaAlterna> lstunidadesalternas) {
			this.lstunidadesalternas = lstunidadesalternas;
		}

    /*@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "codarticulo", referencedColumnName = "id")
	private List<Kardex> LstKardex = new ArrayList<>();
    
    @OneToMany(cascade = CascadeType.ALL)
   	@JoinColumn(name = "id", referencedColumnName = "id")
   	private List<UnidadMedidaAlterna> LstUnidadesAlternas = new ArrayList<>();
    
	public List<Kardex> getLstKardex() {
		return LstKardex;
	}
	public List<UnidadMedidaAlterna> getLstUnidadesAlternas() {
		return LstUnidadesAlternas;
	}
	public void setLstUnidadesAlternas(List<UnidadMedidaAlterna> lstUnidadesAlternas) {
		LstUnidadesAlternas = lstUnidadesAlternas;
	}
	public void setLstKardex(List<Kardex> lstKardex) {
		LstKardex = lstKardex;
	}*/
    
    public String getTipoiva() {
		return tipoiva;
	}

	public void setTipoiva(String tipoiva) {
		this.tipoiva = tipoiva;
	}

	public String getEsimpoconsumo() {
		return esimpoconsumo;
	}

	public void setEsimpoconsumo(String esimpoconsumo) {
		this.esimpoconsumo = esimpoconsumo;
	}

	public Double getValorimpoconsumo() {
		return valorimpoconsumo;
	}

	public void setValorimpoconsumo(Double valorimpoconsumo) {
		this.valorimpoconsumo = valorimpoconsumo;
	}

	public Double getPorcentajeimpoconsumo() {
		return porcentajeimpoconsumo;
	}

	public void setPorcentajeimpoconsumo(Double porcentajeimpoconsumo) {
		this.porcentajeimpoconsumo = porcentajeimpoconsumo;
	}

	public String getIvaincluido() {
		return ivaincluido;
	}

	public void setIvaincluido(String ivaincluido) {
		this.ivaincluido = ivaincluido;
	}
   /* @OneToMany(mappedBy = "articulo", fetch = FetchType.LAZY)
     private List<DetallesDocumentoVenta> lstdetallesdocumentoventas;*/
    
   /* @OneToMany(mappedBy = "articulo", fetch = FetchType.LAZY)
    private List<Kardex> lstdetallesdocumentoventas;*/ 
     //Set<DetallesDocumentoVenta> lstdetallesdocumentoventas = new HashSet<DetallesDocumentoVenta>(0);

   /* public List<DetallesDocumentoVenta> getLstdetallesdocumentoventas() {
		return lstdetallesdocumentoventas;
	}
	public void setLstdetallesdocumentoventas(List<DetallesDocumentoVenta> lstdetallesdocumentoventas) {
		this.lstdetallesdocumentoventas = lstdetallesdocumentoventas;
	}*/

	/*public Set<DetallesDocumentoVenta> getLstdetallesdocumentoventas() {
		return lstdetallesdocumentoventas;
	}
	public void setLstdetallesdocumentoventas(Set<DetallesDocumentoVenta> lstdetallesdocumentoventas) {
		this.lstdetallesdocumentoventas = lstdetallesdocumentoventas;
	}*/
	
	public List<Kardex> getLstmovimientoskardex() {
		return lstmovimientoskardex;
	}

	public void setLstmovimientoskardex(List<Kardex> lstmovimientoskardex) {
		this.lstmovimientoskardex = lstmovimientoskardex;
	}

	public String getDescripcionlarga() {
		return descripcionlarga;
	}
	
	public void setDescripcionlarga(String descripcionlarga) {
		this.descripcionlarga = descripcionlarga;
	}
	public Double getStockminimo() {
		return stockminimo;
	}
	public void setStockminimo(Double stockminimo) {
		this.stockminimo = stockminimo;
	}
	public Double getStockmaximo() {
		return stockmaximo;
	}
	public void setStockmaximo(Double stockmaximo) {
		this.stockmaximo = stockmaximo;
	}
	public Double getCantidadreorden() {
		return cantidadreorden;
	}
	public void setCantidadreorden(Double cantidadreorden) {
		this.cantidadreorden = cantidadreorden;
	}
	/*public String getClasificacioniva() {
		return clasificacioniva;
	}
	public void setClasificacioniva(String clasificacioniva) {
		this.clasificacioniva = clasificacioniva;
	}
	public String getEsimpoconsumo() {
		return esimpoconsumo;
	}
	public void setEsimpoconsumo(String esimpoconsumo) {
		this.esimpoconsumo = esimpoconsumo;
	}
	public Double getValorimpoconsumo() {
		return valorimpoconsumo;
	}
	public void setValorimpoconsumo(Double valorimpoconsumo) {
		this.valorimpoconsumo = valorimpoconsumo;
	}
	public Double getPorcentajeimpoconsumo() {
		return porcentajeimpoconsumo;
	}
	public void setPorcentajeimpoconsumo(Double porcentajeimpoconsumo) {
		this.porcentajeimpoconsumo = porcentajeimpoconsumo;
	}*/
	public Double getPeso() {
		return peso;
	}
	public void setPeso(Double peso) {
		this.peso = peso;
	}
	public Double getTalla() {
		return talla;
	}
	public void setTalla(Double talla) {
		this.talla = talla;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	/*public Double getAncho() {
		return ancho;
	}
	public void setAncho(Double ancho) {
		this.ancho = ancho;
	}
	public Double getAlto() {
		return alto;
	}
	public void setAlto(Double alto) {
		this.alto = alto;
	}
	public Double getProfundidad() {
		return profundidad;
	}
	public void setProfundidad(Double profundidad) {
		this.profundidad = profundidad;
	}
	public Long getFacturarsinexistencia() {
		return facturarsinexistencia;
	}
	public void setFacturarsinexistencia(Long facturarsinexistencia) {
		this.facturarsinexistencia = facturarsinexistencia;
	}
	public Long getIvaincluido() {
		return ivaincluido;
	}
	public void setIvaincluido(Long ivaincluido) {
		this.ivaincluido = ivaincluido;
	}
	public Long getAplicaimpuestoconsumo() {
		return aplicaimpuestoconsumo;
	}
	public void setAplicaimpuestoconsumo(Long aplicaimpuestoconsumo) {
		this.aplicaimpuestoconsumo = aplicaimpuestoconsumo;
	}
	public Date getFechacreacion() {
		return fechacreacion;
	}
	public void setFechacreacion(Date fechacreacion) {
		this.fechacreacion = fechacreacion;
	}*/

    
    public Long getCodunidadmedida() {
		return codunidadmedida;
	}
	public void setCodunidadmedida(Long codunidadmedida) {
		this.codunidadmedida = codunidadmedida;
	}
	public Long getCodimpuesto() {
		return codimpuesto;
	}
	public void setCodimpuesto(Long codimpuesto) {
		this.codimpuesto = codimpuesto;
	}
	
	public String getReferencia() {
		return referencia;
	}
	public void setReferencia(String referencia) {
		this.referencia = referencia;
	}
	public Impuesto getImpuesto() {
		return impuesto;
	}
	public void setImpuesto(Impuesto impuesto) {
		this.impuesto = impuesto;
	}
	public Negocio getNegocio() {
		return negocio;
	}
	public void setNegocio(Negocio negocio) {
		this.negocio = negocio;
	}
    public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	
	public Unidadmedida getUnidadmedida() {
		return unidadmedida;
	}
	public void setUnidadmedida(Unidadmedida unidadmedida) {
		this.unidadmedida = unidadmedida;
	}
	public Marca getMarca() {
		return marca;
	}
	public void setMarca(Marca marca) {
		this.marca = marca;
	}
	public Familia getFamilia() {
		return familia;
	}
	public void setFamilia(Familia familia) {
		this.familia = familia;
	}
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public Long getCodmarca() {
		return codmarca;
	}
	public void setCodmarca(Long codmarca) {
		this.codmarca = codmarca;
	}
	public Long getCodfamilia() {
		return codfamilia;
	}
	public void setCodfamilia(Long codfamilia) {
		this.codfamilia = codfamilia;
	}
	
	public String getNomarticulo() {
		return nomarticulo;
	}
	public void setNomarticulo(String nomarticulo) {
		this.nomarticulo = nomarticulo;
	}
	public Double getPreciosugerido() {
		return preciosugerido;
	}
	public void setPreciosugerido(Double preciosugerido) {
		this.preciosugerido = preciosugerido;
	}
	
	public String getCodigobarraprincipal() {
		return codigobarraprincipal;
	}
	public void setCodigobarraprincipal(String codigobarraprincipal) {
		this.codigobarraprincipal = codigobarraprincipal;
	}
	
	
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	
	public Long getCodnegocio() {
		return codnegocio;
	}
	public void setCodnegocio(Long codnegocio) {
		this.codnegocio = codnegocio;
	}
	

	public String getSerial() {
		return serial;
	}
	public void setSerial(String serial) {
		this.serial = serial;
	}
	public long getCodtipoproducto() {
		return codtipoproducto;
	}
	public void setCodtipoproducto(long codtipoproducto) {
		this.codtipoproducto = codtipoproducto;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Articulo other = (Articulo) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Articulo [id=" + id + ", codigo=" + codigo + ", nomarticulo=" + nomarticulo + ", codmarca=" + codmarca
				+ ", codfamilia=" + codfamilia + ", codunidadmedida=" + codunidadmedida + ", codimpuesto=" + codimpuesto
				+ ", codtipoproducto=" + codtipoproducto + ", codigobarraprincipal=" + codigobarraprincipal
				+ ", serial=" + serial + ", referencia=" + referencia + ", status=" + status + ", preciosugerido="
				+ preciosugerido + ", codnegocio=" + codnegocio + ", descripcionlarga=" + descripcionlarga
				+ ", stockminimo=" + stockminimo + ", stockmaximo=" + stockmaximo + ", cantidadreorden="
				+ cantidadreorden + ", peso=" + peso + ", talla=" + talla + ", color=" + color + ", tipoiva=" + tipoiva
				+ ", esimpoconsumo=" + esimpoconsumo + ", valorimpoconsumo=" + valorimpoconsumo
				+ ", porcentajeimpoconsumo=" + porcentajeimpoconsumo + ", ivaincluido=" + ivaincluido + ", familia="
				+ familia + ", marca=" + marca + ", unidadmedida=" + unidadmedida + ", impuesto=" + impuesto
				+ ", negocio=" + negocio + ", lstmovimientoskardex=" + lstmovimientoskardex + ", lstunidadesalternas="
				+ lstunidadesalternas + "]";
	}
	
	
	    

}

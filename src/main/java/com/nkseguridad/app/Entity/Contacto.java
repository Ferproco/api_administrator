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
@Table(name = "contacto", schema = "public")
public class Contacto  implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private Long id;	
	
    @Column(name="codvendedor")
    private Long codvendedor;
    
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
        
	@Column(name = "razonsocial", nullable = true, length = 120)
    private String razonsocial;
    
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
   
    @Column(name="codtipocontacto")
    private Long codtipocontacto;
   
    @Column(name="codformapago")
    private Long codformapago;   

    @Column(name="codtipocontibuyente")
    private Long codtipocontibuyente;
   
    @Column(name="codtipopersona")
    private Long codtipopersona;
    
    @Column(name="codpais")
    private Long codpais;
    
    @Column(name="coddepartamento")
    private Long coddepartamento;
    
    @Column(name="codmunicipio")
    private Long codmunicipio;
    
   	@Column(name = "status", nullable = true, length = 10)
    private String status;    
       
    private Date fecharegistro;
    
    private String lugarenvio;
    private Long codlistaprecio;
   
    @Column(name = "direccionexogena", nullable = true, length = 120)
    private String direccionexogena;
    
	@Column(name = "paginaweb", nullable = true, length = 120)
    private String paginaweb;
	
    private Double limitecreditohasta;
    private Date fechacreditodesde;
    private Date fechacreditohasta;
    private String observaciones;
    private String descuentocondicionado;
    private Long codigodv;
    private String responsableiva;
    
   
	@ManyToOne
   	@JoinColumn(name = "codlistaprecio", insertable = false, updatable = false)
   	private ListaPrecio listaprecio;   

	@ManyToOne
	@JoinColumn(name = "codnegocio", insertable = false, updatable = false)
	private Negocio negocio;    
    
    @ManyToOne
	@JoinColumn(name = "codtipoidentificacion", insertable = false, updatable = false)
	private TipoIdentificacion tipoidentificacion;
    
    @ManyToOne
   	@JoinColumn(name = "codvendedor", insertable = false, updatable = false)
   	private Vendedor vendedor;    
    
    @ManyToOne
  	@JoinColumn(name = "codformapago", insertable = false, updatable = false)
  	private FormaPago formapago;  
    
    @ManyToOne
  	@JoinColumn(name = "codpais", insertable = false, updatable = false)
  	private Pais pais; 
    
    @ManyToOne
  	@JoinColumn(name = "coddepartamento", insertable = false, updatable = false)
  	private Departamento departamento; 
    
    @ManyToOne
  	@JoinColumn(name = "codmunicipio", insertable = false, updatable = false)
  	private Municipio municipio;    
  
    @ManyToOne
  	@JoinColumn(name = "codtipocontibuyente", insertable = false, updatable = false)
  	private TipoContribuyente tipocontribuyente;

    public String getLugarenvio() {
  		return lugarenvio;
  	}

  	public void setLugarenvio(String lugarenvio) {
  		this.lugarenvio = lugarenvio;
  	}

  	public Long getCodlistaprecio() {
  		return codlistaprecio;
  	}

  	public void setCodlistaprecio(Long codlistaprecio) {
  		this.codlistaprecio = codlistaprecio;
  	}

  	public String getDireccionexogena() {
  		return direccionexogena;
  	}

  	public void setDireccionexogena(String direccionexogena) {
  		this.direccionexogena = direccionexogena;
  	}

  	public ListaPrecio getListaprecio() {
  		return listaprecio;
  	}

  	public void setListaprecio(ListaPrecio listaprecio) {
  		this.listaprecio = listaprecio;
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

	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	/*public Long getCodgrupo() {
		return codgrupo;
	}

	public void setCodgrupo(Long codgrupo) {
		this.codgrupo = codgrupo;
	}*/

	public Long getCodvendedor() {
		return codvendedor;
	}

	public void setCodvendedor(Long codvendedor) {
		this.codvendedor = codvendedor;
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
	public Long getCodtipopersona() {
		return codtipopersona;
	}

	public void setCodtipopersona(Long codtipopersona) {
		this.codtipopersona = codtipopersona;
	}

	public Long getCodpais() {
		return codpais;
	}

	public void setCodpais(Long codpais) {
		this.codpais = codpais;
	}
	

	public String getRazonsocial() {
		return razonsocial;
	}

	public void setRazonsocial(String razonsocial) {
		this.razonsocial = razonsocial;
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

	public Long getCodtipocontacto() {
		return codtipocontacto;
	}

	public void setCodtipocontacto(Long codtipocontacto) {
		this.codtipocontacto = codtipocontacto;
	}

	public Long getCodformapago() {
		return codformapago;
	}

	public void setCodformapago(Long codformapago) {
		this.codformapago = codformapago;
	}

	public Long getCodtipocontibuyente() {
		return codtipocontibuyente;
	}

	public void setCodtipocontibuyente(Long codtipocontibuyente) {
		this.codtipocontibuyente = codtipocontibuyente;
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

	public Vendedor getVendedor() {
		return vendedor;
	}

	public void setVendedor(Vendedor vendedor) {
		this.vendedor = vendedor;
	}

	public FormaPago getFormapago() {
		return formapago;
	}

	public void setFormapago(FormaPago formapago) {
		this.formapago = formapago;
	}

	public Pais getPais() {
		return pais;
	}

	public void setPais(Pais pais) {
		this.pais = pais;
	}
	

	public TipoContribuyente getTipocontribuyente() {
		return tipocontribuyente;
	}

	public void setTipocontribuyente(TipoContribuyente tipocontribuyente) {
		this.tipocontribuyente = tipocontribuyente;
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
	 public String getPaginaweb() {
			return paginaweb;
		}

		public void setPaginaweb(String paginaweb) {
			this.paginaweb = paginaweb;
		}

	
		public Double getLimitecreditohasta() {
			return limitecreditohasta;
		}

		public void setLimitecreditohasta(Double limitecreditohasta) {
			this.limitecreditohasta = limitecreditohasta;
		}

		public Date getFechacreditodesde() {
			return fechacreditodesde;
		}

		public void setFechacreditodesde(Date fechacreditodesde) {
			this.fechacreditodesde = fechacreditodesde;
		}

		public Date getFechacreditohasta() {
			return fechacreditohasta;
		}

		public void setFechacreditohasta(Date fechacreditohasta) {
			this.fechacreditohasta = fechacreditohasta;
		}

		public String getObservaciones() {
			return observaciones;
		}

		public void setObservaciones(String observaciones) {
			this.observaciones = observaciones;
		}

		public String getDescuentocondicionado() {
			return descuentocondicionado;
		}

		public void setDescuentocondicionado(String descuentocondicionado) {
			this.descuentocondicionado = descuentocondicionado;
		}

		public Long getCodigodv() {
			return codigodv;
		}

		public void setCodigodv(Long codigodv) {
			this.codigodv = codigodv;
		}

		public String getResponsableiva() {
			return responsableiva;
		}

		public void setResponsableiva(String responsableiva) {
			this.responsableiva = responsableiva;
		}

	

}

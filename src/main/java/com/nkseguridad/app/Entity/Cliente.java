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
@Table(name = "cliente", schema = "public")
public class Cliente implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 5790987669513731602L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idcliente;
	
    private Long codgrupo;
    private Long codvendedor;
    private Long codnegocio;   
    
    @Column(name = "tipodocumento", nullable = false, length = 45)
    private String tipodocumento;
    
    @Column(name = "numerodocumento", nullable = false, length = 15)
    private String numerodocumento;
    
    @Column(name = "nombre", nullable = false, length = 120)
    private String nombre;
    
    @Column(name = "telefonofijo1", nullable = false, length = 15)
    private String telefonofijo1;
    
    @Column(name = "telefonofijo2", nullable = true, length = 15)
    private String telefonofijo2;
    
    @Column(name = "telefonomovil", nullable = true, length = 15)
    private String telefonomovil;
    
    private String direccionfiscal;
    private String correoe;
    private String paginaweb;
    private String tipopersona;
    private Long plazocredito;
    private Double montocredito;
    private String tipocredito;
    private String unidadplazocredito;
    private String status;    
    private String regimeniva;
    private String razonsocial;
    private Date fecharegistro;
    private String tarifa;   
    private String contribuyente;
    private String codcontable;
    private String codigoruta;
    
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "codvendedor",  insertable = false, updatable = false)
    private Vendedor vendedor;
    
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "codnegocio", insertable = false, updatable = false)
    private Negocio negocio;    
    
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "codgrupo", insertable = false, updatable = false)
    private Grupocliente grupocliente;
	
       
    
}

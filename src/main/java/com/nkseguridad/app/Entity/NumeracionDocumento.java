package com.nkseguridad.app.Entity;

import java.io.Serializable;

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
@Table(name="numeraciondocumento",schema="public")
public class NumeracionDocumento implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="idnumeraciondocumento")
	private Long idnumeraciondocumento;  
	
	private Long codtipodocumento;
	
	  @Column(name="status",length=10)
	    private String status;
	    
	    private Long codnegocio;
	    
	    @Column(name="nombre",length=120)
	    private String nombre;
	    
	    @Column(name="resolucion",length=250)
	    private String resolucion;
	    
	    @Column(name="prefijo",length=120)
	    private String prefijo;
	    
	    private Long proximonumerodocumento;
	    private Long desdenumero;
	    private Long hastanumero;
	    private Boolean principal;
		
	    private String tipodedocumento;
	   
		@ManyToOne
		@JoinColumn(name = "codnegocio", insertable = false, updatable = false)
		private Negocio negocio;
	    
	    @ManyToOne
		@JoinColumn(name = "codtipodocumento", insertable = false, updatable = false)
		private TipoDocumento tipodocumento;

		public Long getIdnumeraciondocumento() {
			return idnumeraciondocumento;
		}

		public void setIdnumeraciondocumento(Long idnumeraciondocumento) {
			this.idnumeraciondocumento = idnumeraciondocumento;
		}

		public Long getCodtipodocumento() {
			return codtipodocumento;
		}

		public void setCodtipodocumento(Long codtipodocumento) {
			this.codtipodocumento = codtipodocumento;
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

		public String getNombre() {
			return nombre;
		}

		public void setNombre(String nombre) {
			this.nombre = nombre;
		}

		public String getResolucion() {
			return resolucion;
		}

		public void setResolucion(String resolucion) {
			this.resolucion = resolucion;
		}

		public String getPrefijo() {
			return prefijo;
		}

		public void setPrefijo(String prefijo) {
			this.prefijo = prefijo;
		}

		public Long getProximonumerodocumento() {
			return proximonumerodocumento;
		}

		public void setProximonumerodocumento(Long proximonumerodocumento) {
			this.proximonumerodocumento = proximonumerodocumento;
		}

		public Long getDesdenumero() {
			return desdenumero;
		}

		public void setDesdenumero(Long desdenumero) {
			this.desdenumero = desdenumero;
		}

		public Long getHastanumero() {
			return hastanumero;
		}

		public void setHastanumero(Long hastanumero) {
			this.hastanumero = hastanumero;
		}

		public Negocio getNegocio() {
			return negocio;
		}

		public void setNegocio(Negocio negocio) {
			this.negocio = negocio;
		}

		public TipoDocumento getTipodocumento() {
			return tipodocumento;
		}

		public void setTipodocumento(TipoDocumento tipodocumento) {
			this.tipodocumento = tipodocumento;
		}

		  public Boolean getPrincipal() {
				return principal;
			}

			public void setPrincipal(Boolean principal) {
				this.principal = principal;
			}
			public String getTipodedocumento() {
				return tipodedocumento;
			}

			public void setTipodedocumento(String tipodedocumento) {
				this.tipodedocumento = tipodedocumento;
			}
		

}

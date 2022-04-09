package com.nkseguridad.app.Entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="unidadmedidaalterna",schema="public")
public class UnidadMedidaAlterna implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	 @Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	 @Column(name = "id")
     private Long id;
	 private Long codunidadmedidaalterna;
	 private Long articulo_id;
	 private Double valorconversion;
	 private Long codnegocio;
	 private Long codunidadminima;
	 
	    @ManyToOne()
	    @JoinColumn(name = "codunidadmedidaalterna",  insertable = false, updatable = false)
	    private Unidadmedida unidadmedida;
	    
	    
	    @ManyToOne()
	    @JoinColumn(name = "codnegocio", insertable = false, updatable = false)
	    private Negocio negocio;
	   /* @ManyToOne()
	    @JoinColumn(name = "articulo_id",  insertable = false, updatable = false)
	    private Articulo articulo;*/
	    
	    public Long getCodunidadmedidaalterna() {
			return codunidadmedidaalterna;
		}

		public void setCodunidadmedidaalterna(Long codunidadmedidaalterna) {
			this.codunidadmedidaalterna = codunidadmedidaalterna;
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

		

		public Double getValorconversion() {
			return valorconversion;
		}

		public void setValorconversion(Double valorconversion) {
			this.valorconversion = valorconversion;
		}

		public Long getCodnegocio() {
			return codnegocio;
		}

		public void setCodnegocio(Long codnegocio) {
			this.codnegocio = codnegocio;
		}

		public Long getCodunidadminima() {
			return codunidadminima;
		}

		public void setCodunidadminima(Long codunidadminima) {
			this.codunidadminima = codunidadminima;
		}

		public Unidadmedida getUnidadmedida() {
			return unidadmedida;
		}

		public void setUnidadmedida(Unidadmedida unidadmedida) {
			this.unidadmedida = unidadmedida;
		}

		
		public Negocio getNegocio() {
			return negocio;
		}

		public void setNegocio(Negocio negocio) {
			this.negocio = negocio;
		}

	
}

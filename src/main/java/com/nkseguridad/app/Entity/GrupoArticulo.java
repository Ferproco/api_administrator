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
@Table(name="grupoarticulo",schema="public")
public class GrupoArticulo implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="codgrupoarticulo")
	private Long codgrupoarticulo;
	@Column(name="nomgrupoarticulo",length=120)
    private String  nomgrupoarticulo;
	@Column(name="tipocosto",length=120)
	private String tipocosto;
    private Double comision;
    @Column(name="tipo",length=120)
    private String tipo;
    @Column(name="codnegocio")
    private Long codnegocio;
	private String status;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "codnegocio", insertable = false, updatable = false)
	private Negocio negocio;

	 public Negocio getNegocio() {
		return negocio;
	}

	public void setNegocio(Negocio negocio) {
		this.negocio = negocio;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public GrupoArticulo() {
			
		}
		
	
		public Long getCodgrupoarticulo() {
			return codgrupoarticulo;
		}

		public void setCodgrupoarticulo(Long codgrupoarticulo) {
			this.codgrupoarticulo = codgrupoarticulo;
		}

		public String getNomgrupoarticulo() {
			return nomgrupoarticulo;
		}

		public void setNomgrupoarticulo(String nomgrupoarticulo) {
			this.nomgrupoarticulo = nomgrupoarticulo;
		}

		public String getTipocosto() {
			return tipocosto;
		}

		public void setTipocosto(String tipocosto) {
			this.tipocosto = tipocosto;
		}

		public Double getComision() {
			return comision;
		}

		public void setComision(Double comision) {
			this.comision = comision;
		}

		public String getTipo() {
			return tipo;
		}

		public void setTipo(String tipo) {
			this.tipo = tipo;
		}

		public Long getCodnegocio() {
			return codnegocio;
		}

		public void setCodnegocio(Long codnegocio) {
			this.codnegocio = codnegocio;
		}

		

}

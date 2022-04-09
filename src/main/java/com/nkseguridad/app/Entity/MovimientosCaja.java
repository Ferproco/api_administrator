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
@Table(name="movimientoscaja",schema="public")
public class MovimientosCaja  implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	@Id
	@Column(name="numeromovimientocaja")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long numeromovimientocaja;
	
	@Column(name = "codigocaja")
	private Long codigocaja;
	
	private Long codnegocio;
	private String tipopago;
	private String tipomovimiento;
	private Date fecha;
	private String origen;
	private String concepto;
	private String documento;
	private Double monto;
	private String status;
	private String depositado;
	private String numtarjchq;
	private String nombre;
	private String telefono;
	private String rifci;
	private String banco;
	private String referencia;
	
	
	
	
			
	public Long getNumeromovimientocaja() {
		return numeromovimientocaja;
	}
	public void setNumeromovimientocaja(Long numeromovimientocaja) {
		this.numeromovimientocaja = numeromovimientocaja;
	}

	public Long getCodigocaja() {
		return codigocaja;
	}
	public void setCodigocaja(Long codigocaja) {
		this.codigocaja = codigocaja;
	}
	public Long getCodnegocio() {
		return codnegocio;
	}
	public void setCodnegocio(Long codnegocio) {
		this.codnegocio = codnegocio;
	}
	public String getTipopago() {
		return tipopago;
	}
	public void setTipopago(String tipopago) {
		this.tipopago = tipopago;
	}
	public String getTipomovimiento() {
		return tipomovimiento;
	}
	public void setTipomovimiento(String tipomovimiento) {
		this.tipomovimiento = tipomovimiento;
	}
	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	public String getOrigen() {
		return origen;
	}
	public void setOrigen(String origen) {
		this.origen = origen;
	}
	public String getConcepto() {
		return concepto;
	}
	public void setConcepto(String concepto) {
		this.concepto = concepto;
	}
	public String getDocumento() {
		return documento;
	}
	public void setDocumento(String documento) {
		this.documento = documento;
	}
	public Double getMonto() {
		return monto;
	}
	public void setMonto(Double monto) {
		this.monto = monto;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getDepositado() {
		return depositado;
	}
	public void setDepositado(String depositado) {
		this.depositado = depositado;
	}
	public String getNumtarjchq() {
		return numtarjchq;
	}
	public void setNumtarjchq(String numtarjchq) {
		this.numtarjchq = numtarjchq;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public String getRifci() {
		return rifci;
	}
	public void setRifci(String rifci) {
		this.rifci = rifci;
	}
	public String getBanco() {
		return banco;
	}
	public void setBanco(String banco) {
		this.banco = banco;
	}
	public String getReferencia() {
		return referencia;
	}
	public void setReferencia(String referencia) {
		this.referencia = referencia;
	}
	

}

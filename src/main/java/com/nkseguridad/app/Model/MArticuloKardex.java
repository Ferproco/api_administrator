package com.nkseguridad.app.Model;

import java.util.List;

import javax.persistence.Column;

import com.nkseguridad.app.Entity.Articulo;
import com.nkseguridad.app.Entity.Kardex;

public class MArticuloKardex {
	
	private Long id;
	private String codigo;
	private String nomarticulo;
	private Double entrada;
	private Double salida;
	private Double saldo;
	private Double costo;
	private Double costototal;
	private List<Kardex> lstmovimientoskardex;
	
	public MArticuloKardex() {

	}
	
	public MArticuloKardex(Articulo articuloIn) {
		super();
		this.id = articuloIn.getId();
		this.codigo = articuloIn.getCodigo();
		this.nomarticulo = articuloIn.getNomarticulo();
		this.entrada = 0.0;
		this.salida = 0.0;
		this.saldo = 0.0;
		this.costo = 0.0;
		this.costototal = 0.0;
		this.lstmovimientoskardex = articuloIn.getLstmovimientoskardex();
		
		Double acumentrada = 0.0;
		for (Kardex kardex: this.lstmovimientoskardex) {
			if (kardex.getCantidad() >= 0) {
				this.entrada += kardex.getCantidad(); 
			}
			else {
				this.salida += kardex.getCantidad() * (-1); 
			}
		}
		this.saldo = this.entrada - this.salida;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getNomarticulo() {
		return nomarticulo;
	}

	public void setNomarticulo(String nomarticulo) {
		this.nomarticulo = nomarticulo;
	}

	public Double getEntrada() {
		return entrada;
	}

	public void setEntrada(Double entrada) {
		this.entrada = entrada;
	}

	public Double getSalida() {
		return salida;
	}

	public void setSalida(Double salida) {
		this.salida = salida;
	}

	public Double getSaldo() {
		return saldo;
	}

	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}

	public Double getCosto() {
		return costo;
	}

	public void setCosto(Double costo) {
		this.costo = costo;
	}

	public Double getCostototal() {
		return costototal;
	}

	public void setCostototal(Double costototal) {
		this.costototal = costototal;
	}

	public List<Kardex> getLstmovimientoskardex() {
		return lstmovimientoskardex;
	}

	public void setLstmovimientoskardex(List<Kardex> lstmovimientoskardex) {
		this.lstmovimientoskardex = lstmovimientoskardex;
	}
	
}

package com.nkseguridad.app.Model;
import java.time.LocalDateTime;
import org.springframework.format.annotation.DateTimeFormat;

public class ArticuloFilterKardex {

	private Long tipo;
	
	@DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME, pattern = "yyyy-MM-dd")
	private LocalDateTime fechadesde;	
	 
	@DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME, pattern = "yyyy-MM-dd")
	private LocalDateTime fechahasta;
	
	private Long articulo_id;
	
	private Long codalmacen;
	
	public Long getTipo() {
		return tipo;
	}
	public void setTipo(Long tipo) {
		this.tipo = tipo;
	}
	public LocalDateTime getFechadesde() {
		return fechadesde;
	}
	public void setFechadesde(LocalDateTime fechadesde) {
		this.fechadesde = fechadesde;
	}
	public LocalDateTime getFechahasta() {
		return fechahasta;
	}
	public void setFechahasta(LocalDateTime fechahasta) {
		this.fechahasta = fechahasta;
	}
	public Long getArticulo_id() {
		return articulo_id;
	}
	public void setArticulo_id(Long articulo_id) {
		this.articulo_id = articulo_id;
	}
	public Long getCodalmacen() {
		return codalmacen;
	}
	public void setCodalmacen(Long codalmacen) {
		this.codalmacen = codalmacen;
	}
	@Override
	public String toString() {
		return "ArticuloFilterKardex [tipo=" + tipo + ", fechadesde=" + fechadesde + ", fechahasta=" + fechahasta
				+ ", articulo_id=" + articulo_id + ", codalmacen=" + codalmacen + "]";
	}
	
	
}

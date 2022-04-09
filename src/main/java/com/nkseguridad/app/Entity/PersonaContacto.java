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
@Table(name = "personacontacto", schema = "public")
public class PersonaContacto implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private Long id;
	@Column(name = "nombres", nullable = true, length = 120)
	private String nombres;
	@Column(name = "apellidos", nullable = true, length = 120)
	private String apellidos;
	@Column(name = "correoelectronico", nullable = true, length = 120)
	private String correoelectronico;
	@Column(name = "telefono", nullable = true, length = 20)
	private String telefono;
	@Column(name = "celular", nullable = true, length = 20)
	private String celular;
	private Long status;
    private Long codcontacto;
	
    @ManyToOne
	@JoinColumn(name = "codcontacto", insertable = false, updatable = false)
	private Contacto contacto;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombres() {
		return nombres;
	}

	public void setNombres(String nombres) {
		this.nombres = nombres;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getCorreoelectronico() {
		return correoelectronico;
	}

	public void setCorreoelectronico(String correoelectronico) {
		this.correoelectronico = correoelectronico;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getCelular() {
		return celular;
	}

	public void setCelular(String celular) {
		this.celular = celular;
	}

	public Long getStatus() {
		return status;
	}

	public void setStatus(Long status) {
		this.status = status;
	}

	public Long getCodcontacto() {
		return codcontacto;
	}

	public void setCodcontacto(Long codcontacto) {
		this.codcontacto = codcontacto;
	}

	public Contacto getContacto() {
		return contacto;
	}

	public void setContacto(Contacto contacto) {
		this.contacto = contacto;
	}  

}

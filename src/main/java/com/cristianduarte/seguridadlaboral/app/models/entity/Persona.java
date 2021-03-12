package com.cristianduarte.seguridadlaboral.app.models.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "personas")
public class Persona implements Serializable{
	
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "idpersonas")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Long id;
	
	public String nombre;
	
	public String apellido;
	
	public String cedula;
	
	@Column(name = "tipo_lesion")
	public String tipolesion;
	
	
	

	public Persona() {
		
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getTipolesion() {
		return tipolesion;
	}

	public void setTipolesion(String tipolesion) {
		this.tipolesion = tipolesion;
	}

	public String getCedula() {
		return cedula;
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
	}
	
	

}

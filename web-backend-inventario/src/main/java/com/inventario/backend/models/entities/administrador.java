package com.inventario.backend.models.entities;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="administrador")

public class administrador {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Basic(optional = false)
	@Column(name = "idadministrador")
	private Integer idadministrador;
	
	@Column(name="nombre_administrador_adm")
	private String NombreAdministrador;
	
	@Column(name="usuario_sdministrador_adm")
	private String UsuarioAdministrador;
	
	@Column(name="contraseña_administrador")
	private int contraseñaAdministrador;
	
	@OneToOne(mappedBy ="administrador")
	private registro registros;

	public administrador() {
		super();
	}
	
	public administrador(int id) {
		super();
		this.idadministrador = id;
	}

	public Integer getIdadministrador() {
		return idadministrador;
	}

	public void setIdadministrador(Integer idadministrador) {
		this.idadministrador = idadministrador;
	}

	public String getNombreAdministrador() {
		return NombreAdministrador;
	}

	public void setNombreAdministrador(String nombreAdministrador) {
		NombreAdministrador = nombreAdministrador;
	}

	public String getUsuarioAdministrador() {
		return UsuarioAdministrador;
	}

	public void setUsuarioAdministrador(String usuarioAdministrador) {
		UsuarioAdministrador = usuarioAdministrador;
	}

	public int getContraseñaAdministrador() {
		return contraseñaAdministrador;
	}

	public void setContraseñaAdministrador(int contraseñaAdministrador) {
		this.contraseñaAdministrador = contraseñaAdministrador;
	}
	
	
}

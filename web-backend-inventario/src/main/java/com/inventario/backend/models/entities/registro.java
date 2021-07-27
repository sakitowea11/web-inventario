package com.inventario.backend.models.entities;

import java.util.List;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="registro")

public class registro {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Basic(optional = false)
	@Column(name = "idregistro")
	private Integer idregistro;
	
	@Column(name="fecha_reg")
	private String fecha;
	
	@Column(name="hora_reg")
	private String hora;
	
	@OneToMany(mappedBy = "registro",fetch = FetchType.LAZY)
	private List<producto> productos;
	
	@JoinColumn(name= "idadministrador",nullable  = false)
	@OneToOne(fetch = FetchType.LAZY)
	private administrador administrador;
	
	public registro() {
		super();
	}
	public registro(int id) {
		super();
		this.idregistro = id;
	}
	public Integer getIdregistro() {
		return idregistro;
	}
	public void setIdregistro(Integer idregistro) {
		this.idregistro = idregistro;
	}
	public String getFecha() {
		return fecha;
	}
	public void setFecha(String fecha) {
		this.fecha = fecha;
	}
	public String getHora() {
		return hora;
	}
	public void setHora(String hora) {
		this.hora = hora;
	}
	public administrador getAdministrador() {
		return administrador;
	}
	public void setAdministrador(administrador administrador) {
		this.administrador = administrador;
	}
	
	
}

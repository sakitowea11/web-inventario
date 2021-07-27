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
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="proveedor")
public class proveedor {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Basic(optional = false)
	@Column(name = "idproveedor")
	private Integer idproveedor;
	
	@Column(name="nombre_proveedor")
	private String NombreProveedor;
	
	@Column(name="cedula_proveedor")
	private String CedulaProveedor;
	
	@Column(name="direccion")
	private String Direccion;
	
	@Column(name="correo")
	private String Correo;
	
	@OneToMany(mappedBy = "proveedor",fetch = FetchType.LAZY)
	private List<producto> productos;
	
	
	
	
	public proveedor() {
		super();
	}
	public proveedor(int id) {
		super();
		this.idproveedor = id;

}
	public Integer getIdProveedor() {
		return idproveedor;
	}
	public void setIdProveedor(Integer idProveedor) {
		this.idproveedor = idProveedor;
	}
	public String getNombreProveedor() {
		return NombreProveedor;
	}
	public void setNombreProveedor(String nombreProveedor) {
		NombreProveedor = nombreProveedor;
	}
	public String getCedulaProveedor() {
		return CedulaProveedor;
	}
	public void setCedulaProveedor(String cedulaProveedor) {
		CedulaProveedor = cedulaProveedor;
	}
	public String getDireccion() {
		return Direccion;
	}
	public void setDireccion(String direccion) {
		Direccion = direccion;
	}
	public String getCorreo() {
		return Correo;
	}
	public void setCorreo(String correo) {
		Correo = correo;
	}
	
	
}


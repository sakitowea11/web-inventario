package com.inventario.backend.models.entities;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="productos")

public class producto {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Basic(optional = false)
	@Column(name = "idproducto")
	private Integer idproducto;  //atributo que se mapea con la primary key
	
	@Column(name="codigo_pro")
	private String codigo;
	
	@Column(name="nombre_productos_pro")
	private String nombreproducto;
	
	@Column(name="precio_pro")
	private String precio;
	
	@Column(name="cantidad_pro")
	private String cantidad;
	
	@Column(name="fechavencimiento_pro")
	private String fechavencimiento;
	
	@Column(name="fechaelaboracion_pro")
	private String fechaelaboracion;
	
	public producto() {
		super();
	}
	
	public producto(int id) {
		super();
		this.idproducto = id;
	}

	public Integer getIdproducto() {
		return idproducto;
	}

	public void setIdproducto(Integer idproducto) {
		this.idproducto = idproducto;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getProducto() {
		return nombreproducto;
	}

	public void setProducto(String producto) {
		this.nombreproducto = producto;
	}

	public String getPrecio() {
		return precio;
	}

	public void setPrecio(String precio) {
		this.precio = precio;
	}

	public String getCantidad() {
		return cantidad;
	}

	public void setCantidad(String cantidad) {
		this.cantidad = cantidad;
	}

	public String getFechavencimiento() {
		return fechavencimiento;
	}

	public void setFechavencimiento(String fechavencimiento) {
		this.fechavencimiento = fechavencimiento;
	}

	public String getFechaelaboracion() {
		return fechaelaboracion;
	}

	public void setFechaelaboracion(String fechaelaboracion) {
		this.fechaelaboracion = fechaelaboracion;
	}
	
	

}

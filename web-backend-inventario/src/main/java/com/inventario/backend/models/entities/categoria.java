package com.inventario.backend.models.entities;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="categoria")

public class categoria {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Basic(optional = false)
	@Column(name = "idcategoria")
	private Integer idcategoria;
	
	@Column(name="lactios_cat")
	private String lactios;
	
	@Column(name="carnesembutidos_cat")
	private String carnesembutidos;
	
	@Column(name="frutasverduras_cat")
	private String frutasverduras;
	
	@Column(name="bebidas_cat")
	private String bebidas;
	
	@Column(name="snaks_cat")
	private String Snaks;

	public categoria() {
		super();
	}
	
	public categoria(int id) {
		super();
		this.idcategoria = id;
	}

	public Integer getIdcategoria() {
		return idcategoria;
	}

	public void setIdcategoria(Integer idcategoria) {
		this.idcategoria = idcategoria;
	}

	public String getLactios() {
		return lactios;
	}

	public void setLactios(String lactios) {
		this.lactios = lactios;
	}

	public String getCarnesembutidos() {
		return carnesembutidos;
	}

	public void setCarnesembutidos(String carnesembutidos) {
		this.carnesembutidos = carnesembutidos;
	}

	public String getFrutasverduras() {
		return frutasverduras;
	}

	public void setFrutasverduras(String frutasverduras) {
		this.frutasverduras = frutasverduras;
	}

	public String getBebidas() {
		return bebidas;
	}

	public void setBebidas(String bebidas) {
		this.bebidas = bebidas;
	}

	public String getSnaks() {
		return Snaks;
	}

	public void setSnaks(String snaks) {
		Snaks = snaks;
	}
	
	
	
	
	
}
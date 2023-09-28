package com.ciberte.lp2.entidades;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="medicamentos")
public class Medicamentos {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idmedicamento;
	private String nombre;
	private String descripcion;
	private String categoria;
	private double precio;
	private int stock;
	
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date fechavencimiento;
	private String proveedor;
	
	public Medicamentos(int idmedicamento, String nombre, String descripcion, String categoria, double precio,
			int stock, Date fechavencimiento, String proveedor) {
		super();
		this.idmedicamento = idmedicamento;
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.categoria = categoria;
		this.precio = precio;
		this.stock = stock;
		this.fechavencimiento = fechavencimiento;
		this.proveedor = proveedor;
	}

	public Medicamentos() {
		super();
	}

	public int getIdmedicamento() {
		return idmedicamento;
	}

	public void setIdmedicamento(int idmedicamento) {
		this.idmedicamento = idmedicamento;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	public Date getFechavencimiento() {
		return fechavencimiento;
	}

	public void setFechavencimiento(Date fechavencimiento) {
		this.fechavencimiento = fechavencimiento;
	}

	public String getProveedor() {
		return proveedor;
	}

	public void setProveedor(String proveedor) {
		this.proveedor = proveedor;
	}

	@Override
	public String toString() {
		return "Medicamentos [idmedicamento=" + idmedicamento + ", nombre=" + nombre + ", descripcion=" + descripcion
				+ ", categoria=" + categoria + ", precio=" + precio + ", stock=" + stock + ", fecharegistro="
				+ fechavencimiento + ", proveedor=" + proveedor + "]";
	}
}

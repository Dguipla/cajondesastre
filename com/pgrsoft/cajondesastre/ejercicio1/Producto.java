package com.pgrsoft.cajondesastre.ejercicio1;

public class Producto {

	private int codigo;
	private String nombre;
	private double precio;
	private boolean descatalogado;
	private Familia familia;
	
	public Producto() {
		
	}
	
	public Producto(int codigo, String nombre, double precio, boolean descatalogado, Familia familia) {
		this.codigo = codigo;
		this.nombre = nombre;
		this.precio = precio;
		this.descatalogado = descatalogado;
		this.familia = familia;
	}



	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public boolean isDescatalogado() {
		return descatalogado;
	}

	public void setDescatalogado(boolean descatalogado) {
		this.descatalogado = descatalogado;
	}

	public Familia getFamilia() {
		return familia;
	}

	public void setFamilia(Familia familia) {
		this.familia = familia;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + codigo;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Producto other = (Producto) obj;
		if (codigo != other.codigo)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Producto [codigo=" + codigo + ", nombre=" + nombre + ", precio=" + precio + ", descatalogado="
				+ descatalogado + ", familia=" + familia + "]";
	}
	
}

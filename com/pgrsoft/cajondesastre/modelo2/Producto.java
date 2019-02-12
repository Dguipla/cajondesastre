package com.pgrsoft.cajondesastre.modelo2;

public class Producto {

	private int codigo;
	private String nombre;
	private double precio;
	private Familia familia;
	
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
	
	public Familia getFamilia() {
		return familia;
	}
	
	public void setFamilia(Familia familia) {
		this.familia = familia;
	}

	public String toString() {
		return "Producto [codigo=" + codigo + ", nombre=" + nombre + ", precio=" + precio + ", familia=" + familia
				+ "]";
	}

}

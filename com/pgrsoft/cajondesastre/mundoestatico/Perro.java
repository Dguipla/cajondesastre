package com.pgrsoft.cajondesastre.mundoestatico;

public class Perro {

	public final static int VIDA_MEDIA = 10;
	
	private int codigo;
	private String nombre;
	
	public Perro() {
		
	}
	
	public Perro(int codigo, String nombre) {
		this.codigo = codigo;
		this.nombre = nombre;
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

	@Override
	public String toString() {
		return "Perro [codigo=" + codigo + ", nombre=" + nombre + "]";
	}
		
}

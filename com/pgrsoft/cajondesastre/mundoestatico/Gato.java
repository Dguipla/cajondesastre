package com.pgrsoft.cajondesastre.mundoestatico;

public class Gato {

	private static double vidaMedia = 10;
	
	private int codigo;
	private String nombre;
	
	public Gato() {
		vidaMedia = vidaMedia - vidaMedia * 0.1;
		// También podríamos haber escrito
		//vidaMedia *= 0.9;
	}

	public Gato(int codigo, String nombre) {
		this();
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
		return "Gato [codigo=" + codigo + ", nombre=" + nombre + "]";
	}
	
	public static double getVidaMedia() {
		return vidaMedia;
	}
	
}

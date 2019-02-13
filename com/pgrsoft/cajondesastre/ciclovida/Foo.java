package com.pgrsoft.cajondesastre.ciclovida;

public class Foo {

	public static int numero = 10;
	
	public String nombre = "Pep�n";
	
	static {
		// M�todo de inicializaci�n est�tico
		System.out.println("m�todo static");
	}
	
	{
		System.out.println("Bloque pululante 1 nombre: " + nombre);
	}
	
	static {
		System.out.println("static 2");
	}
	
	public Foo() {
		// En este punto YA se han inicializado las variables
		System.out.println("Constructor. Nombre: " + nombre + " numero: " + numero);
	}
	
	{
		System.out.println("Bloque pululante 2 nombre: " + nombre);
	}
	
}

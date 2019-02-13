package com.pgrsoft.cajondesastre.herencia1;

public class TestClass {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		
		// Ejemplo1
		Cliente c1 = new Cliente();
		
		// Ejemplo2
		Persona p1 = new Persona();
		
		// Ejemplo3 (habitual)
		Persona p2 = new Cliente();
	
		Cliente c2 = (Cliente) p2; // casting
		
		// Ejemplo4 (no compila)
		//Cliente c3 = new Persona();
		

	}

}

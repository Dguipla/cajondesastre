package com.pgrsoft.cajondesastre.modelo2;

public class TestClass {

	public static void main(String[] args) {
		
		Producto p1 = new Producto();
		
		p1.setCodigo(1000);
		p1.setNombre("Impresora HP");
		p1.setPrecio(1200.50);
		p1.setFamilia(Familia.HARDWARE);
		
		// Vamos a mostrar por consola la instancia
		
		System.out.println(p1);

	}

}

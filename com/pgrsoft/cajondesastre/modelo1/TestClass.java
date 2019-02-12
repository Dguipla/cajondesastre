package com.pgrsoft.cajondesastre.modelo1;

public class TestClass {

	public static void main(String[] args) {
		
		Payaso p1 = new Payaso();
		
		p1.narizRoja = true;
		p1.nombre = "Pepín";
		p1.sexo = 'h';
		
		Payaso p2 = new Payaso();
		
		p2.narizRoja = false;
		p2.nombre = "Sergio Ramos";
		p2.sexo = 'h';
		
		p1.saluda();
		p1.saluda();
		p1.saluda();
		p2.saluda();

	}

}

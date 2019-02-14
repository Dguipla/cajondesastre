package com.pgrsoft.cajondesastre.override;

public class TestClass {

	public static void main(String[] args) {
		
		Deportista d1 = new Deportista();
		Deportista d2 = new Ciclista();
		
		d1.entrenar();
		d2.entrenar();

	}

}

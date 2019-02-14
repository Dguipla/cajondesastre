package com.pgrsoft.cajondesastre.igualdadidentidad;

public class TestClass {

	public static void main(String[] args) {
		
		Cliente c1 = new Cliente(100,"Pepín","Gálvez","Ridruejo");
		Cliente c2 = new Cliente(100,"Pepín","Gálvez","Ridruejo");
		
		if (c1.equals(c1)) {
			System.out.println("SON IGUALES");
		} else {
			System.out.println("SON DISTINTOS");
		}
		
		
		/*
		if (c1==c2) {
			System.out.println("SON EL MISMO");
		} else {
			System.out.println("NO SON EL MISMO");
		}
		
		*/
		

	}

}

package com.pgrsoft.cajondesastre.survivalkit;

public class TestClass {

	public static void main(String[] args) {
		
		// 1.- Extraer una parte de un String
		
		String texto = "camisa";
		System.out.println(texto.substring(2));
		System.out.println(texto.substring(2,4));
		
		// 2.- Conocer tamaño del String
		
		System.out.println("todoterreno".length());
		
		// 3.- Convertir String -> int
		
		String strNumero = "355";
		int numero = Integer.parseInt(strNumero);
		
		// 4.- Convertir un int -> String
		
		int numero2 = 100;
		String strNumero2 = "" + numero2;
		
		strNumero2 = String.valueOf(numero2);
		
		//
		
		
		
		
		
		
		
		
		
		
	}

}

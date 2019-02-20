package com.pgrsoft.cajondesastre.date.java7;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TestClass {

	public static void main(String[] args) throws ParseException{
		
		//Ahora
		Date fecha1 = new Date();
		
		System.out.println(fecha1);
		
		//1/1/1970
		Date fecha2 = new Date(0); 
		
		System.out.println(fecha2);
		
		//algunos milisengundos más tarde de 1/1/1970
		Date fecha3 = new Date(1560000000000L);
		
		System.out.println(fecha3);
		
		// Normalmente disponemos de un String que queremos pasar a Date
		
		String strFecha = "10/12/1987 05:34";
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm");
		
		Date fecha4 = sdf.parse(strFecha);
		
		System.out.println(fecha4);
		
		// Vamos a pasar de Date -> String con el SimpleDateFormat
		
		
		String ahora = sdf.format(fecha1);
		
		System.out.println(ahora);
		
	}

}

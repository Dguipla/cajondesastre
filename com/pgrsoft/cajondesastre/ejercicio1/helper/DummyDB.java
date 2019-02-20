package com.pgrsoft.cajondesastre.ejercicio1.helper;

import java.util.HashMap;
import java.util.Map;

import com.pgrsoft.cajondesastre.ejercicio1.model.Familia;
import com.pgrsoft.cajondesastre.ejercicio1.model.Producto;

public class DummyDB {

	private static final Map<Integer,Producto> PRODUCTOS = new HashMap<>();
	
	static {
		Producto p1 = new Producto(10,"Impresora HP",200.0,false,Familia.HARDWARE);
		Producto p2 = new Producto(15,"Impresora Epson",270.0,false,Familia.HARDWARE);
		Producto p3 = new Producto(23,"Cartucho Toner",45.0,false,Familia.CONSUMIBLE);
		Producto p4 = new Producto(36,"ContaNerd",56.0,true,Familia.SOFTWARE);
		Producto p5 = new Producto(55,"ContaNerd Deluxe",150.0,true,Familia.SOFTWARE);
		Producto p6 = new Producto(78,"Alfombrilla Real Madrid",15.0,true,Familia.CONSUMIBLE);
	
		PRODUCTOS.put(p1.getCodigo(),p1);
		PRODUCTOS.put(p2.getCodigo(),p2);
		PRODUCTOS.put(p3.getCodigo(),p3);
		PRODUCTOS.put(p4.getCodigo(),p4);
		PRODUCTOS.put(p5.getCodigo(),p5);
		PRODUCTOS.put(p6.getCodigo(),p6);
	}
	
	public Map<Integer,Producto> getProducts(){
		return PRODUCTOS;
	}
}

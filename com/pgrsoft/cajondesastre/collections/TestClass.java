package com.pgrsoft.cajondesastre.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Stream;

public class TestClass {

	public static void main(String[] args) {
		//testSet();
		//testSetPersona();
		//testList();
		//testMap();
		testStream();
	}
	
	private static void testStream() {
		
		// El punto de partida es una colección...
		
		List<String> nombres = Arrays.asList("Anabel","Mar","Pol");
		System.out.println(nombres);
		
		// Vamos a generar un stram a partir de la colección
		
		Stream<String> stream = nombres.stream();
		
		stream
			.filter(x -> x.length() <4) // operacion intermedia
			.map(x -> x.toUpperCase())   // operacion intermedia
			.forEach(System.out::println); // operacion terminal
	}
	
	private static void testMap() {
		Map<Integer,String> map = new HashMap<>();
		
		map.put(10,"Pepín");
		map.put(20,"Pepín");
		map.put(30,"Honorio");
		
		System.out.println(map.size());
		System.out.println(map);
		
		map.put(10,"María");
		System.out.println(map);
		
		// Quiero la columna de la izquierda!
		
		Set<Integer> keys = map.keySet();
		
		// Quiero la columna de la derecha!
		
		Collection<String> values = map.values();
		
		System.out.println("keys: " + keys);
		System.out.println("values: " + values);
		
	}
	
	private static void testList() {
		List<Integer> numeros = new ArrayList<>();
		
		numeros.add(10);
		numeros.add(10);
		numeros.add(10);
		numeros.add(20);
		
		System.out.println(numeros.size());
		System.out.println(numeros);
		
		
		
	}
	
	private static void testSetPersona() {
		
		Persona p1 = new Persona("Pepín",115.7);
		Persona p2 = new Persona("Honorio",79.5);
		Persona p3 = new Persona("Carlota",60.4);
		Persona p4 = new Persona("Pepín", 45.0);
		
		Set<Persona> personas = new HashSet<>();
		personas.add(p1);
		personas.add(p2);
		personas.add(p3);
		
		System.out.println(personas.size());
		System.out.println(personas);
		
		// No lo incorpora porque ya está
		personas.add(p4);
		System.out.println(personas.size());
		
		System.out.println(personas);
		
		
		
		
	}
	
	private static void testSet() {
		
		Set<Integer> numeros = new HashSet<>();
		
		numeros.add(10);
		numeros.add(20);
		numeros.add(30);
		
		// Vamos a mostrar el tamaño de la colección...
		System.out.println(numeros.size());
		
		numeros.add(10); // Pasa de todo? O lo substituye?
		
		// Vamos a mostrar el tamaño de la colección...
		System.out.println(numeros.size());
		
		// Vamos a iterar el Set con el "for each"
		
		for(Integer numero: numeros) {
			System.out.println("numero: " + numero);
		}
		
		// Se puede "imprimir de un plumazo"
		
		System.out.println(numeros);
		
		// Vamos a probar el TreeSet
		// Sólo funciona si la clase T implementa Comprable<T>
		
		// Demostración del método compareTo
		
		Integer integer1 = 100;
		Integer integer2 = 160;
		
		System.out.println("Honorio".compareTo("Pepín"));
		System.out.println("Pepín".compareTo("Honorio"));
		System.out.println("Pepín".compareTo("Pepín"));
		System.out.println("a".compareTo("A"));
		
		System.out.println(integer1.compareTo(integer2));
		System.out.println(integer2.compareTo(integer1));
		System.out.println(integer1.compareTo(integer1));
		
		Set<Integer> numerosOrdenados = new TreeSet<>();
		
		numerosOrdenados.add(100);
		numerosOrdenados.add(-50);
		numerosOrdenados.add(600);
		numerosOrdenados.add(-200);
		numerosOrdenados.add(0);

		System.out.println(numerosOrdenados);
		
	}

}

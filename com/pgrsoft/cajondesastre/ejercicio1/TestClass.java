package com.pgrsoft.cajondesastre.ejercicio1;

import java.util.List;
import java.util.Map;

public class TestClass {

	private ProductoServices productoServices = new ProductoServicesImpl();
	
	private void runTest() {
	 
		// Batería de test
		testRead();   				// read()
		testCreate(); 				// create()
		testGetAll(); 				// getAll()
		testDelete(); 				// delete()
		testUpdate(); 				// update()
		testGetDescatalogados(); 	// getDescatalogados()
		testGetBetweenPriceRange(); // getBetweenPriceRange()
		testGetByFamilia();			// getByFamilia()
		testCount();				// count()
		testGetStatistics();		// getStatistics()
	}
	
	private void testRead() {
		Producto producto = productoServices.read(10);
		System.out.println(producto);
	}
	
	private void testCreate() {
		Producto producto = new Producto(700,"Nuevo",100.0,false,Familia.HARDWARE);
		productoServices.create(producto);
		producto = null;
		producto = productoServices.read(700);
		System.out.println(producto);
	}
	
	private void testGetAll() {
		List<Producto> productos = productoServices.getAll();
		System.out.println(productos);
	}
	
	private void testDelete() {
		Producto producto = productoServices.read(10);
		System.out.println("Producto 10 antes de eliminar: " + producto);
		productoServices.delete(10);
		producto = productoServices.read(10);
		System.out.println("Producto 10 despues de eliminar: " + producto); 
	}
	
	private void testUpdate() {
		Producto producto = productoServices.read(36);
		System.out.println("producto #36 antes de update: " + producto);
		producto.setNombre("NUEVO NOMBRE");
		producto.setDescatalogado(false);
		producto.setPrecio(100.0);
		productoServices.update(producto);
		producto = null;
		producto = productoServices.read(36);
		System.out.println("producto #36 depués update: " + producto);
	}
	
	private void testGetDescatalogados() {
		List<Producto> descatalogados = productoServices.getDescatalogados();
		System.out.println(descatalogados);
	}
	
	private void testGetBetweenPriceRange() {
		// establezco min y max de manera que se filtren productos
		double min = 30.0;
		double max = 120.0;
		List<Producto> productos = productoServices.getBetweenPriceRange(min, max);
		System.out.println(productos);
	}
	
	private void testGetByFamilia() {
		Familia familia = Familia.HARDWARE;
		
		List<Producto> productos = productoServices.getByFamilia(familia);
		System.out.println(productos);	
	}
	
	private void testCount() {
		int numeroProductos = productoServices.count();
		System.out.println(numeroProductos);
	}
	
	private void testGetStatistics() {
		Map<String,Double> statistics = productoServices.getStatistics();
		for (String dato: statistics.keySet()) {
			System.out.println(dato + ": " + statistics.get(dato));
		}
	}

	public static void main(String[] args) {
		new TestClass().runTest();
	}

}

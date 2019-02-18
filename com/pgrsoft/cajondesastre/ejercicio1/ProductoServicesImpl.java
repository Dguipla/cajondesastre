package com.pgrsoft.cajondesastre.ejercicio1;

public class ProductoServicesImpl implements ProductoServices {

	private DummyDB dummyDB = new DummyDB();

	@Override
	public void create(Producto producto) {
		dummyDB.getProducts().put(producto.getCodigo(),producto);
	}
	
}

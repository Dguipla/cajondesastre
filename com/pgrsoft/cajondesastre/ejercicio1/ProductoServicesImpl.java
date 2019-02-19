package com.pgrsoft.cajondesastre.ejercicio1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ProductoServicesImpl implements ProductoServices {

	private DummyDB dummyDB = new DummyDB();

	@Override
	public void create(Producto producto) {
		dummyDB.getProducts().put(producto.getCodigo(),producto);
	}

	@Override
	public Producto read(int codigo) {
		return dummyDB.getProducts().get(codigo);
	}

	@Override
	public void update(Producto producto) {
		create(producto);
		
	}

	@Override
	public void delete(int codigo) {
		dummyDB.getProducts().remove(codigo);
	}

	@Override
	public List<Producto> getAll() {
		return new ArrayList<Producto>(dummyDB.getProducts().values());
	}

	@Override
	public List<Producto> getDescatalogados() {
		return dummyDB
			   .getProducts()
			   .values()
			   .stream()
			   .filter(p -> p.isDescatalogado())
			   .collect(Collectors.toList());
	}

	@Override
	public List<Producto> getBetweenPriceRange(double min, double max) {
		return dummyDB.getProducts()
				.values()
				.stream()
				.filter(x -> x.getPrecio() >= min && x.getPrecio() <= max)
				.collect(Collectors.toList());
	}

	@Override
	public List<Producto> getByFamilia(Familia familia) {
		return dummyDB.getProducts().values().stream()
				.filter(x -> x.getFamilia().equals(familia))
				.collect(Collectors.toList());
	}

	@Override
	public int count() {
		return dummyDB.getProducts().size();
	}

	@Override
	public Map<String, Double> getStatistics() {
		Map<String,Double> statistics = new HashMap<>();
		
		// TODO PENDIENTE DE IMPLEMENTAR
		
		return statistics;
	}
	
}

package com.pgrsoft.cajondesastre.ejercicio1.services;

import java.util.List;
import java.util.Map;

import com.pgrsoft.cajondesastre.ejercicio1.model.Familia;
import com.pgrsoft.cajondesastre.ejercicio1.model.Producto;

public interface ProductoServices {

	//Operaciones CRUD
	
	public void create(Producto producto);
	public Producto read(int codigo);
	public void update(Producto producto);
	public void delete(int codigo);
	
	// Obtención de listas
	
	public List<Producto> getAll();
	public List<Producto> getDescatalogados();
	public List<Producto> getBetweenPriceRange(double min, double max);
	public List<Producto> getByFamilia(Familia familia);
	
	// Datos estadísticos
	public int count();
	
	/**
	 * 
	 * Devuelve un Map con datos estadísticos
	 * 
	 * String				Double	
	 * Precio Máximo		1000.0
	 * Precio Mínimo          50.4 
  	 * Precio Medio          120.6
	 * Número de productos     256
	 * 
	 *
	 */
	public Map<String,Double> getStatistics();
	
	
}

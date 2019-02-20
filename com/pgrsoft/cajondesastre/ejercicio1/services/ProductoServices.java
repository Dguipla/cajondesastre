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
	
	// Obtenci�n de listas
	
	public List<Producto> getAll();
	public List<Producto> getDescatalogados();
	public List<Producto> getBetweenPriceRange(double min, double max);
	public List<Producto> getByFamilia(Familia familia);
	
	// Datos estad�sticos
	public int count();
	
	/**
	 * 
	 * Devuelve un Map con datos estad�sticos
	 * 
	 * String				Double	
	 * Precio M�ximo		1000.0
	 * Precio M�nimo          50.4 
  	 * Precio Medio          120.6
	 * N�mero de productos     256
	 * 
	 *
	 */
	public Map<String,Double> getStatistics();
	
	
}

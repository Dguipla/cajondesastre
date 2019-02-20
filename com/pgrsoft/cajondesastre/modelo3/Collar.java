package com.pgrsoft.cajondesastre.modelo3;

public class Collar {

	private String material;
	private String color;
	private boolean pinchos;
	
	public Collar() {
		
	}

	public Collar(String material, String color, boolean pinchos) {
		this.material = material;
		this.color = color;
		this.pinchos = pinchos;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public boolean isPinchos() {
		return pinchos;
	}

	public void setPinchos(boolean pinchos) {
		this.pinchos = pinchos;
	}

	@Override
	public String toString() {
		return "Collar [material=" + material + ", color=" + color + ", pinchos=" + pinchos + "]";
	}
	
	
	
	
}

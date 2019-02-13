package com.pgrsoft.cajondesastre.mundoestatico;

public class TestClass {

	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		
		// Cuál es la vida media de los perros?
		
		System.out.println(Perro.VIDA_MEDIA);
		
		Perro p1 = new Perro(666,"Damian");
		
		// Puedo preguntarle la vida media a una instancia?
		// Respuesta: Sí, pero es mala práctica
		System.out.println(p1.VIDA_MEDIA);
		
		// Experimentos con gatos...
		// La vida media baja un 10% cada vez que se crea un Gato!
		
		System.out.println("Vida media Gato: " + Gato.getVidaMedia());
		System.out.println("Vida media Gato: " + Gato.getVidaMedia());
		
		new Gato();
		
		System.out.println("Vida media Gato: " + Gato.getVidaMedia());
		
		new Gato();
		new Gato();
		new Gato();
		new Gato();
		
		System.out.println("Vida media Gato: " + Gato.getVidaMedia());
		
	}

}

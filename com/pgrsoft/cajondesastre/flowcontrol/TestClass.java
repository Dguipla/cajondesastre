package com.pgrsoft.cajondesastre.flowcontrol;

public class TestClass {

	public static void main(String[] args) {
		
		// if
		
		String mensaje = null;
		
		if ("OK".equals(mensaje)) {
			System.out.println("Mensaje OK");
		}
		
		// operador ternario
		
		String resultado = "";
		int nota = 6;
		
		if (nota >= 5) {
			resultado = "APTO";
		} else {
			resultado = "NO APTO";
		}
		
		
		resultado = nota>=5 ? "APTO" : "NO APTO";
		
		// While
		
		boolean seguir = true;
		
		while(seguir) {
			
			// break
			
			// System.exit(0);
			
			// return
			
			// int a = 1/0;
			
			seguir = (Math.random() < 0.8)? true: false;
			System.out.println("dentro...");
		}
		
		// do - while
		
		do {
			System.out.println("aparezco seguro...");
		} while (Math.random()<= 0.7);
		
		// switch
		
		String menu = "7";
		
		switch(menu) {
		
		default: System.out.println("otro numero");break;
		case "2" : System.out.println("dos");break;
		case "3" : System.out.println("tres");break;
		case "1" : System.out.println("uno");break;
		
		}
		
		
		// for
		
		for(;;){
			System.out.println("bucle infinito!");
			if (Math.random()< 0.9) {
				break;
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}

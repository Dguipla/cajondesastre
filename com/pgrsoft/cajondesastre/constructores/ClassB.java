package com.pgrsoft.cajondesastre.constructores;

public class ClassB extends ClassA{

	public ClassB() {
		this((byte)45);	
	}
	
	public ClassB(int parametro) {
		super();
		System.out.println("parametro: " + parametro);
	}
	
	public ClassB(double parametro) {
		super();
		System.out.println("parametro: " + parametro);
	}
	
	
	
	
	
	
	
}

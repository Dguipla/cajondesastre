package com.pgrsoft.cajondesastre.stack;

public class TestClass {

	public static void main(String[] args) {
		new TestClass().m1();
	}
	
	public void m1() {
		int numero = 100;
		System.out.println("m1 antes de invocar a m2");
		try {
			m2();
		} catch (NullPointerException e) {
			System.out.println("ha fallado m2 pero la vida continua...");
			
		} catch (Exception | Error e ) {
			m2();
			System.out.println("ha fallado m2 pero la vida continua...");
			
		} finally {
			System.out.println("finally");
		}
		System.out.println("m1 después de invocar a m2");
	}
	
	public void m2() throws NullPointerException{
		System.out.println("m2 antes de invocar a m3");
		m3();
		System.out.println("m2 después de invocar a m3");
	}
	
	public void m3() throws RuntimeException {
		int a = 5/0;
		System.out.println("m3");
	}
	
	

}

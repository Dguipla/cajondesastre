package com.pgrsoft.cajondesastre.stack;

public class TestClass2 {

	public static void main(String[] args) throws Exception {
		new TestClass2().m1();
	}
	
	public void m1() throws Exception {
		System.out.println("m1 antes de invocar a m2");
		m2();
		System.out.println("m1 después de invocar a m2");
	}
	
	public void m2() throws Exception {
		System.out.println("m2 antes de invocar a m3");
		m3();
		System.out.println("m2 después de invocar a m3");
	}
	
	public void m3() throws Exception{
		throw new Exception();
		
	}
	
	

}

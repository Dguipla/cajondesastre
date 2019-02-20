package com.pgrsoft.cajondesastre.singleton;

public class TestClass {

	public static void main(String[] args) {
		
	/*
		Connection c1 = new Connection();
		Connection c2 = new Connection();
	*/
		
		Connection c1 = Connection.getInstance();
		Connection c2 = Connection.getInstance();
		
		System.out.println(c1 == c2);
		
		
		
	}

}

package com.pgrsoft.cajondesastre.singleton;

public class Connection {

	private static final Connection LA_INSTANCIA = new Connection();
	
	private Connection() {
		
	}
	
	public static Connection getInstance() {
		return LA_INSTANCIA;
	}
	
	
	
	
}

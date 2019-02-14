package com.pgrsoft.cajondesastre.arrays;

public class TestClass2 {

	public static void main(String[] args) {
		
		// Crear "diagrama de bolas" de lo siguiente:
		
		int[] n1 = {1,10,20};
		int[] n2 = null;
		int[][] sup1 = new int[2][];
		int[] sup2 [] = {n1,n1,null};
		int[][][] grande = {sup2,sup1};
		
		grande[0][0][1] = 666;
		grande[0][0] = n2;

		grande[0][1] = grande [0][0];
		
		n1 = n2;
		
		grande[1] = grande [0];
		grande[0] = null;
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}

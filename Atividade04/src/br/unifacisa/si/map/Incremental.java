package br.unifacisa.si.map;

public class Incremental {
	
	private static int count = 0; 
	private static int numero; 
	private static Incremental inc = new Incremental(); 
	
	private Incremental() { 	
	} 

	public String toString() { 
		return "Incremental " + numero; 
	} 
	
	public static Incremental getInc() {
		numero = ++count; 
		return inc;
	}
} 
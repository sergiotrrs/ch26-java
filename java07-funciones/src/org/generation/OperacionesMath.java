package org.generation;

import java.util.Date;

public class OperacionesMath {
	
	void sumaEnterosSinRetorno(int a, int b){
		Date date = new Date(); // instanciando un objeto de tipo Date
		System.out.printf("%tT  %d + %d = %d %n", date, a, b, a+b);
	}
	
	int sumaEnteros (int a, int b) {
		return a + b ;		
	}
	
	

}

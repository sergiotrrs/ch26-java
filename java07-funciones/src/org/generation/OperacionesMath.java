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
	
	double sumaFlotantes (double a, double b) {
		return a + b;
	}
	
	// Sobrecarga de métodos ( overload)
	// funciones con el mismo nombre pero con diferentes parámetros
	int suma(int a, int b) {
		return a + b;			
	}
	
	int suma(short a, short b ) {
		return a + b;
	}
	
	double suma( double dataA, double dataB) {
		return dataA + dataB;
	}
	
	double suma( double dataA, double dataB, boolean redondear) {
		if (redondear)
			return  Math.round( dataA + dataB);
		return dataA + dataB;
	}
		
		
		
	
	

	// esto no es posible, se repite los parámetros.
	//float suma( double dataA, double dataB) {
	//	return float(a + b);
	//}
	

}

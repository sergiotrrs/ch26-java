package org.generation;

import java.util.Date;

public class OperacionesMath {
	
	// atributos.
	// atributos de instancia (non-static fields)
	// atributos de clase ( static fields)
	
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
	
	
	
	// Sobrecarga de un método que realiza la raiz cuadrada de
	// un valor. Un método retorna como int, otro método retorna
	// como double
	double squareRoot( double a) {
		return Math.sqrt(a);
	}
	
	/**
	 * Obtener la raiz cuadra de un número
	 * @param a valor a obtener la raiz cuadrada
	 * @return raiz cuadrada redondeada
	 */
	int squareRoot( int a) {
		return (int)(Math.round(Math.sqrt(a)));
	}
	
	
	// Métodos estáticos (Static Method)
	/*
	 * Los métodos estáticos se asocian a la clase en lugar de la
	 * instancia.
	 * Se pueden invocar sin tener que instanciar un objeto.
	 */

	static double valorPi() {		
		return Math.PI;
	}
	
	static double piPorNumero( int numero) {
		return numero * valorPi();
	}


}

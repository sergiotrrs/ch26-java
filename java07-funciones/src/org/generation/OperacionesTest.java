package org.generation;

public class OperacionesTest {

	public static void main(String[] args) {
		System.out.println("Java 07 Funciones");
		
		OperacionesMath operaciones;
		operaciones = new OperacionesMath();
		
		operaciones.sumaEnterosSinRetorno(35, 5); // 40
		operaciones.sumaEnterosSinRetorno( 3, 3); // 6
		
		int resultadoSuma = operaciones.sumaEnteros(10, 9); //19
		System.out.println( resultadoSuma );
		System.out.println( operaciones.sumaEnteros(4, 5) ); //9
		

	}

}

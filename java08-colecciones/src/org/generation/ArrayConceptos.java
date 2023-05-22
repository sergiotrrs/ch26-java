package org.generation;

public class ArrayConceptos {

	public static void main(String[] args) {
		/**
		 * Los arreglos se definen con corchetes []
		 * Los corchetes pueden ir anmtyes o después de la variable
		 * ej.  int[] myArray;
		 *      int myArray[];
		 * Para los arrglos se debe asignar la cantidad de elementos que contendrá
		 * Una vez definido, el arreglo no puede cambiar su tamaño.
		 */
		
		// Definimos un arreglo de 3 elementos tipo int.
		int[] codigoColores = new int[4]; // Instanciando un objeto de tipo Array, con 4 elementos
		                // [ 0 , 0 , 0 , 0 ]
		String nombreColores[] = new String[4];
		
		// Para agregar elementos en un arreglo, se indica dentro del corchete el índice.
		// El primer elemento es el índice 0
		nombreColores[0] = "Azul";
		codigoColores[0] = 0x00_00_FF; // RGB 0,0,255
		// Agregar color amarillo, negro
		nombreColores[1] = "Morado";
		codigoColores[1]= 0x80_00_80;
		
		nombreColores[2] = "Naranja";
		codigoColores[2]= 0xFF_80_00;

		// Iterar elementos en un arreglo
		// usando for loop
		
		for ( int i = 0; i< nombreColores.length; i++ ) {
			String texto = String
					.format("El color %s tiene el código RGB 0x%06X",
							nombreColores[i], codigoColores[i] );
			System.out.println( texto );			
		}
		
		// Iterar elementos de un arregloe
		// usando for each loop
		for (String nombreColor : nombreColores) {
			System.out.println("El color " + nombreColor);			
		}
		
		// Agregar un elemento al índice 5
		// Se crea la excepción que está fuera de los límites
		// nombreColores[5] = "Amarillo"; 
		
		// Inicialiazar un arreglo {} al asignarlo a la variable.
		String[] frutas = {"Uva", "Fresa", "Manzana"};
		
		// Instanciar un arreglo de 2 dimensiones.
		                                //   Feliz Cumpleaños
		                                   // F  C
		String[][] participantes = new String[3][5];
		

	}

}

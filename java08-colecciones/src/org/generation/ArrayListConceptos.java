package org.generation;

import java.util.ArrayList;

public class ArrayListConceptos {

	public static void main(String[] args) {
		/*
		 * Una colección List es una colección ORDENADA, en la que
		 * se permiten elementos duplicados.
		 * 
		 * Se basa en un array redimensionable que crece su tamaño,
		 * según crece la colección de elementos.
		 * 
		 * Esta colección es la que mejor rendimiento tiene.
		 * 
		 * Sintaxis:
		 *  ArrayList<object> varName;
		 */
		
		// Definir una colección de datos numéricos.
		int edad = 17;
		Integer age = 17;
		
		// ArrayList<int> calificaciones; Esto no se puede realizar
		ArrayList<Integer> calificaciones;
		
		// Definir una colección de Strings
		
		ArrayList<String> nombreLibros;
		nombreLibros = new ArrayList<>();
		
		// Agregar datos al ArrayList con el método add()
		// El primer elemento es el índice 0
		nombreLibros.add("Caperucita Roja");
		nombreLibros.add("Harry Potter");
		nombreLibros.add("Hansel y Gretel");
		nombreLibros.add("Libro vaquero"); // índice 3
		nombreLibros.add("El Hobbit");
		// se permite elementos duplicados.
		nombreLibros.add("Libro vaquero"); // indice 5
		
		// Obtener el tamaño de la colección, size()
		int sizeArrayList = nombreLibros.size();
		System.out.println("Número de elementos: " + sizeArrayList );
		
		System.out.println( nombreLibros );
		
		// Mostrar un elemento en particular
		// Indicamos el número de índice, usando el método get()
		System.out.println("David recomienda: " + nombreLibros.get(3));
		
		// Removemos un elemento de la colección
		// indicamoas el índice, usando el método remove()
		System.out.println("Elemento removido: " + nombreLibros.remove(0));

		System.out.println( nombreLibros );
		
		System.out.println("Está Harry Potter: " + nombreLibros.contains("Harry Potter") );
		System.out.println("Está Quiúbole con... : " + nombreLibros.contains("Quiúbole con...") );
		
		// Iteramos una colección ArrayList
		// for loop
		
		for (int i = 0; i < nombreLibros.size() ; i++) {
			System.out.println("Libro: " + nombreLibros.get(i) );
		}
		
		// for each loop
		for (String libro : nombreLibros) {
			System.out.println("Libro a leer: " + libro);
		}
		
		// for each de la colección
		nombreLibros.forEach( libro -> System.out.println(libro));
		
		// Si se usa el método set en un índice existente, lo reemplaza
		nombreLibros.set(1, "Clean code");
		System.out.println( nombreLibros );
		
		// Se pasa la referencia, es necesario usar el método
		// clone() para que sean colecciones independientes.
		ArrayList<String> books = nombreLibros;
		
		
		

	}

}

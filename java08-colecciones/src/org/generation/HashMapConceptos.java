package org.generation;

import java.util.HashMap;

public class HashMapConceptos {

	public static void main(String[] args) {
		/**
		 * Una colección Map, es una relación clave(key):valor(value)
		 * que forma una tabla de datos.
		 */
		
		// Definimos una colección HashMap
		// < key, value   >
		HashMap<Integer, String > students = new HashMap<>();
		
		// Agregamos valores a la colección, put()
		students.put( 12341 , "Juan Pablo" );
		students.put( 78390 , "Fátima Moreno" );
		students.put( 57896 , "Andrea Lizet" );
		students.put( 98992 , "Santiago Pérez" );
		
		System.out.println(students);
		
		// Reemplazar un elemento
		students.put( 57896 , "Sofi G" ); // reemplazar el elemento
		students.put( 11111 , "Sofi G" ); // Agregar un elemento duplicasdo
		
		System.out.println(students);
	
		// Mostramos un elemento en particular, usando get( key )
		System.out.println("Tiene Auto supersónico: " + students.get(12341));
		
		// Removiendo un elemento, remove( key )
		
		System.out.println("Removiendo: " + students.remove(57896));
		System.out.println(students);
		
		// Iterar la colección con sus keys
		for (int matricula : students.keySet() )
			System.out.println(matricula + " - " + students.get( matricula ));
		
		// Iterar la colección con sus values
		for (String student : students.values() )
			System.out.println("Estudiante: " + student);
		
		// Iterar con función lambda
		students.forEach( (key, value)-> System.out.println(key+" -> "+value));
		
	}

}

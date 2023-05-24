package org.generation;

import com.mundoanimal.*;


public class AnimalTest {

	public static void main(String[] args) {
		// No se puede instanciar una clase abstracta
		// Animal myAnimal = new Animal();
		
		// Dog solovino = new Dog("Solovino");
//		Animal solovino = new Dog("Solovino"); 
		Animal solovino = new Dog("Solovino"); 		
		
		System.out.println( solovino.eat("croquetas") );
		
		if( solovino instanceof Dog)	
			System.out.println( ((Canine)solovino).eat("croquetas", .300) );
		
		// Hacer una clase chihuahua, malinois extends Dog
		// sobreescribir makeNoise()
		
		Animal hercules = new Chihuahua("Hércules"); 
		System.out.println( ((Canine)hercules).makeNoise() ); // wau wau wau ... wau wau

		Animal benancio = new Malinois("Benancio"); 
		System.out.println( ((Canine)benancio).makeNoise() ); // guaff guaff guaff
		
		Animal colmillo = new Wolf("Colmillo", "Alfa");
		Animal jacob = new Wolf("Jacob", "Beta");
		System.out.println(colmillo.getName()+ ": " + ((Canine)colmillo).makeNoise());
		System.out.println(jacob.getName()+ ": " + ((Canine)jacob).makeNoise());
		
		
		
		
		
		
		
		
		 

	}

}

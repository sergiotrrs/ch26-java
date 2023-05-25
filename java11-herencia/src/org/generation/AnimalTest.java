package org.generation;

import java.util.ArrayList;
import java.util.List;

import com.mundoanimal.*;
import com.pet.Pet;


public class AnimalTest {

	public static void main(String[] args) {
		// No se puede instanciar una clase abstracta
		// Animal myAnimal = new Animal();
		
		// Dog solovino = new Dog("Solovino");
//		Animal solovino = new Dog("Solovino"); 
		Animal solovino = new Dog("Solovino"); 				
		Animal hercules = new Chihuahua("Hércules"); 
		Animal benancio = new Malinois("Benancio"); 
		Animal colmillo = new Wolf("Colmillo", "Alfa");
		Animal jacob = new Wolf("Jacob", "Beta");
		Pet kraken = new Chihuahua("Kraken");
		
		System.out.println( ((Chihuahua)kraken).makeNoise()  );
		System.out.println( ((Chihuahua)kraken).getName()  );
		
		List<Pet> pets = new ArrayList<>();
		pets.add(kraken);
		pets.add( (Chihuahua)hercules   );
		
		
		ArrayList<Animal> shelter = new ArrayList<>();
		shelter.add(solovino);
		shelter.add(hercules);
		shelter.add(benancio);
		shelter.add(colmillo);
		shelter.add(jacob);
		
		shelter.forEach( animal-> makeNoiseCanine(animal));		
		
		System.out.println( ((Chihuahua)hercules).trick() );
		System.out.println( ((Chihuahua)hercules).greeting() );
		System.out.println( hercules );
		System.out.println( shelter );
		
	}
	
	public static void makeNoiseCanine(Animal canine) {
		if(canine instanceof Canine)
			System.out.println(canine.getName() + " hace el ruido: " 
					+ ((Canine)canine).makeNoise()  );
		else
			System.out.println("Esto no es un canino");
	}

}

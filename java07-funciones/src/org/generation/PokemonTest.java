package org.generation;

public class PokemonTest {

	public static void main(String[] args) {
		System.out.println("Los Pokemones son: " + Pokemon.nacimiento);
		
		
		
		Pokemon pikachu = new Pokemon("Pikachu", 41, 6);
		Pokemon vamoACalmarnos = new Pokemon("Pikachu de agua", 50, 9);	
		
		System.out.println(pikachu.nombre);
		System.out.println(vamoACalmarnos.nombre);

	}

}

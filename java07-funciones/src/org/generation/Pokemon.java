package org.generation;

public class Pokemon {
	// Atributos de instancia (non-static fields)
	String nombre;
	int alturaCm;
	double pesoKg;
	// Atributos de clase (static fields)
	static String nacimiento = "Ovíparos";
	
	// Métodos constructores
	// Debe tener el mismo nombre de mi Clase
	// los métodos constructores no tiene retorno (return)
	Pokemon(String nombrePokemon, int alturaCmPk, double pesoKgPk){
		System.out.println("Has creado un pokemon llamado " + nombrePokemon);
		nombre = nombrePokemon;
		alturaCm = alturaCmPk;
		pesoKg = pesoKgPk;
	}
	
	
	
	// Métodos de instancia
	
	// Métodos de clase

}

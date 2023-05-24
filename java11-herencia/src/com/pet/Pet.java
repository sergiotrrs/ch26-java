package com.pet;
/**
 * Una interfaz es una declaración formal de un
 * contrato, en la cuál los métodos no contienen
 * implementaciones. Es similar a los métodos abstractos
 * 
 * Una clase puede implementar varias interfaces.
 * 
 * Las clases son adecuadas para proporcionar funcionalidad
 * a clases que no están relacionadas entre si.
 * 
 * Para patrones de diseño, se suele utilizar interfaces
 */
public interface Pet {
	
	// Los atributos en interfaces son de tipo final y static.
	//public static final boolean PET = true;
	boolean PET = true;
	
	// Los métodos son de tipo public, abstract
	
	String trick();
	
	void setOwnerName(String name);
	
	String getOwnerName();
	
	// A partir de la V.8 de java, se permite, tener métodos default
	// que tengan una implementación
	default String greeting() {
		return "Soy una mascota";
	}


}

package com.mundoanimal;

/**
 * Para aplicar la herencia, en la definición de la clase
 * agregamos la plabra 'extend' e indicamos la clase superior.
 * 
 * Para conocer si estamos aplicando adecuadamente la
 * herencia, podríamos preguntarnos con "is-a".
 * @author TuX3
 *
 */
public abstract class Canine extends Animal {

	
	public Canine(String name) {
		super(name); // inicializando el constructor de mi clase sup.
	}
	
	/**
	 * Estamos sobreescribiendo (Overriding) el método de nuestra
	 * clase superior.
	 * La sobreescrituba debe tener la misma firma del método
	 * de la clase superior.
	 * La sobreescritura permite que una subclase proporcione
	 * una implementación diferente a un método que está definido
	 * el la clase superior. Permite personalizar el comportamiento
	 * heredado.
	 */
	

}

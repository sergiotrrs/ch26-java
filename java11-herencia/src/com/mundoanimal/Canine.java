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
	 * 
	 * @Override: Indica que el método está sobreescribiendo
	 * el comportamiento de un método de la clase heredada.
	 * Su propósito es hacer una varificación en tiempo
	 * de compilación para asegurarse que la subclase
	 * está sobreescribiendo correctamente y coincide
	 * con la firma del método de la clase superior.
	 */
	@Override
	public String eat(String food) {
		return "El canino " + super.getName() + " come " + food;		
	}
	
	
	public String eat(String food, double kg) {
		return "El canino " + super.getName() 
		 + " come " + kg + " kg. de " + food ;		
	}
	
	public String makeNoise() {
		return "grrrr";
	}
	
	
	
	/**
	 * Al ser la clase Canine abstracta, no tiene
	 * la obligación de realizar la implementación
	 * en el método abastracto 'showPicture'.
	 */

}

package com.mundoanimal;
/**
 * Las clases abstractas son clases que no se pueden instanciar.
 * Estas clases se utilizan como modelos(plantillas) para
 * crear subclases concretas que se pueden instanciar.
 * 
 * Una clase abstracta se declara en la firma de la clase
 * con la palabra 'abstract'.
 * 
 * La clase abstracta puede contener métodos abstractos y
 * métodos concretos.
 * 
 * Un método abstracto se declara sin implementación y se 
 * definen en las subclases.
 * 
 * Las clases abstractas se recomienda utilizar para
 * clases que estén estrechamente relacionadas (is-A).
 * 
 * @author TuX3
 *
 */
public abstract class Animal {
	private String name= "---";
	private String type = "---";
	private double sizeInMts;
	private double weightInKg;
	private boolean alive;
	
	
	public Animal(String name) {
		this.name = name;
	}
	
	/**
	 * Un método abstracto no tiene cuerpo, solo la definición del método.
	 * Termina el punto y coma.
	 * La clase heredada es quién implementará el comportamiento.
	 * Si existe un método abstracto, la clase también debe ser abstracta.	 * 
	 */
	abstract public String showPicture();
	
	public String eat(String food) {
		return this.name + " está comiendo " + food;		
	}
	
	public String sleep(int minutes) {
		return this.name+" duerme " + minutes + " minutos";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

		public double getSizeInMts() {
		return sizeInMts;
	}

	public void setSizeInMts(double sizeInMts) {
		this.sizeInMts = sizeInMts;
	}

	public double getWeightInKg() {
		return weightInKg;
	}

	public void setWeightInKg(double weightInKg) {
		this.weightInKg = weightInKg;
	}

	public boolean isAlive() {
		return alive;
	}

	public void setAlive(boolean alive) {
		this.alive = alive;
	}
		
	
	
}

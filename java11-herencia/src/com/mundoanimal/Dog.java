package com.mundoanimal;

public class Dog extends Canine {

	public Dog(String name) {
		super(name); // hace referencia a la clase Dog		
	}

	@Override
	public String showPicture() {		
		return "http://"+ super.getName()+".com";
	}
	
	@Override
	public String eat(String food) {
		return "El lomito " + getName() + " come " + food + " todo bonito todo panzon";
	}

	public String makeNoise() {
		return "grrrr";
	}
	
	

}

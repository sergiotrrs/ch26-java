package com.mundoanimal;

public class Chihuahua extends Dog{

	public Chihuahua(String name) {
		super(name);		
	}
	
	@Override
	public String makeNoise() {
		return "wau wau wau ... wau wau";
	}

}

package com.mundoanimal;

public class Malinois extends Dog{

	public Malinois(String name) {
		super(name);		
	}
	
	@Override
	public String makeNoise() {
		return "guaff guaff guaff";
	}

}

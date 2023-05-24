package com.mundoanimal;

import com.pet.Pet;

public class Chihuahua extends Dog implements Pet{
	
	private String ownerName;

	public Chihuahua(String name) {
		super(name);		
	}
	
	@Override
	public String makeNoise() {
		return "wau wau wau ... wau wau";
	}

	@Override
	public String trick() {
		return "Soy "+ super.getName() +" muevo la colita como helicóptero";
	}

	@Override
	public void setOwnerName(String name) {
		this.ownerName = name;
		
	}

	@Override
	public String getOwnerName() {
		return this.ownerName;
	}

}

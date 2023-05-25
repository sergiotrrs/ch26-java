package com.mundoanimal;

import com.pet.Pet;

public final class Chihuahua extends Dog implements Pet{
	
	private String ownerName;
	static final String COUNTRY_OF_ORIGIN = "México"; 

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

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(super.toString() );
		builder.append("\tChihuahua [ownerName=");
		builder.append(ownerName);
		builder.append("]\n");
		return builder.toString();
	}
	
	
	

	

}

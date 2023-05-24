package com.mundoanimal;

public class Wolf extends Canine {
	
	private String rol;

	public Wolf(String name, String rol) {
		super(name);		
		this.rol = rol;
	}


	public String getRol() {
		return rol;
	}

	public void setRol(String rol) {
		this.rol = rol;
	}

	@Override
	public String showPicture() {		
		return "https://es.wikipedia.org/wiki/Canis_lupus";
	}
	
	@Override
	public String makeNoise() {
		return "AAAaauu AAAaauuu AAAAAAAuuu";
	}
	
	

}

package com.citibanamex;

public class Atm {
	
	private int serialNumber;
	private double balance;
	
	private static int counterAtm = 1;
	
	public Atm() {
		this.balance = 100_000;
		this.serialNumber = counterAtm ++;
	}
	
	public Atm(double balance){
		this(); // se invoca al constructor sin parámetros (default)
		this.balance = balance;
	}
	
	public Atm(String balance) {
		this( Double.parseDouble(balance)  );		
	}
		
}

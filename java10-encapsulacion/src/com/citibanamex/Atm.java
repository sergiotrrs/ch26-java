package com.citibanamex;

public class Atm {
	int serialNumber;
	public double balance;
	
	public static int counterAtm = 1;
	
	public Atm() {
		
	}
	
	public Atm(double balance){
		this.balance = balance;
	}
}

package com.citibanamex;

public class Atm {
	
	private int serialNumber;
	private double balance;
	
	private static int counterAtm = 1;
	
	public Atm() {
		setBalance(100_000);
		setSerialNumber( counterAtm ++ );		
	}
	
	public Atm(double balance){
		this(); // se invoca al constructor sin parámetros (default)
		//this.balance = balance;
		setBalance(balance);
	}
	
	public Atm(String balance) {
		this( Double.parseDouble(balance)  );		
	}
	
	// Para acceder a los atributos encapsulados
	// se usan los setters y getters.
	
	public int getSerialNumber() {		
		return this.serialNumber;
	}
	
	private int setSerialNumber( int serialNumber ) {
		return this.serialNumber = serialNumber;
	}
	
	public double getBalance() {
		return this.balance;
	}
	
	private double setBalance(double balance) {
		return this.balance = balance;
	}
	
	public static int getCounterAtm() {
		return counterAtm;
	}
	
	public double deposit(double amount) {
		if(amount>0) {			
			return setBalance( getBalance() + amount );
		}
		else {
			return 0;
		}			
	}
	
	public double withdraw(double amount) {
        if(amount > 0 && amount <= getBalance()) {
            return setBalance( getBalance() - amount);
        } else {
        	System.out.println("Fondos insuficientes");
            return setBalance( getBalance() );
        }
    }
	
	public String displayInfo() {
		//return "Serial number: " + this.serialNumber 
		//		+ ", Amount: $"  + this.balance;
		StringBuilder strBuilder = new StringBuilder();
		strBuilder.append("Serial number: ");
		strBuilder.append(this.serialNumber);
		strBuilder.append(", Amount: $");
		strBuilder.append(this.balance);
		
		return strBuilder.toString();
		
	}
		
}

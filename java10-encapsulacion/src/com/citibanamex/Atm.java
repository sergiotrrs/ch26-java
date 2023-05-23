package com.citibanamex;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Atm {
	
	private int serialNumber;
	private double balance;
	private ArrayList<String> log = new ArrayList<>();
	
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
	
	private void setLog(double amount) {
		this.log.add(getDate()+ " - Withdraw $ " + amount + ",  Balance: " + getBalance() + "\n");
	}
	
	public String getLog() {
		String ANSI_RESET = "\u001B[0m";
		String ANSI_BLUE = "\u001B[34m";
		String ANSI_YELLOW = "\u001B[33m";

		StringBuilder strBuilder = new StringBuilder();
		
		strBuilder.append(ANSI_YELLOW);
		for (String event : this.log ) {
			strBuilder.append(event);
		}
		strBuilder.append(ANSI_RESET);
		
	    return strBuilder.toString();			
	}
	
	public double withdraw(double amount) {
        if(amount > 0 && amount <= getBalance()) {
        	setLog(amount);
            return setBalance( getBalance() - amount);
        } else {
        	System.out.println("Fondos insuficientes");
            return  getBalance();
        }
    }
	
	private String getDate() {
		Date date = new Date();
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/mm/dd hh:mm:ss");
		return dateFormat.format(date);
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

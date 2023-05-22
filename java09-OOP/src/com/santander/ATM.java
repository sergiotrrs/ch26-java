package com.santander;

public class ATM {
	// atributos de instancia (non-static fields)
	String serialNumber; // null
	double balance; // 0.0
	
	// atributos de clase (static fields)
	static String bankName;
	
	// bloque de inicialización de atributos de instancia
	{
		serialNumber= "---";
		balance = 100_000.00;
	}
	
	// bloque de inicialización de atributos de clase
	static {
		bankName = "Santander S.A de C.V.";
	}
	
	// constructores
	ATM (String serialNumber, double balance){
		this.serialNumber = serialNumber;
		this.balance = balance;
	}
	
	
	// métodos de instancia
	double getBalance() {
		return this.balance;
	}
	
	// métodos de clase	
	static String getBankName() {
		return "Bank: " + bankName;
	}

}

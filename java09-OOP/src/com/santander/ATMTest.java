package com.santander;

public class ATMTest {

	public static void main(String[] args) {
		// Para utilizar los atributos/métods de clase
		// no se requiere una instancia. Se usa directamente
		// de la clase.
		String firstBankName = ATM.bankName; // atributo
		String bankName = ATM.getBankName(); // método
		System.out.println( firstBankName );
		System.out.println( bankName );
		
		// Instanciar un objeto de la clase
		ATM cajeroA;
		cajeroA = new ATM("A1", 50_000.00);
		ATM cajeroB = new ATM("A2", 75_000.00);
		ATM cajeroC = new ATM(60_000);
		ATM cajeroD = new ATM(65_000);
		ATM cajeroE = new ATM(70_000);
		
		System.out.println(cajeroA.serialNumber +" $"+ cajeroA.getBalance() );
		System.out.println(cajeroB.serialNumber +" $"+ cajeroB.getBalance() );
		System.out.println(cajeroC.serialNumber +" $"+ cajeroC.getBalance() );
		System.out.println(cajeroD.serialNumber +" $"+ cajeroD.getBalance() );
		System.out.println(cajeroE.serialNumber +" $"+ cajeroE.getBalance() );
		
	}

}

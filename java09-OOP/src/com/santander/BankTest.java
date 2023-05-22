package com.santander;

public class BankTest {

	public static void main(String[] args) {
		Bank bankFatima = new Bank();
		Bank bankAlexis = new Bank("Av. Siempre viva");
		
		bankFatima.ATMs.add( new ATM(10_000)  );
		bankFatima.ATMs.add( new ATM(11_000)  );
		
		bankAlexis.ATMs.add( new ATM(21_000)  );
		bankAlexis.ATMs.add( new ATM(22_000)  );
		
		System.out.println( bankFatima.getATMs());
		System.out.println( bankAlexis.getATMs());

	}

}

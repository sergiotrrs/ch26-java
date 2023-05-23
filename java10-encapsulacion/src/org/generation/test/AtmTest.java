package org.generation.test;

import com.citibanamex.Atm;

public class AtmTest {

	public static void main(String[] args) {
		System.out.println("Counter Atm: " +  Atm.counterAtm );
		
		Atm cajeroA = new Atm(10_000);
		// Al usar el constructor por default, se agregue
		// 100_000 al atributo balance.
		Atm cajeroB = new Atm();
		
		System.out.println( cajeroA.balance);
		System.out.println( cajeroB.balance);
		
	
		

	}

}

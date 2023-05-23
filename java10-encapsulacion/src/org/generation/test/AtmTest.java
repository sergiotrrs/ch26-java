package org.generation.test;

import com.citibanamex.Atm;

public class AtmTest {

	public static void main(String[] args) {
		System.out.println("Counter Atm: " +  Atm.counterAtm );
		
		Atm cajeroA = new Atm(9_000);
		Atm cajeroB = new Atm();	
		Atm cajeroC = new Atm("777000");
	
		System.out.println( cajeroA.serialNumber);
		System.out.println( cajeroA.balance);
		System.out.println( cajeroB.serialNumber);
		System.out.println( cajeroB.balance);
		System.out.println( cajeroC.serialNumber);
		System.out.println( cajeroC.balance);
				
		cajeroA.balance = 1;
		cajeroA.serialNumber = -1;
		
		System.out.println( cajeroA.serialNumber);
		System.out.println( cajeroA.balance);

	}

}

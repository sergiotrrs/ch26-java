package org.generation.test;

import com.citibanamex.Atm;

public class AtmTest {

	public static void main(String[] args) {
		System.out.println("Counter Atm: " +  Atm.getCounterAtm() );
		
		Atm cajeroA = new Atm(9_000);
		Atm cajeroB = new Atm();	
		Atm cajeroC = new Atm("777000");
	
		

	}

}

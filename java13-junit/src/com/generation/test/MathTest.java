package com.generation.test;


import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.generation.utils.Math;

public class MathTest {
	Math math = new Math();

	@Test
	@DisplayName("Sumatoria de números enteros")
	void sumaTest() {		
		assertEquals( 9, math.suma(8, 1), "Suma de 1 unidad" );
		assertEquals( 54, math.suma(44, 10), "Suma de decenas" );
		assertEquals( 1400, math.suma(800, 600), "Suma de centenas" );
		assertEquals( 100_000, math.suma(90_000, 10_000), "Suma de millares" );

		assertEquals( -7, math.suma(8, -15), "Suma de 1 unidad negativa" );
		assertEquals( -34, math.suma(-44, 10), "Suma de decenas negativas" );
		assertEquals( 200, math.suma(800, -600), "Suma de centenas negativas" );
		assertEquals( -80_000, math.suma(-90_000, 10_000), "Suma de millares negativas" );
				
	}
	
	@Test
	@DisplayName("Sumatoria de números de punto flotante")
	void sumaDoubleTest(){
		double delta = 0.001;
		
		assertEquals(10.02 , math.suma(10.01, 0.01), 0.001 ,"Suma de 1 centésima" );
		assertEquals(10.04 , math.suma(10.02, 0.02), delta,  "Suma de 2 centésima" );
		assertEquals(10.06 , math.suma(10.03, 0.03), delta, "Suma de 3 centésima" );
		assertEquals(10.10 , math.suma(10.05, 0.05), delta, "Suma de 5 centésima" );
		assertEquals(10.08 , math.suma(10.04, 0.04), delta, "Suma de 4 centésima" );
		assertEquals(10.12 , math.suma(10.06, 0.06), delta, "Suma de 6 centésima" );
		assertEquals(10.14 , math.suma(10.07, 0.07), delta, "Suma de 7 centésima" );
		assertEquals(10.16 , math.suma(10.08, 0.08), delta, "Suma de 8 centésima" );
		assertEquals(10.18 , math.suma(10.09, 0.09), delta, "Suma de 9 centésima" );
	}
	
	
	
	
	
	
	
	
	
	
	
	
}

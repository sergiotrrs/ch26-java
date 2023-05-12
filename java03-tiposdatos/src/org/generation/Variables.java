package org.generation;

public class Variables {

	public static void main(String[] args) {
		/*
		 * Reglas para el nombre de las variables:
		 *  - Se distingue entre minúsculas y mayúsculas
		 *  - La longitud del nombre es ilimitada
		 *  - Puedes utilizar cualquier caracter Unicode
		 *  - La variable puede comenzar:
		 *    > una letra ej. miVariable
		 *    > signo de dolar $miVariable
		 *    > caracter de subrayado _miVariable
		 *  
		 */
		
		int $myVar; // es válido, pero no se recomienda
		int _myVar; // es válida, pero no se recomienda
		// int #myVar; // no es válido.
		int myVarEspañol; // es válido, pero no se recomienda, de preferencia nombres en ingles.
		// int 5comentarios; // no es válido, no se puede comenzar con un número
		int sinC0m3nt4r10s; // es válido
		
		/*
		 * En Java tendremos  los siguientes tipo de variables:
		 *  Variables de instancia (Non static fields): atributos de los objetos.
		 *  Variables de clase (Static Fields): atributos de la clase.
		 *  Variables locales (local variables): variable dentro de las funciones(métodos)
		 *  Parámetros (parameters): Entrada de las funciones
		 * 
		 */
		
	/**
	 *  https://docs.oracle.com/javase/tutorial/java/nutsandbolts/datatypes.html
	 *  Tipos de datos en Java
	 *  - Objetos
	 *  - Datos primitivos
	 *  	8 datos primitivos
	 *   > byte
	 *   > shorte
	 *   > int
	 *   > long
	 *   > float
	 *   > double
	 *   > boolean
	 *   > char
	 *      
	 */
		
	// El tipo byte es de 8 bits, almacena datos numéricos enteros.
		byte myVarByte = 12;
		System.out.println("byte: " + myVarByte);
	// 2^8 = 256
	// Obtener el valor máximo y mínimo del tipo byte, usando su
	// wrapper (Clase envolvente) Byte.
		System.out.println("Byte, Max value: " + Byte.MAX_VALUE );
		System.out.println("Byte, Min value: " + Byte.MIN_VALUE );
		
	// El tipo short es de 16 bits, almacena datos numéricos enteros.
	// 2^16 = 65536
		short myVarShort = 500;
		System.out.println("short: " + myVarShort);
		System.out.println("Short, Max value: " + Short.MAX_VALUE);
		System.out.println("Short, Min value: " + Short.MIN_VALUE);
	
	// El tipo int es de 32 bits, almacena datos numéricos enteros.
	// 2^32 = 2147483647
		int myVarInt = 1000;
		System.out.println("int: " + myVarInt);
		// El wrapper para int -> Integer
		System.out.println("Integer, Max value: " + Integer.MAX_VALUE);
		System.out.println("Integer, Min value: " + Integer.MIN_VALUE);
	
	// El tipo long es de 64 bits, almacena datos numéricos enteros.
	// 2^64
		long myVarLong = 1500;
		System.out.println("long: " + myVarLong);
		System.out.println("Long, Max value: " + Long.MAX_VALUE);
		System.out.println("Long, Min value: " + Long.MIN_VALUE);
	
	// ---------------------------------------------------------------
	// El tipo float es de 32 bits, almacena datos numéricos de punto flotante (real).
		float myVarFloat = 1500.6523F;
		System.out.println("float: " + myVarFloat);
		System.out.println("Float, Max value: " + Float.MAX_VALUE);
		System.out.println("Float, Min value: " + Float.MIN_VALUE);
		
	// Las literales numéricas enteras son de tipo int.
	// Las literales numéricas de punto flotante son de tipo double
	// Para indicar una literal numérica de tipo long, hay que indicar
	// la literal con la letra l o L
		long myLiteralLong = 2147483648L;
	// Para indicar una literal numérica de tipo float, hay que indicar
	// la literal con la letra f.
		
	// El tipo double es de 64 bits, almacena datos de punto flotante
		double myVarDouble = 1500.6523;
		System.out.println("double: " + myVarDouble);
		System.out.println("Double, Max value: " + Double.MAX_VALUE);
		System.out.println("Double, Min value: " + Double.MIN_VALUE);
		
		
		// ---------------------------------------------------------------
		// El tipo boolean solo almacena valores true o false
		   boolean myVarBoolean = true;
		
	// El tipo char solo almacena un caracter, se debe definir la literal
	// entre apostrofes ej. 'a'. Solo almacena caracteres de la tabla unicode(16 bits)
	// puede almacenar del 0 al 65535.
		   
	   char losPandillerosDeLaTarde = 'I';
	   System.out.println("char: " + losPandillerosDeLaTarde);
	// Podemos definir un char por su código unicode o su valores numérico.
	   char letraL = '\u004C'; // L
	   System.out.println("La letra L: " + letraL);
	   char letraM = 77; // M
	   System.out.println("La letra M: " + letraM);
		
	// Formas de representar un número
	   
		
	}
	

}

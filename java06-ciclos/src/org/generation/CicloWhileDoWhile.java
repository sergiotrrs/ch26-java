package org.generation;
import java.util.Scanner;

public class CicloWhileDoWhile {

	public static void main(String[] args) {
		/**
		 * Ciclo While
		 * Mientras la condición sea verdadera, se realiza un nuevo ciclo.
		 * 
		 * Sintaxis:
		 *     
		 *     while( condicion ) instruccion;
		 *     
		 *     while( condicion ) {
		 *        instrucciones;
		 *     }
		 * 
		 */
		
		// Scanner sc = new Scanner( System.in );
		var sc  = new Scanner( System.in );
		System.out.println( sc );
		
		boolean active = false;
		
		while ( active  ) {
			System.out.println("Bienvenido Alexis");
			System.out.println("Quieres seguir activo (s/n)?");
			char response = sc.nextLine().toLowerCase().charAt(0);
			if( response != 's' ) active = false; // break;			
		}
		
		do {
			System.out.println("Bienvenida Patito");
			System.out.println("Quieres seguir activa (s/n)?");
			char response = sc.nextLine().toLowerCase().charAt(0);
			if( response == 's' ) active = true;				
			else active = false; // break;
		}while (active);
		
		
		System.out.println("Gracias por tu visita");
		
		//while( sc.nextLine().toLowerCase().charAt(0) == 's' );		
		//System.out.println("Adiós");
		
		
		sc.close();

	}

}

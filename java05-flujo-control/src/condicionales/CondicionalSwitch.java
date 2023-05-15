package condicionales;

import java.util.Scanner;

public class CondicionalSwitch {

	public static void main(String[] args) {
		/**
		 * Sintaxis:
		 * 
		 * switch( expresión ){
		 *   case valor1 : expresión;
		 *                 break;
		 *   case valor2 : expresión;
		 *                 break;
		 *   default:      expresión;
		 *                 break;  
		 * } 
		 * 
		 * La expresión a evaluar debe ser un tipo entero, string o enum.
		 * La condicional Switch usa el método equals para comparar los Strings.
		 */

		// -------------------------------------------------------
		/**
		 * Leer usando la clase Scanner un mes (1 - 12) e indicar el mes en texto.
		 * ej:entrada-> "Escribe tu mes de nacimiento: " 12
		 *    salida->  Naciste en diciembre.
		 * 
		 */
		Scanner sc = new Scanner( System.in );
		System.out.println("***** Mes de nacimiento ******");
		System.out.print("Introduce el mes de nacimiento (1-12) :");
		 if( sc.hasNextInt()) {
			 String mesTxt = "";
			 int mesNacimiento = sc.nextInt();
			 // Switch para encontrar el mes
			 switch(mesNacimiento) {
			 case 1 :
				 mesTxt = "Enero";
				 break;
			 case 2 :
				 mesTxt = "Febrero";
				 break;
			 case 3 :
				 mesTxt = "Marzo";
				 break;
			 case 4 :
				 mesTxt = "Abril";
				 break;
			 case 5 :
				 mesTxt = "Mayo";
				 break;
			 case 6 :
				 mesTxt = "Junio";
				 break;
				 //TODO agregar los meses 4-11
			 case 12 :
				 mesTxt = "Diciembre";
				 break;
			 default:
				 mesTxt = "mes no existe";
			 }
			 
			System.out.println("Naciste en el mes de " + mesTxt);
	
		 }
		
	}

}

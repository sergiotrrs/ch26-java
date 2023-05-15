package condicionales;

import java.util.Scanner;

public class CondicionalSwitch {

	public static void main(String[] args) {
		/**
		 * Sintaxis:
		 * 
		 * switch( expresión ){ case valor1 : expresión; break; case valor2 : expresión;
		 * break; default: expresión; break; }
		 * 
		 * La expresión a evaluar debe ser un tipo entero, string o enum. La condicional
		 * Switch usa el método equals para comparar los Strings.
		 */

		// -------------------------------------------------------
		/**
		 * Leer usando la clase Scanner un mes (1 - 12) e indicar el mes en texto.
		 * ej:entrada-> "Escribe tu mes de nacimiento: " 12 salida-> Naciste en
		 * diciembre.
		 * 
		 */
		Scanner sc = new Scanner(System.in);
		System.out.println("***** Mes de nacimiento ******");
		System.out.print("Introduce el mes de nacimiento (1-12) :");
		if (sc.hasNextInt()) {
			String mesTxt;
			int mesNacimiento = sc.nextInt();
			sc.nextLine();
			// Switch para encontrar el mes
			switch (mesNacimiento) {
			case 1:
				mesTxt = "Enero";
				break;
			case 2:
				mesTxt = "Febrero";
				break;
			case 3:
				mesTxt = "Marzo";
				break;
			case 4:
				mesTxt = "Abril";
				break;
			case 5:
				mesTxt = "Mayo";
				break;
			case 6:
				mesTxt = "Junio";
				break;
			case 7, 8, 9, 10, 11:
				mesTxt = "Falta incluir el mes";
				break;
			// TODO agregar los meses 7-11
			case 12:
				mesTxt = "Diciembre";
				break;
			default:
				mesTxt = "mes no existe";
			}

			System.out.println("Naciste en el mes de " + mesTxt);

			// La estación correspondiente al mes de nacimiento.
			// ej: La estación es invierno.
			// 12, 1, 2 : invierno
			// 3, 4, 5 : primavera
			// 6, 7, 8 : verano
			// 9, 10, 11 : otoño
			String estacion;
			switch (mesTxt.toLowerCase()) {
			// ToDo dic, enero, feb = Invierto
			case "diciembre":
			case "enero":
			case "febrero":
				estacion = "Invierno";
				break;
			case "marzo", "abril", "mayo":
				estacion = "primavera";
				break;
			case "junio", "julio", "agosto":
				estacion = "verano";
				break;
			case "septiembre", "octubre", "noviembre":
				estacion = "otoño";
				break;
			default:
				estacion = "La estación no existe";
			}
			System.out.println("La estación corresponde a " + estacion);

		} else {
			System.out.println("Error en el mes introducido, hasta pronto");
		}
		sc.close();

	}

}

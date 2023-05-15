package condicionales;

public class DatosInmutables {

	public static void main(String[] args) {
		// Dato inmutable: No se puede modificar.
		int nCuentaBancaria = 678; 
		nCuentaBancaria = 999;
		
		String nombre = "Alex";
		String participante = "Sofi";
		nombre = "Alexis";
		// participante = "Alex";
		participante = new String("Alex");
		
		// El operador == nos compara la referencia en los objetos
		// Para comparar el contenido en los Strings, se debe
		// usar el método equals().
		
		// if ( participante == "Alex" ) {
		if ( participante.equals("Alex") ) {
			System.out.println("Los nombres concuerdan");
		}
		else System.out.println("Los nombres son diferentes");
		
		
				

	}

}

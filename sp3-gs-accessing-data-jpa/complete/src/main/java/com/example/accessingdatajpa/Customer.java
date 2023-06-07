package com.example.accessingdatajpa;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
/*
 * @Entity se usa para marcar una clase como una entidad 
 * que se puede persistir en una base de datos relacional.
 * Se indica a JPA que la clase representa una tabla en 
 * la base de datos y que los objetos de esa clase pueden 
 * ser almacenados, actualizados o eliminados en dicha tabla. 
 * Además, cada instancia de la clase se considera una fila en la tabla.
 * 
 */
@Entity
public class Customer {

	
	@Id // atributo que será la clave primaria de la entidad	
	@GeneratedValue(strategy=GenerationType.IDENTITY) 
	// indica como se generará automáticamente
	// el valor de las claves primarias
	private Long id;
	private String firstName;
	private String lastName;

	protected Customer() {}

	public Customer(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}

	@Override
	public String toString() {
		return String.format(
				"Customer[id=%d, firstName='%s', lastName='%s']",
				id, firstName, lastName);
	}

	public Long getId() {
		return id;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}
}

/*
 * GenerationType.AUTO: Esta estrategia le permite al proveedor de JPA 
 * elegir automáticamente la estrategia de generación más adecuada según 
 * la base de datos y la configuración. El comportamiento exacto puede 
 * variar dependiendo del proveedor utilizado.
 *
 * GenerationType.IDENTITY: Esta estrategia utiliza una columna de identidad 
de la base de datos para generar automáticamente los valores de la clave primaria. 
Es compatible con bases de datos como MySQL que admiten columnas de autoincremento. 
En este caso, la base de datos se encarga de generar y asignar el valor de la clave primaria.

GenerationType.SEQUENCE: Esta estrategia utiliza una secuencia de la base 
de datos para generar automáticamente los valores de la clave primaria. 
Se requiere que la base de datos admita secuencias. El proveedor de JPA 
utiliza la secuencia definida en la base de datos para obtener los valores 
de la clave primaria.

GenerationType.TABLE: Esta estrategia utiliza una tabla especial en la base 
de datos para generar los valores de la clave primaria. Se crea una tabla 
separada que registra los valores generados para cada entidad. El proveedor 
de JPA consulta esta tabla para obtener el próximo valor de la clave primaria.
 * 
 */

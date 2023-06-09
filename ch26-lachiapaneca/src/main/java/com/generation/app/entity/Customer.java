package com.generation.app.entity;

import java.sql.Timestamp;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.NoArgsConstructor;
/*
 * @Entity marcar una clase como una entidad que se mapea a una tabla de una base
 *  de datos. Se indica a JPA que la clase representa una tabla en la DB y que sus
 *  atributos se maperán a columnas en esa tabla. Es importante tener un constructor sin
 *  argumentos, así como setters y getters.
 *  
 * @NoArgsConstructor le indica a Lombok que cree un constructor sin argumentos
 * 
 * @Data le indica a Lombok que genere automáticamente los métodos comunes como
 * toString(), equals(), hashCode(), Setters y Getters para todos los atributos.
 * 
 * @Id indicamos que este campo será nuestra llave primaría.
 * 
 * @GeneratedValue indica como se generará automáticamente el valor de las claves 
 * primarias.
 */
@NoArgsConstructor
@Data
@Entity
public class Customer {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String firstName;
	private String lastName;
	private String address;
	private String email;
	private String password;
	private boolean active;
	private Timestamp create_at;	
	
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
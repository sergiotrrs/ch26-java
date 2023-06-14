package com.generation.app.entity;

import java.sql.Timestamp;

import com.generation.app.config.CustomerParameters;

import jakarta.persistence.*;
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
 * 
 * @Table indica el nombre de lña tabla en la DB quie se debe utilizar para mapear la entidad.
 * 
 * @Column se usa en JPA para mapear un atributo de la clase de la entidad a una columna
 * de una tabla en la DB.
 */
@NoArgsConstructor
@Data
@Entity
@Table(name = "customer")
public class Customer implements CustomerParameters {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private long id;
	@Column(name = "first_name", nullable = false, length = FIRSTNAME_MAX_LENGTH)
	private String firstName;
	@Column(name = "last_name", length = LASTNAME_MAX_LENGTH)
	private String lastName;
	@Column(name = "address", length = ADDRESS_MAX_LENGTH)
	private String address;
	@Column(name = "email", nullable = false, unique = true, length = EMAIL_MAX_LENGTH)
	private String email;
	@Column(name = "password", nullable = false, length = PASSWORD_MAX_LENGTH)
	private String password;
	@Column(name = "active")
	private boolean active;
	// insertablem, updatable: la columna se incluye en las operaciones de inserción/actualización
	// columnDefinirtion: definición personalizada para la columna(tipo específico de dato, restricciones)
	@Column(name = "create_at", insertable = false, updatable = false
			, columnDefinition = "timestamp default  CURRENT_TIMESTAMP")
	private Timestamp createAt;
	
//	@ManyToMany(fetch = FetchType.EAGER )
//	private List<ROLE> roles;
	
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
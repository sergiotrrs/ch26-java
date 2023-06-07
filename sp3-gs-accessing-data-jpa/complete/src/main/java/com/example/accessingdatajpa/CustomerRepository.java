package com.example.accessingdatajpa;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
/*
 * La especificación de JPA es una especificación estándar de Java 
 * que define una interfaz común y un conjunto de reglas para 
 * el mapeo objeto-relacional y la gestión de entidades en aplicaciones Java.
 * 
 * Varios proveedores de tecnología, como Hibernate, EclipseLink, Apache OpenJPA, 
 * entre otros, implementan la especificación de JPA y proporcionan las bibliotecas 
 * y herramientas necesarias para utilizar JPA en aplicaciones Java. 
 * Estas implementaciones ofrecen funcionalidades adicionales y 
 * características específicas, además de cumplir con los requisitos 
 * básicos definidos por la especificación de JPA.
 * 
 *  Por defecto, Spring Boot utiliza Hibernate como proveedor de JPA.
 *  
 *  Puedes especificar el proveedor de JPA a través de la propiedad 
 *  spring.jpa.properties.hibernate.dialect, donde hibernate.dialect 
 *  es la propiedad específica de Hibernate
 *  
 *  Hibernate es un framework de mapeo objeto-relacional que simplifica 
 *  el acceso a bases de datos relacionales y permite a los desarrolladores 
 *  trabajar con objetos en lugar de consultas SQL.  Hibernate proporciona 
 *  un lenguaje de consulta llamado Hibernate Query Language (HQL), 
 *  similar a SQL pero orientado a objetos.
 *  
 *  CrudRepository es una interfaz básica que proporciona métodos CRUD estándar, 
 *  mientras que JpaRepository es una interfaz extendida de CrudRepository 
 *  que agrega funcionalidades específicas de JPA. Si estás utilizando JPA 
 *  en tu aplicación de Spring y necesitas características adicionales como 
 *  consultas personalizadas o paginación, es recomendable utilizar JpaRepository. 
 *  Sin embargo, si solo necesitas las operaciones CRUD básicas, 
 *  CrudRepository puede ser suficiente.
 */
public interface CustomerRepository extends CrudRepository<Customer, Long> {

	List<Customer> findByLastName(String lastName);

	Customer findById(long id);
}

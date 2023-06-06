package org.generation.saludo.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/*
 * @Controller Indica la clase como un controlador MVC (Model-View-Controller).
 *  Esta clase se encarga de manejar las solicitudes HTTP y devuelve uina respuesta
 */

@Controller
public class GreetingController {

	@GetMapping("/greeting2") // http://localhost:8082/greeting
	public String greeting() {	
		System.out.println("Método greeting");
		return "greeting";
	}
	
	
}

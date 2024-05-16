/**
 * 
 */
package com.ideashappy.hello.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 
 */
@RestController
@RequestMapping("/holamundo")
public class HelloWorldController {
	
	// Crearemos un primer endpoint de nuestro API básico
	@GetMapping
	public ResponseEntity<String> helloWorld(){
		return new ResponseEntity<>("Hola mundo!", HttpStatus.OK);
	}

}

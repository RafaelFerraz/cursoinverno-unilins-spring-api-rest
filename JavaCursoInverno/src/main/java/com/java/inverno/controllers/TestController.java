package com.java.inverno.controllers;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping (path = "/test")

public class TestController {
	
	private static final String GREETING = "Hello ";
	
	@GetMapping (path = "/hello", produces = MediaType.APPLICATION_JSON_VALUE)
	public String hello() {
		return "Hello World";
	}
	
	@GetMapping (value = "/{name}", produces = MediaType.APPLICATION_JSON_VALUE)
	public String greetings(@PathVariable (value = "name") String name) {
		return GREETING + name;
	}
}

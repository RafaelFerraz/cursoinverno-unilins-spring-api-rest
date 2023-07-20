package com.java.inverno.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.java.inverno.model.Person;
import com.java.inverno.services.PersonServices;

@RestController
@RequestMapping(path = "/person")
public class PersonController {
	
	@Autowired
	private PersonServices service;
	
	@GetMapping(path = "/{id}")
	public Person findOne(@PathVariable(name = "id") String id) {
		return service.findById(id);
	}
}

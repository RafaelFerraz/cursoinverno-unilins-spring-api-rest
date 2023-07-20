package com.java.inverno.services;

import java.util.concurrent.atomic.AtomicLong;
import java.util.logging.Logger;

import org.springframework.stereotype.Service;

import com.java.inverno.model.Person;

@Service
public class PersonServices {
	
	private final AtomicLong counter = new AtomicLong();
	private Logger logger  = Logger.getLogger(PersonServices.class.getName());

	public Person findById (String id) {
		logger.info("Buscando uma pessoa");
		var person = new Person();
		
		person.setNome("Rafael");
		person.setSobrenome("Ferraz");
		person.setGenero("Masculino");
		
		return person;
	}
	
}

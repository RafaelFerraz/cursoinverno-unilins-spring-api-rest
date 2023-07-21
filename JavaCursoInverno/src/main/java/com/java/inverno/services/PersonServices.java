package com.java.inverno.services;

import java.util.ArrayList;
import java.util.List;
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
	
	public List<Person> findAll() {
		logger.info("Buscando todas as pessoas");
		List<Person> persons = new ArrayList<>();
		
		for (int i = 0; i < 10; i++) {
			var person = mockPerson(i);
			persons.add(person);
		}
		
		return persons;
	}
	
	public Person create(Person person) {
		logger.info("Criando uma pessoa");
		return person;
	}
	
	public Person update(Person person) {
		logger.info("Atualizando uma pessoa");
		return person;
	}
	
	public void delete(String id) {
		logger.info("Deletando um registro");
	}

	private Person mockPerson(int i) {
		var person = new Person();
		person.setNome("Rafael " + i);
		person.setSobrenome("Ferraz " + i);
		person.setGenero("Masculino " + i);
		person.setEmail("teste@gmail.com " + i);
		person.setEndereco("Avenida Nicolau Zarvos " + i);
		return person;
	}
}

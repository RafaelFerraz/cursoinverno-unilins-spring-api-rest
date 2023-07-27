package com.java.inverno.services;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.java.inverno.exceptions.ResourceNotFoundException;
import com.java.inverno.model.Person;
import com.java.inverno.repository.PersonRepository;

@Service
public class PersonServices {
	
	private final AtomicLong counter = new AtomicLong();
	private Logger logger  = Logger.getLogger(PersonServices.class.getName());

	@Autowired
	private PersonRepository repository;
	
	public Person findById (Long id) {
		logger.info("Buscando uma pessoa");
		
		var person = repository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Nenhum registro encontrado para esse id."));
		return person;
	}
	
	public List<Person> findAll() {
		logger.info("Buscando todas as pessoas");
		List<Person> persons = repository.findAll();
		
		return persons;
	}
	
	public Person create(Person person) {
		logger.info("Criando uma pessoa");
		
		var created = repository.save(person);
		
		return created;
	}
	
	public Person update(Person person) {
		logger.info("Atualizando uma pessoa");
		
		var entity = repository.findById(person.getId()).orElseThrow(() -> new ResourceNotFoundException("Nenhum registro encontrado para esse id"));
		
		 updateEntity(person, entity);
		
		repository.save(entity);
		
		return entity;
	}

	private void updateEntity(Person person, Person entity) {
		entity.setNome(person.getNome());
		 entity.setSobrenome(person.getSobrenome());
		 entity.setGenero(person.getGenero());
		 entity.setEmail(person.getEmail());
		 entity.setEndereco(person.getEndereco());
	}
	
	public void delete(Long id) {
		logger.info("Deletando um registro");
		var entity = repository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Nenhum registro encontrado para esse id"));
		repository.delete(entity);
	}

//	private Person mockPerson(int i) {
//		var person = new Person();
//		person.setNome("Rafael " + i);
//		person.setSobrenome("Ferraz " + i);
//		person.setGenero("Masculino " + i);
//		person.setEmail("teste@gmail.com " + i);
//		person.setEndereco("Avenida Nicolau Zarvos " + i);
//		return person;
//	}
}

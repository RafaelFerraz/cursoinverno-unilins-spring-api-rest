package com.java.inverno.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.java.inverno.model.Music;
import com.java.inverno.services.MusicServices;

@RestController
@RequestMapping(path = "/music")
public class MusicController {
	
	@Autowired
	private MusicServices service;
	
	@GetMapping(path = "/{id}")
	public Music findOne(@PathVariable(name = "id") Long id) {
		return service.findById(id);
	}
	
	@GetMapping()
	public List<Music> findAll() {
		return service.findAll();
	}
	
	@PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public Music create(@RequestBody Music music) {
		return service.create(music);
	}
	
	@PutMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public Music update(@RequestBody Music music) {
		return service.update(music);
	}
	
	@DeleteMapping(value = "/{id}")
	public void delete(@PathVariable (value = "id") Long id) {
		service.delete(id);
	}
}

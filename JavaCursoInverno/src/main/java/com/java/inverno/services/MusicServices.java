package com.java.inverno.services;

import java.util.List;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.java.inverno.exceptions.ResourceNotFoundException;
import com.java.inverno.model.Music;
import com.java.inverno.repository.MusicRepository;

@Service
public class MusicServices {

	private Logger logger = Logger.getLogger(MusicServices.class.getName());

	@Autowired
	private MusicRepository repository;

	public Music findById(Long id) {
		logger.info("Buscando uma musica");

		var music = repository.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("Nenhum registro encontrado para esse id."));
		return music;
	}

	public List<Music> findAll() {
		logger.info("Buscando todas as musicas");
		List<Music> musics = repository.findAll();

		return musics;
	}

	public Music create(Music music) {
		logger.info("Criando uma musica");

		var created = repository.save(music);

		return created;
	}

	public Music update(Music music) {
		logger.info("Atualizando uma musica");

		var entity = repository.findById(music.getId())
				.orElseThrow(() -> new ResourceNotFoundException("Nenhum registro encontrado para esse id"));

		updateEntity(music, entity);

		repository.save(entity);

		return entity;
	}

	private void updateEntity(Music music, Music entity) {
		entity.setTitle(music.getTitle());
		entity.setArtist(music.getArtist());
		entity.setYear(music.getYear());
	}

	public void delete(Long id) {
		logger.info("Deletando um registro");
		var entity = repository.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("Nenhum registro encontrado para esse id"));
		repository.delete(entity);
	}

}

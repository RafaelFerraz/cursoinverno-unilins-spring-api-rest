package com.java.inverno.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.java.inverno.model.Music;

public interface MusicRepository extends JpaRepository<Music, Long>{

}

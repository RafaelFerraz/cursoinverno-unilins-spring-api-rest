package com.java.inverno.model;

import java.io.Serial;
import java.io.Serializable;
import java.util.Objects;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "musics")
public class Music implements Serializable{

	/**
	 * 
	 */
	@Serial
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "title")
	private String title;
	
	@Column(name = "artist")
	private String artist;
	
	@Column(name = "year")
	private int year;
	
	public Music() {
		// TODO Auto-generated constructor stub
	}
	
	public Music(Long id, String title, String artist, int year) {
		this.id = id;
		this.title = title;
		this.artist = artist;
		this.year = year;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(artist, id, title, year);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Music other = (Music) obj;
		return Objects.equals(artist, other.artist) && Objects.equals(id, other.id)
				&& Objects.equals(title, other.title) && year == other.year;
	}

	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getArtist() {
		return artist;
	}
	public void setArtist(String artist) {
		this.artist = artist;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	
	

}

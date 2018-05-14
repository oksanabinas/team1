package com.oksana.binas;

public class Song {
	
	private String surname;
	private String name;
	private Float duration;
	
	public Song(String surname, String name, float duration) {
		super();
		this.surname = surname;
		this.name = name;
		this.duration = duration;
	}

	public Song(String surname, int name, float duration) {
	}

	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Float getDuration() {
		return duration;
	}
	public void setDuration(Float duration) { this.duration = duration;
	}
	
	
}

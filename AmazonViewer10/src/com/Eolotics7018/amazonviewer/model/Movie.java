package com.Eolotics7018.amazonviewer.model;

public class Movie {
	// modelo para el modelo movie
	
	// atributos
	private int id;
	private String title;
	private String genre;
	private String creator;
	private int duration;
	private short year;
	private boolean viewed;
	private int timeViewed;
	
	// EL metodo constructor ya esta provisto por java
	// nunca regresa un valor y tiene el nombre de la clase
	
	//sobrecarga de constructores
	
	// fueron creados con click derecho-> source -> generate constructors using fields
	public Movie(String title, String genre, String creator, int duration, short year) {
		super();
		this.title = title;
		this.genre = genre;
		this.creator = creator;
		this.duration = duration;
		this.year = year;
	}

	
	public Movie(String title, String genre, short year) {
		super();
		this.title = title;
		this.genre = genre;
		this.year = year;
	}
	
	public void showData() {
		System.out.println("Title: " + this.title);
		System.out.println("Genre: " + this.genre);
		System.out.println("Year: " + this.year);
	}
}

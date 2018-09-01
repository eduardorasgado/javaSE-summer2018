package com.Eolotics7018.amazonviewer.model;
// del jdk de java
import java.util.Date;

public class Book {
	private int id;
	private String title;
	private Date editionDate;
	private String editorial;
	private String[] authors;
	private String isbn;
	// si el libro ya fue leido
	private boolean read;
	// tiempo en qu el libro fue leido
	private int timeRead;
	
	public Book(String title, Date editionDate, String editorial, String isbn) {
		super();
		this.title = title;
		this.editionDate = editionDate;
		this.editorial = editorial;
		this.isbn = isbn;
	}
	
	

}

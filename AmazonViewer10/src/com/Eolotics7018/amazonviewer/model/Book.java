package com.Eolotics7018.amazonviewer.model;
// del jdk de java
import java.util.Date;

public class Book {
	int id;
	String title;
	Date editionDate;
	String editorial;
	String[] authors;
	String isbn;
	// si el libro ya fue leido
	boolean read;
	// tiempo en qu el libro fue leido
	int timeRead;

}

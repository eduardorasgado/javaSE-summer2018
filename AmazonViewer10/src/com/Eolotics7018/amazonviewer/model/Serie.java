package com.Eolotics7018.amazonviewer.model;

public class Serie {
	private int id;
	private String title;
	private String genre;
	private String creator;
	private String duration;
	private short year;
	private boolean viewed;
	private int timeViewed;

	// chapters -> array = chapters[]

	public Serie(String title, String genre, String duration) {
		super();
		this.title = title;
		this.genre = genre;
		this.duration = duration;
	}
	
}

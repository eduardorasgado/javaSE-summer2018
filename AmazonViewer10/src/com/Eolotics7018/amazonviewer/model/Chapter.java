package com.Eolotics7018.amazonviewer.model;

public class Chapter {
	
	private int id;
	private String title;
	private String duration;
	private short year;
	private boolean viewed;
	private int timeViewed;
	
	private int seasonNumber;

	public Chapter(String title, String duration, short year) {
		super();
		this.title = title;
		this.duration = duration;
		this.year = year;
	}
	
}

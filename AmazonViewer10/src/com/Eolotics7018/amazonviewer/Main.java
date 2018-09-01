package com.Eolotics7018.amazonviewer;

import java.util.Date;

import com.Eolotics7018.amazonviewer.model.Movie;

public class Main {

	public static void main(String[] args) {
		// program main function
		// creando una instancia
		Movie movie = new Movie("Coco", "Animation", (short) 2017);
		
		movie.showData();
		
		showMenu();
	}
	
	public static void showMenu() {
		// variable para salir
				int exit = 0;
				
		// bucle de ejecucion inicial
		do {
			System.out.println("");
			System.out.println("****BIENVENIDO A AMAZON VIEWER****");
			System.out.println("");
			System.out.println("");
			System.out.println("Selecciona el número de la opción deseada");
			System.out.println("1. Movies");
			System.out.println("2. Series");
			System.out.println("3. Books");
			System.out.println("4. Magazines");
			System.out.println("5. Report");
			System.out.println("6. Report Today");
			System.out.println("0. Exit");
			System.out.println("\n");
			
			// Leer la respuesta del usuario
			int opcion = 1;
			
			switch (opcion) {
			case 0:
				System.out.println("Elegiste salir");
				break;
			case 1:
				showMovies();
				break;
			case 2:
				showSeries();
				break;
			case 3:
				showBooks();
				break;
			case 4:
				showMagazines();
				break;
			case 5:
				makeReport();
				break;
			case 6:
				// el de la sobrecarga de metodos
				makeReport(new Date());
				break;
				
			default:
				System.out.println("Opcion inválida");
				break;
			}
		} while (exit != 0);
	}
	
	public static void showMovies() {
		int exit = 0;
		do {
			System.out.println();
			System.out.println("::MOVIES::");
			System.out.println();
		} while (exit != 0);
	}
	
	public static void showSeries() {
		int exit = 0;
		do {
			System.out.println();
			System.out.println("::SERIES::");
			System.out.println();
		} while (exit != 0);
	}
	
	public static void showChapters() {
		int exit = 0;
		do {
			System.out.println();
			System.out.println("::CHAPTERS::");
			System.out.println();
		} while (exit != 0);
	}
	
	public static void showBooks() {
		int exit = 0;
		do {
			System.out.println();
			System.out.println("::BOOKS::");
			System.out.println();
		} while (exit != 0);
	}
	
	public static void showMagazines() {
		int exit = 0;
		do {
			System.out.println();
			System.out.println("::MAGAZINES::");
			System.out.println();
		} while (exit != 0);
	}
	
	// SOBRECARGA DE METODOS
	public static void makeReport() {
		
	}
	
	public static void makeReport(Date date) {
		
	}

}

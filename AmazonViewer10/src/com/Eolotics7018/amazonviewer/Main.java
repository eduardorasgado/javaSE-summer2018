package com.Eolotics7018.amazonviewer;

import com.Eolotics7018.amazonviewer.model.Movie;

public class Main {

	public static void main(String[] args) {
		// program main function
		
		Movie movie = new Movie();
		movie.title = "Coco";
		movie.duration = 120;

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
			System.out.println("0. Exit");
			System.out.println("\n");
			
			// Leer la respuesta del usuario
			int opcion = 1;
			
			switch (opcion) {
			case 0:
				System.out.println("Elegiste salir");
				break;
			case 1:
				System.out.println("Elegiste Series");
				break;
			case 2:
				System.out.println("Elegiste Movies");
				break;
			case 3:
				System.out.println("Elegiste Books");
				break;
			case 4:
				System.out.println("Elegiste Magazines");
				break;
				
			default:
				System.out.println("Opcion inválida");
				break;
			}
		} while (exit != 0);
	}

}

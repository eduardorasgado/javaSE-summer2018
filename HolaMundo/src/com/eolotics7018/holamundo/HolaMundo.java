package com.eolotics7018.holamundo;

public class HolaMundo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hola Java!");
		
		// Enteros
		byte edad = 127; // +- 128
		short year = 32767; // +- 32768
		int idUser = 1001;
		long id_twitter = 2342343543245983L; // Al final debemos agregar una L
		
		// Punto flotante
		float diametro = 34.25F; // la F indica que lo tome com Float y no double
		double precio = 1254.222356432452;
		
		// Texto
		char generoFemenino = 'F';
		char generoMasculino = 'M';
		
		// booleanos o logicos
		boolean isVisible = true;
		boolean funciona = false;
		
		System.out.println(generoFemenino);
		
		//todas estas son distintas
		int $variable = 1;
		int _variable = 2;
		int variable = 3;
		int variable4 = 4;
		// esto no puede ser:
		// int 5variable = 5;
		
		// Constantes
		int VALOR = 0;
		int VALOR_MAXIMO = 2;
		System.out.println(VALOR_MAXIMO);
		
	}

}

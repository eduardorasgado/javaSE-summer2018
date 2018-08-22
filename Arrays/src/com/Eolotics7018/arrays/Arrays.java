package com.Eolotics7018.arrays;

public class Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Let's talk about arrays");
		
		// Arrays
		// Declaracion de arreglos
		int[] arregloInts = new int[3]; //arreglos de tres elementos
				
		double arregloDouble[] = new double[3];
		
		int arrayTwoDim[][] = new int[2][3]; // arreglo de 2 x 3
		
		int array3D[][][] = new int[3][3][2]; // en este arreglo caben 18 elementos
		
		int array4D[][][][] = new int[3][3][3][3]; // 4 dimensiones
		
		// en vez de new va '{}'
		// Este arreglo puede ir creciendo
		char[][] daysArray = {{'M','T', 'W'},{'M','T','W'}};
		
		// ARREGLO DE TRES DIMENSIONES
		char channelArray[][][] = {
									{{'A','B','C'},{'D','E'},{'F'}},
									{{'G','H','I'},{'J','K'},{'L'}},
									{{'N','O','P'},{'Q','R'},{'S'}}
									};
		
		// acceder a C
		System.out.println(channelArray[0][0][2]);
		// cambiando el valor de ese elemento
		channelArray[0][0][2] = 'X';
		System.out.println(channelArray[0][0][2]);
		
		char names[] = new char[3];
		
		names[0] = 'h';
		names[1] = 'e';
		names[2] = 'y';
		
		for (int i = 0; i < names.length; i++) {
			System.out.println(names[i]);
		}
	}

}

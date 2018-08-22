package com.Eolotics7018.controlesdeflujo;

public class ControlesDeFlujo {

	public static void main(String[] args) {
		// Controles de flujo de codigo
		
		// If/else ****************************************************
		int q = 8;
		int p = 5;
		
		if (q > p) {
			// true
			System.out.println("El numero "+q+" es mayor que "+p);
		} else if (q == p) {
			System.out.println("Son iguales");
		} else {
			// false
			System.out.println("El numero "+q+" es menor que "+p);
		}
		
		// switch
		
		int month = 6;
		
		switch (month) {
		case 1:
			System.out.println("El mes es Enero");
			break;
		case 2:
			System.out.println("El mes es Febrero");
			break;
		case 3:
			System.out.println("El mes es Marzo");
			break;
		case 4:
			System.out.println("El mes es Abril");
			break;
		case 5:
			System.out.println("El mes es Mayo");
			break;
		case 6:
			System.out.println("El mes es Junio");
			break;
		case 7:
			System.out.println("El mes es Julio");
			break;
		case 8:
			System.out.println("El mes es Agosto");
			break;
		case 9:
			System.out.println("El mes es Septiembre");
			break;
		case 10:
			System.out.println("El mes es Octubre");
			break;
		case 11:
			System.out.println("El mes es Noviembre");
			break;
		case 12:
			System.out.println("El mes es Diciembre");
			break;

		default:
			System.out.println("Numero invalido, no existe ese mes");
			break;
		}
		
		// While loop ********************************************************************
		
		// While
		System.out.println("CICLO WHILE");
		
		int e = 1;
		while (e <= 5) {
			System.out.println("e es igual o menor a 5, e es: " + e);
			e++;
		}
		System.out.println("Este flujo continua");
		
		// Do while
		// Este flujo se ejecuta al menos una vez
		System.out.println("CICLO DO WHILE");
		
		int k = 0;
		do {
			System.out.println("k es igual o menor a 5, k es: " + k);
			k++;
		} while (k<=5);
		System.out.println("Este flujo continua...2");
		
		// for loop
		System.out.println("CICLO FOR");
		
		 for (int c = 0; c <= 5; c++) {
			 System.out.println("c es igual o menor a 5, k es: " + c);
		 }
		 
		 System.out.println("");
		 int numeros[] = new int[5];
		 
		 // agregando elementos al arreglo
		 for(int i = 0; i < 5; i++) {
			 numeros[i] = 1;
		 }
		 // imprimiendo los datos del arreglo
		 for(int i = 0; i < 5; i++) {
			 System.out.println(numeros[i]);
		 }
	}
}

package com.Eolotics7018.controlesdeflujo;

public class ControlesDeFlujo {

	public static void main(String[] args) {
		// Controles de flujo de codigo
		
		// If/else
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
	}
}

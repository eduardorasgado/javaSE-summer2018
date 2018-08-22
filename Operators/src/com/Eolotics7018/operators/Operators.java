package com.Eolotics7018.operators;

public class Operators {

	public static void main(String[] args) {
		// Operadores aritmeticos **************************
		System.out.println("Operadores Aritméticos");
		int a = 1;
		int aa = a+a;
		// concatenacion
		System.out.println("El valor de sumar "+a+" mas "+a+" es "+aa);
		
		double x = 2.56;
		int y = 9;
		
		// suma
		float w = (float) x + y;
		System.out.println(w);
		System.out.println(w*2);
		
		// division
		double k = 4 / 0.00002;
		System.out.println(k);
		
		//modulo
		System.out.println(7%2);
		
		// operadores de asignacion *****************************
		int f = 2;
		int g = 3;
		f += g;
		System.out.println(f);
		
		int number1 = 4;
		int number2 = 5;
		// tambien podemos usar -= /= %=
		number1 -= number2;
		System.out.println(number1);
		
		// Operadores de incremento y decremento ***************
		
	}

}

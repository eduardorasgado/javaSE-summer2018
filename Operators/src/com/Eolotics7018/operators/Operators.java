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
		// tambien podemos usar -= /= %= *=
		number1 -= number2;
		System.out.println(number1);
		
		// Operadores de incremento y decremento ***************
		
		int l = 3;
		// con ++l primero se incrementa y luego se asigna
		// imprime 4
		System.out.println(++l);
		
		l = 3;
		// con l++ primero se asigna luego se incrementa
		// imprime 3, no alcanza a imprimir el incremento
		System.out.println(l++);
		
		// aqui vemos que ya se imprime el incremento
		System.out.println(l);
		
		// Operadores de equidad
		int q = 5;
		int p = 4;
		// true o false
		System.out.println(q == p);
		System.out.println("q es distinto de p ? "+(q != p));
		
		// Operadores relacionales y logicos ******************
		
		// Operadores relacionales
		System.out.println("q:"+q+" > p:"+p+" -> " + (q > p));
		System.out.println("q:"+q+" < p:"+p+" -> " + (q < p));
		
		int q2 = 5;
		int p2 = 5;
		System.out.println("q2:"+q2+" >= p2:"+p2+" -> " + (q2 >= p2));
		System.out.println("q2:"+q2+" <= p2:"+p2+" -> " + (q2 <= p2));
		
		// Operadores logicos
		boolean n = false;
		boolean m = true;
		// operador and
		System.out.println("n && m ->"+(n && m));
		// operador or
		System.out.println("n || m ->"+(n || m));
		// operador not
		System.out.println("!n ->"+(!n));
		System.out.println("!m ->"+(!m));
	}		

}

package com.eolotics7018.castings;

public class Castings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Again a hello Java :)");
		
		// casteo implicito
		//pasar de byte a short
		byte b = 6;
		short s = b;
		
		// ahora para pasar de un dato de mayor embergadura
		// a uno de menor, debemos de usar un cast
		
		// Esto no es posible entonces castearse asi
		//b = s;
		
		b = (byte) s;
		System.out.println(b);
		
		// Otro ejemplo
		int a = 1;
		double d = 2.5;
		
		// de neuvo esto no se puede
		//a = d;
		
		// casteo
		a = (int) d;
		
		// ojo, puede existir perdida de datos
		// el dato se puede truncar
		System.out.println(a);
		
		// casteos con char
		int codigo = 97;
		// casteando para obtener el codigo ASCII
		char charCode = (char) codigo;
		System.out.println(charCode);
		
		// rangos que sobrepasan los castings
		short number = 256;
		byte numberByte = (byte) number;
		
		// susceptible a perdida de datos
		// TIP: NO castear datos a formatos no soportados
		System.out.println(numberByte);
	}

}
package Ejercicio009;

import java.util.Scanner;

/*
 * Escribir una funci�n que calcule el m�ximo com�n divisor de dos n�meros y otra que 
 * calcule el m�nimo com�n m�ltiplo.
 */

public class Principal {
	
	public static void main (String [] args) {
		
		Scanner entrada = new Scanner (System.in);
		String valor_introducido;
		int numero1, numero2, mcm, mcd;
		System.out.println ("Vamos a calcular el m�ximo com�n divisor (MCD) y el m�nimo c�mun m�ltiplo (MCM)");
		System.out.println ("de dos n�meros enteros positivos mayores de 0");
		System.out.println();
		
		do {
			System.out.println ("Introduce el primer valor: ");
			valor_introducido = entrada.nextLine();
		} while (!valor_introducido.matches("[0-9]+"));
		numero1 = Integer.parseInt(valor_introducido);
		do {
			System.out.println ("Introduce el segundo valor: ");
			valor_introducido = entrada.nextLine();
		} while (!valor_introducido.matches("[0-9]+"));
		numero2 = Integer.parseInt(valor_introducido);
		
		if ((numero1 < 1) || (numero2 < 1)) {
			System.out.println ("Alguno de los valores introducidos es igual a 0");
		}
		else {
			
			Calculo operacion = new Calculo (numero1, numero2);
			mcm = operacion.minimoComunMultiplo();
			mcd = operacion.maximoComunDivisor();
			
			System.out.println ("El m�ximo com�n divisor (MCD) de los n�meros "+numero1+" y "+numero2+" es: "+mcd);
			System.out.println ("El m�nimo com�n m�ltiplo (MCM) de los n�meros "+numero1+" y "+numero2+" es: "+mcm);
		}
		entrada.close();
	}
	
	

}

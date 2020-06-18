package Ejercicio009;

import java.util.Scanner;

/*
 * Escribir una función que calcule el máximo común divisor de dos números y otra que 
 * calcule el mínimo común múltiplo.
 */

public class Principal {
	
	public static void main (String [] args) {
		
		Scanner entrada = new Scanner (System.in);
		String valor_introducido;
		int numero1, numero2, mcm, mcd;
		System.out.println ("Vamos a calcular el máximo común divisor (MCD) y el mínimo cómun múltiplo (MCM)");
		System.out.println ("de dos números enteros positivos mayores de 0");
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
			
			System.out.println ("El máximo común divisor (MCD) de los números "+numero1+" y "+numero2+" es: "+mcd);
			System.out.println ("El mínimo común múltiplo (MCM) de los números "+numero1+" y "+numero2+" es: "+mcm);
		}
		entrada.close();
	}
	
	

}

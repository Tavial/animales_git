package Ejercicio003;

/*
 * Escribir una función que reciba un número entero positivo y devuelva su factorial.
 */

import java.util.Scanner;

public class Principal {
	
	public static void main (String[] args) {
		
		Scanner entrada = new Scanner (System.in);
		String cadena;
		int numero, factorial=0;
		do {
			System.out.println ("Introduce un número entero positivo: ");
			cadena = entrada.nextLine();		
		} while (!cadena.matches("[0-9]+"));
		numero = Integer.parseInt(cadena);
		if (numero>0) {
			Calculo calculo = new Calculo (numero);
			factorial = calculo.factorial();
			System.out.println ("El factorial del número "+numero+" es: "+factorial);
		}
		else {
			System.out.println ("El número introducido tiene que ser positivo mayor que 0");
		}
		entrada.close();
		
	}

}

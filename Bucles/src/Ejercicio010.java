/* Escribir un programa que pida al usuario un número entero y muestre por pantalla si es un 
 * número primo o no.
 */

import java.util.Scanner;

public class Ejercicio010 {
	
	public static void main (String[] args) {
		Scanner entrada = new Scanner (System.in);
		String cadena;
		int numero, divisores = 0; 
		System.out.println ("Introduce un número entero mayor que cero: ");
		cadena = entrada.nextLine();
		if (cadena.matches("[0-9]+")) {
			numero = Integer.parseInt(cadena); 
			if (numero > 0) {
				for (int i=1; i<=numero; i++) {
					if (numero % i == 0) {
						divisores++;
					}
				} //for
				if (divisores <= 2) { //solo es divisible por si mismo y la unidad, por tanto es primo
					System.out.println ("El número "+numero+" introducido es primo. ");
				} // if
				else { // tiene más de dos divisores. No es primo
					System.out.println ("El número "+numero+" introducido NO es primo. ");
				} // else
				
			} //if
			else {
				System.out.println ("El número tiene que ser mayor que 0");
			} //else
		} //if 
		else {
			System.out.println ("El valor del número introducido no está en un rango válido");
		} //else
		entrada.close();
	} // main

} //class

/*
 * Escribir un programa que pida al usuario un número entero y muestre por pantalla un 
 * triángulo rectángulo como el de más abajo, de altura el número introducido.
 */

import java.util.Scanner;

public class Ejercicio006 {
	
	public static void main (String[] args) {
		String cadena;
		int numero;
		Scanner entrada = new Scanner (System.in);
		System.out.println ("Introduce un número entero mayor que 0: ");
		cadena = entrada.nextLine();
		if (cadena.matches("[0-9]+")) {
			numero = Integer.parseInt(cadena);
			System.out.println();
			if (numero > 0) {
				for (int i=1; i<=numero; i++) {
				
					for (int j=1; j<=i; j++) {
						System.out.print("*");
					}
					System.out.println();
				}
			}
			else {
				System.out.println ("El valor introducido tiene que ser mayor que 0");
			}
		}
		else {
			System.out.println ("El valor introducido no está en el rango de enteros correcto");
		}
		entrada.close();
	} //main

} //class

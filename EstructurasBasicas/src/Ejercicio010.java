/*
 * Escribir un programa que pida al usuario dos números enteros y muestre por pantalla <n> entre <m> 
 * da un cociente <c> y un resto <r> donde <n> y <m> son los números introducidos por el usuario, y <c> 
 * y <r> son el cociente y el resto de la división entera respectivamente.
 */

import java.util.Scanner;

public class Ejercicio010 {
	
	public static void main (String[] args) {
		// instancio un objeto entrada de la clase Scanner para poder trabajar con el fichero de entrada System.in
		Scanner entrada = new Scanner(System.in);
		int dividendo, divisor, cociente, resto;
		System.out.println ("Introduce el valor del dividendo (valor entero): ");
		dividendo = entrada.nextInt();
		System.out.println ("Introduce el valor del divisor (valor entero): ");
		divisor = entrada.nextInt();
		cociente = dividendo / divisor;
		resto = dividendo % divisor;
		System.out.println();
		System.out.println ("El cociente de dividir "+dividendo+" entre "+divisor+" es: "+cociente);
		System.out.println ("El resto de dividir "+dividendo+" entre "+divisor+" es: "+resto);
		entrada.close();
	}

}

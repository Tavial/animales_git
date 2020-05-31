/* Escribir un programa que lea un entero positivo, n, introducido por el usuario y después muestre en 
 * pantalla la suma de todos los enteros desde 1 hasta n. La suma de los n primeros enteros positivos 
 * puede ser calculada de la siguiente forma: suma=n*(n+1) / 2
 */

import java.util.Scanner;

public class Ejercicio008 {
	public static void main (String[] args) {
		Scanner entrada = new Scanner (System.in);
		int n, suma;
		System.out.println("Introduce un entero positivo: ");
		n = entrada.nextInt();
		suma = (n * (n+1)) / 2;
		System.out.println ("La suma de todos los enteros desde 1 hasta "+n+" es igual a: "+suma);
		entrada.close();
	}
}

import java.util.Scanner;

/* Escribir un programa que pida al usuario un número entero y muestre por pantalla si es par o 
 * impar.
 */
public class Ejercicio004 {
	
	public static void main (String[] args) {
		Scanner entrada = new Scanner (System.in);
		int numero;
		System.out.println ("Introduzca un número entero: ");
		numero = entrada.nextInt();
		if (numero % 2 == 0) {
			System.out.println ("El número "+numero+" introducido es par.");
		} //if
		else {
			System.out.println ("El número "+numero+" introducido es impar");
		} //else
		entrada.close();
	} //main
	
} //class

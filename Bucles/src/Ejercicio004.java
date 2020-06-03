/*   
 * Escribir un programa que pida al usuario un número entero positivo y muestre por pantalla 
 * la cuenta atrás desde ese número hasta cero separados por comas.
 */

import java.util.Scanner;

public class Ejercicio004 {

	public static void main (String[] args) {
		
		Scanner entrada = new Scanner (System.in);
		String dato;
		int numero;
		System.out.println ("Introduce un número entero positivo: ");
		dato = entrada.nextLine();
		if (dato.matches("[0-9]+")) {
			numero = Integer.parseInt(dato);
			for (int i=numero; i>=0; i--){
				if (i==0) {
					System.out.print (" "+i);
				}
				else {
					System.out.print(" "+i+",");
				}
				
			} // for
		} //if
		else {
			System.out.println ("El valor introducido no está en el rango de enteros correcto");
		}
		entrada.close();
	} // main
} // class

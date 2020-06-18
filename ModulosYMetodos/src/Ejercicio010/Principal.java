package Ejercicio010;

import java.util.Scanner;

/*
 * Escribir una función que convierta un número decimal en binario y otra que convierta un 
 * número binario en decimal.
 */

public class Principal {
	public static void main (String [] args) {
		Scanner entrada = new Scanner (System.in);
		String opcion, numero_introducido, numero_binario;
		int numero_decimal; 
		double resultado_decimal;
		do {
			System.out.println (" *************");
			System.out.println (" * CONVERSOR *");
			System.out.println (" *************");
			System.out.println ();
			System.out.println ("1. Convertir de decimal a binario ");
			System.out.println ("2. Convertir de binario a decimal ");
			System.out.println ("3. Salir ");
			System.out.println ();
			System.out.println (" Introduce opción: ");
			do {
				opcion = entrada.nextLine();
			} while (!opcion.matches("[1-3]"));
			System.out.println();
			switch (opcion) {
				case "1": // Convertir de decimal a binario
						  System.out.println ("Introduce un número entero positivo mayor que cero: ");
						  do {
							  numero_introducido = entrada.nextLine();
						  } while (!numero_introducido.matches("[0-9]+"));
						  numero_decimal = Integer.parseInt(numero_introducido);
						  Conversor conversorDecimal = new Conversor (numero_decimal);
						  numero_binario = conversorDecimal.deDecimalABinario();
						  System.out.println ();
						  System.out.println ("El resultado en binario del número decimal "+numero_decimal+" es: "+numero_binario);
						  break;
				case "2": // Convertir de binario a decimal
						  System.out.println ("Introduce un número binario: ");
						  do {
							  numero_binario = entrada.nextLine();
						  } while (!numero_binario.matches("[0-1]+"));
						  Conversor conversorBinario = new Conversor (numero_binario);
						  resultado_decimal = conversorBinario.deBinarioADecimal();
						  System.out.println ();
						  System.out.println ("El resultado en decimal del número binario "+numero_binario+" es: "+Math.round(resultado_decimal));
						  
						  break;
				case "3": // Salir
						  System.out.println ("Muchas gracias por utilizar nuestra aplicación. Hasta la próxima");
						  break;
			} // switch
			
			
		} while (!opcion.equals("3"));
		entrada.close();
	}
}

package Ejercicio002;

import java.util.Scanner;

/* Simular una calculadora científica que permita calcular el seno, coseno, tangente, exponencial y 
 * logaritmo neperiano. Se preguntará al usuario el valor y la función a aplicar, y mostrará por 
 * pantalla una tabla con los enteros de 1 al valor introducido y el resultado de aplicar la función 
 * a esos enteros.
 */

public class Principal {
	
	public static void main (String[] args) {
		String opcion, numero_introducido;
		Calculadora calculadora;
		Scanner entrada = new Scanner (System.in);
		int numero=6;
		
		do {
			
			System.out.println (" Mi pequeña calculadora ");
			System.out.println (" ---------------------- ");
			System.out.println ();
			System.out.println (" 1. Función seno ");
			System.out.println (" 2. Función coseno ");
			System.out.println (" 3. Función tangente ");
			System.out.println (" 4. Función exponencial ");
			System.out.println (" 5. Función logaritmo neperiano ");
			System.out.println (" 6. Salir ");
			
			System.out.println ();
			System.out.println (" Elige opción: ");
	        do {
	        	opcion = entrada.nextLine();
	        } while (!opcion.matches("[1-6]"));
	        
	        if (!opcion.equals("6")) {
	        	System.out.println ("Introduce un número entero positivo mayor que 0: ");
	        	do {
	        		numero_introducido = entrada.nextLine(); 
	        	} while (!numero_introducido.matches("[0-9]+"));
	        	numero = Integer.parseInt(numero_introducido);
	        }      	
	        calculadora = new Calculadora (numero);
	        switch (opcion) {
	        
	        	case "1": 
	        		calculadora.CalculoSeno();
	        		break;
	        	case "2": 
	        		calculadora.CalculoCoseno();
	        		break;
	        	case "3": 
	        		calculadora.CalculoTangente();
	        		break;
	        	case "4": 
	        		calculadora.CalculoExponencial();
	        		break;	
	        	case "5": 
	        		calculadora.CalculoNeperiano();
	        		break;
	        	case "6": 
	        		System.out.println ("Muchas gracias por utilizar mi pequeña calculadora. Hasta la vista");
	        		break;
	        	
	        }
			
		} while (!opcion.equals("6"));
		entrada.close();
	}
	
	
	

}

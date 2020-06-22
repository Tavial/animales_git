package Ejercicio002;

import java.util.Scanner;

/* Simular una calculadora cient�fica que permita calcular el seno, coseno, tangente, exponencial y 
 * logaritmo neperiano. Se preguntar� al usuario el valor y la funci�n a aplicar, y mostrar� por 
 * pantalla una tabla con los enteros de 1 al valor introducido y el resultado de aplicar la funci�n 
 * a esos enteros.
 */

public class Principal {
	
	public static void main (String[] args) {
		String opcion, numero_introducido;
		Calculadora calculadora;
		Scanner entrada = new Scanner (System.in);
		int numero=6;
		
		do {
			
			System.out.println (" Mi peque�a calculadora ");
			System.out.println (" ---------------------- ");
			System.out.println ();
			System.out.println (" 1. Funci�n seno ");
			System.out.println (" 2. Funci�n coseno ");
			System.out.println (" 3. Funci�n tangente ");
			System.out.println (" 4. Funci�n exponencial ");
			System.out.println (" 5. Funci�n logaritmo neperiano ");
			System.out.println (" 6. Salir ");
			
			System.out.println ();
			System.out.println (" Elige opci�n: ");
	        do {
	        	opcion = entrada.nextLine();
	        } while (!opcion.matches("[1-6]"));
	        
	        if (!opcion.equals("6")) {
	        	System.out.println ("Introduce un n�mero entero positivo mayor que 0: ");
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
	        		System.out.println ("Muchas gracias por utilizar mi peque�a calculadora. Hasta la vista");
	        		break;
	        	
	        }
			
		} while (!opcion.equals("6"));
		entrada.close();
	}
	
	
	

}

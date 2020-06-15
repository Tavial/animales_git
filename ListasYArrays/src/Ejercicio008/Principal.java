package Ejercicio008;

import javax.swing.JOptionPane;

/* 
 * Escribir un programa que pida al usuario una palabra y muestre por pantalla si es un 
 * pal�ndromo.
 */

public class Principal {
	
	public static void main (String[] args){
	
		String palabra ="", al_reves="";

		palabra = JOptionPane.showInputDialog("Introduce una palabra, te diremos si es pal�ndroma o no: ");
	
		for (int i=palabra.length()-1; i>=0; i--) {
			al_reves=al_reves+palabra.charAt(i);
		}
	
		if (palabra.equalsIgnoreCase(al_reves)) {
			System.out.println("La palabra "+palabra+" es pal�ndroma. Se lee igual en un sentido que en el otro.");
		} else {
			System.out.println("La palabra "+palabra+" NO es pal�ndroma");
		}

	} // main 
} // class

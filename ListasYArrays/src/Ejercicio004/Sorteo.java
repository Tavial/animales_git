/*
 * Escribir un programa que pregunte al usuario los n�meros ganadores de la loter�a primitiva, 
   los almacene en una lista y los muestre por pantalla ordenados de menor a mayor.
 */

package Ejercicio004;

import java.util.SortedSet;
import java.util.TreeSet;

import javax.swing.JOptionPane;

public class Sorteo {
	
	public static void main (String [] args) {
		String entrada;
		int numero;
		SortedSet <Integer> combinacion =new TreeSet<Integer> ();
		for (int i=1; i<=6; i++) {
			do {
				entrada = JOptionPane.showInputDialog("Introduce el n�mero "+i+" del boleto:");
			}
			while (!entrada.matches("[0-9]+"));
			numero = Integer.parseInt(entrada);	
			combinacion.add(numero);
		}

		
		for (int n:combinacion) {
			System.out.print(n+" ");
		}

	} // main

} // class

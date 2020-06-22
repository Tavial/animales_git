package Ejercicio003;

/* Escribir una función que reciba una frase y devuelva un diccionario con las palabras 
 * que contiene y su longitud.
 */

import javax.swing.JOptionPane;

public class Principal {
	public static void main (String [] args) {
		String frase;
		do {
			frase = JOptionPane.showInputDialog("Introduce una frase:");
		}
		while (frase.isEmpty());
		int longitud_frase;
		String[] cadena;
		frase = frase.replace(".", "");
		frase = frase.replace(",", "");
		frase = frase.replace(":", "");
		frase = frase.replace(";", "");
		frase = frase.toLowerCase();
		cadena = frase.split(" ");
		longitud_frase = cadena.length;
		if (longitud_frase >0) {
			Diccionario diccionario = new Diccionario (cadena[0]);
			for (int i=1; i<longitud_frase; i++) {
				diccionario.agregarPalabra(cadena[i], diccionario);
			}
			
			diccionario.mostrarDiccionario(diccionario);
		}
		else {
			System.out.println ("La frase no tiene ninguna palabra");
		}
	
	}
}

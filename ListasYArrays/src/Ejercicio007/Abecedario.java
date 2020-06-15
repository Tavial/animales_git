package Ejercicio007;

import java.util.LinkedList;
import java.util.ListIterator;

public class Abecedario {
	
	public static void main (String [] args) {
		
		LinkedList <Character> lista_letras = new LinkedList <Character>();
		
		lista_letras.add('A'); lista_letras.add('B'); lista_letras.add('C');
		lista_letras.add('D'); lista_letras.add('E'); lista_letras.add('F');
		lista_letras.add('G'); lista_letras.add('H'); lista_letras.add('I');
		lista_letras.add('J'); lista_letras.add('K'); lista_letras.add('L');
		lista_letras.add('M'); lista_letras.add('N'); lista_letras.add('Ñ');
		lista_letras.add('O'); lista_letras.add('P'); lista_letras.add('Q');
		lista_letras.add('R'); lista_letras.add('S'); lista_letras.add('T');
		lista_letras.add('U'); lista_letras.add('V'); lista_letras.add('W');
		lista_letras.add('X'); lista_letras.add('Y'); lista_letras.add('Z');
		
		System.out.println(lista_letras);
		
		ListIterator <Character> puntero = lista_letras.listIterator();
		
		while (puntero.hasNext()) {
			
			puntero.next();
			if (puntero.hasNext()) {
				puntero.next();
				if (puntero.hasNext()) {
					puntero.next();
					puntero.remove();
				}
			}
		}
	
		System.out.println();
		System.out.println(lista_letras);
		
	} // main

} // class

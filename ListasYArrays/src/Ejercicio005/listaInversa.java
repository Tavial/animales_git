package Ejercicio005;

import java.util.LinkedList;
import java.util.ListIterator;

public class listaInversa {

	public static void main (String[] args) {
		
		LinkedList <Integer> numeros = new LinkedList <Integer>();
		int n_elementos;
		
		for (int i=1; i<=10; i++) {
			numeros.add(i);
		} // for
		System.out.println (numeros);
		
		n_elementos = numeros.size();
		
		ListIterator <Integer> puntero = numeros.listIterator(n_elementos);
		
		while (puntero.hasPrevious()) {
			System.out.print(puntero.previous()+", ");
		} // while
	} // main
	
} // class

package Ejercicio010;

import java.util.Collections;
import java.util.LinkedList;

public class Precios {

	public static void main (String[] args) {
	
		
		LinkedList <Integer> lista_precios = new LinkedList<Integer>();
		
		lista_precios.add(50);
		lista_precios.add(75);
		lista_precios.add(46);
		lista_precios.add(22);
		lista_precios.add(80);
		lista_precios.add(65);
		lista_precios.add(8);
		
		System.out.println(lista_precios);

		Collections.sort(lista_precios);
		System.out.println(lista_precios);
		
	} //main
	
} //class

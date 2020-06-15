package Ejercicio006;

/* 
 * Escribir un programa que almacene las asignaturas de un curso (por ejemplo 
 * Matemáticas, Física, Química, Historia y Lengua) en una lista, pregunte al usuario 
 * la nota que ha sacado en cada asignatura y elimine de la lista las asignaturas 
 * aprobadas. Al final el programa debe mostrar por pantalla las asignaturas que el
 * usuario tiene que repetir.
 */

import java.util.LinkedList;
import java.util.Scanner;

public class Suspensas {
	
	public static void main (String[] args) {
		
		LinkedList<Asignatura> lista_asignaturas = new LinkedList<Asignatura>();
		
		Asignatura asignatura1 = new Asignatura ("Matemáticas",0.0);
		Asignatura asignatura2 = new Asignatura ("Física",0.0);
		Asignatura asignatura3 = new Asignatura ("Química",0.0);
		Asignatura asignatura4 = new Asignatura ("Historia",0.0);
		Asignatura asignatura5 = new Asignatura ("Lengua",0.0);
		
		lista_asignaturas.add(asignatura1);
		lista_asignaturas.add(asignatura2);
		lista_asignaturas.add(asignatura3);
		lista_asignaturas.add(asignatura4);
		lista_asignaturas.add(asignatura5);
		
		Scanner entrada = new Scanner (System.in);
		String nota_introducida; 
		double nota;
		for (Asignatura asignatura:lista_asignaturas) {
			do {
				System.out.println ("Introduce la nota que has sacado en "+asignatura.mostrarMateria()+": ");
				nota_introducida = entrada.nextLine(); 
			} while (!nota_introducida.matches("\\d+((\\.)\\d+)?"));	
			nota = Double.parseDouble(nota_introducida);
			asignatura.registrarNota(nota);
		}
		
		System.out.println ();
		System.out.println ("Las asignaturas que tienes suspensas son: ");
		
		for (Asignatura asignatura:lista_asignaturas) {
			
			if (asignatura.mostrarNota() < 5.0) {
				System.out.print(asignatura.mostrarMateria()+" ");
				System.out.print(asignatura.mostrarNota());
				System.out.println();		
			} //if	
		} //for
		entrada.close();
			
	} // main
	
} // class

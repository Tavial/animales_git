/*
 * Escribir un programa que almacene las asignaturas de un curso (por ejemplo Matemáticas, Física, 
 * Química, Historia y Lengua) en una lista y la muestre por pantalla.
 */

package Ejercicio001;

import java.util.HashSet;
import java.util.Set;

public class principal {
	
	public static void main (String[] args) {
		
		Asignatura asignatura1 = new Asignatura ("Matemáticas");
		Asignatura asignatura2 = new Asignatura ("Física");
		Asignatura asignatura3 = new Asignatura ("Química");
		Asignatura asignatura4 = new Asignatura ("Historia");
		Asignatura asignatura5 = new Asignatura ("Lengua");
		
	
		Set<Asignatura> asignaturas = new HashSet<Asignatura>(); // Creamos una colección Set de tipo HashSet
		// es un conjunto no ordenado y que no permite duplicidad.
		
		// añadimos cada objeto (asignatura) a la colección
		asignaturas.add(asignatura1);
		asignaturas.add(asignatura2);
		asignaturas.add(asignatura3);
		asignaturas.add(asignatura4);
		asignaturas.add(asignatura5);
		
		for (Asignatura asignatura:asignaturas) { //recorremos cada objeto asignatura de la clase Asignatura que está en la colección asignaturas
			
			System.out.println(asignatura.nombreAsignatura());
					
		}
				
	} //main

} // class

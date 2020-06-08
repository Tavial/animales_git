/*
 * Escribir un programa que almacene las asignaturas de un curso (por ejemplo Matemáticas, Física, 
 * Química, Historia y Lengua) en una lista y la muestre por pantalla el mensaje Yo estudio 
 * <asignatura>, donde <asignatura> es cada una de las asignaturas de la lista.
 */
package Ejercicio002;

import java.util.HashSet;
import java.util.Set;

public class principal {

		public static void main (String [] args) {
			
			Asignatura asignatura1 = new Asignatura ("Matemáticas");
			Asignatura asignatura2 = new Asignatura ("Física");
			Asignatura asignatura3 = new Asignatura ("Química");
			Asignatura asignatura4 = new Asignatura ("Historia");
			Asignatura asignatura5 = new Asignatura ("Lengua");
			
			//Creamos una colección
			
			Set <Asignatura> asignaturas = new HashSet <Asignatura>();
			
			asignaturas.add(asignatura1);
			asignaturas.add(asignatura2);
			asignaturas.add(asignatura3);
			asignaturas.add(asignatura4);
			asignaturas.add(asignatura5);
			
			for (Asignatura asignatura: asignaturas) {
				System.out.println(asignatura.nombreAsignatura());
			}
				
		}
	
}

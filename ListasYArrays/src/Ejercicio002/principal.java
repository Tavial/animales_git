/*
 * Escribir un programa que almacene las asignaturas de un curso (por ejemplo Matem�ticas, F�sica, 
 * Qu�mica, Historia y Lengua) en una lista y la muestre por pantalla el mensaje Yo estudio 
 * <asignatura>, donde <asignatura> es cada una de las asignaturas de la lista.
 */
package Ejercicio002;

import java.util.HashSet;
import java.util.Set;

public class principal {

		public static void main (String [] args) {
			
			Asignatura asignatura1 = new Asignatura ("Matem�ticas");
			Asignatura asignatura2 = new Asignatura ("F�sica");
			Asignatura asignatura3 = new Asignatura ("Qu�mica");
			Asignatura asignatura4 = new Asignatura ("Historia");
			Asignatura asignatura5 = new Asignatura ("Lengua");
			
			//Creamos una colecci�n
			
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

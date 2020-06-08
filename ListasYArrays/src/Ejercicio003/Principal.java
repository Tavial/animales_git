/*
 * Escribir un programa que almacene las asignaturas de un curso (por ejemplo Matemáticas, Física, 
 * Química, Historia y Lengua) en una lista, pregunte al usuario la nota que ha sacado en cada 
 * asignatura, y después las muestre por pantalla con el mensaje En <asignatura> has sacado <nota> 
 * donde <asignatura> es cada una des las asignaturas de la lista y <nota> cada una de las 
 * correspondientes notas introducidas por el usuario.
 */

package Ejercicio003;

import java.util.HashSet;
import java.util.Set;

import javax.swing.JOptionPane;

public class Principal {
	
	public static void main (String[] args) {
		
		Asignatura asignatura1 = new Asignatura ("Matemáticas",0.0);
		Asignatura asignatura2 = new Asignatura ("Física",0.0);
		Asignatura asignatura3 = new Asignatura ("Química",0.0);
		Asignatura asignatura4 = new Asignatura ("Historia",0.0);
		Asignatura asignatura5 = new Asignatura ("Lengua",0.0);
		
		Set<Asignatura> asignaturas = new HashSet <Asignatura>();
		
		asignaturas.add(asignatura1);
		asignaturas.add(asignatura2);
		asignaturas.add(asignatura3);
		asignaturas.add(asignatura4);
		asignaturas.add(asignatura5);
		
		String entrada;
		double nota;
		
		for (Asignatura asignatura: asignaturas) {
			do { 
				entrada = JOptionPane.showInputDialog("Introduce la nota que has sacado en "+asignatura.verNombre()+" :");
			}
			while (!entrada.matches("\\d+((\\.)\\d+)?"));
			nota = Double.parseDouble(entrada);
			asignatura.establecerNota(nota);
		}
		
		for (Asignatura materia: asignaturas) {
			System.out.println(materia.verDatos());		
		}	
		
	} //main

} // class

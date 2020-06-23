package Ejercicio007;

/* Escribir una función que calcule el módulo de un vector. */

public class Principal {
	
	public static void main (String[] args) {
		Vector vector = new Vector (-3,2);
		System.out.println ("El módulo del vector ("+vector.mostrarComponenteX()+","+vector.mostrarComponenteY()+") es "+vector.moduloVector());
	}
	
}

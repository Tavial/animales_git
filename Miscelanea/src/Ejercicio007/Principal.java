package Ejercicio007;

/* Escribir una funci�n que calcule el m�dulo de un vector. */

public class Principal {
	
	public static void main (String[] args) {
		Vector vector = new Vector (-3,2);
		System.out.println ("El m�dulo del vector ("+vector.mostrarComponenteX()+","+vector.mostrarComponenteY()+") es "+vector.moduloVector());
	}
	
}

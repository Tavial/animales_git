package Ejercicio012;

/*
 * Escribir un programa que almacene los vectores (1,2,3) y (-1,0,2) en dos listas y 
 * muestre por pantalla su producto escalar.
 */

public class Principal {

	public static void main (String[] args) {
		int producto_escalar;
		Nodo vector1 = new Nodo (1);
		vector1 = vector1.nuevoElemento(vector1, 2);
		vector1 = vector1.nuevoElemento(vector1, 3);
		
		Nodo vector2 = new Nodo (-1);
		vector2 = vector2.nuevoElemento(vector2, 0);
		vector2 = vector2.nuevoElemento(vector2, 2);
		
		System.out.println("Vector 1: ");
		vector1.mostrarLista(vector1);
		System.out.println();
		System.out.println("Vector 2: ");
		vector2.mostrarLista(vector2);
		System.out.println();
		producto_escalar = vector1.productoEscalar(vector1, vector2);
		System.out.println ("El producto escalar de los dos vectores es: "+producto_escalar);
		
	}
}

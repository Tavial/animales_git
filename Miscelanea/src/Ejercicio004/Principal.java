package Ejercicio004;

/* Escribir una función que reciba una lista de notas y devuelva la lista de calificaciones 
 * correspondientes a esas notas.
 */

public class Principal {
	public static void main (String [] args) {
		
		ListaEnlazada listaNotas = new ListaEnlazada (1.6);
		listaNotas.agregarNota(2.6, listaNotas);
		listaNotas.agregarNota(3.6, listaNotas);
		listaNotas.agregarNota(4.6, listaNotas);
		listaNotas.agregarNota(5.6, listaNotas);
		listaNotas.agregarNota(6.6, listaNotas);
		listaNotas.agregarNota(7.6, listaNotas);
		listaNotas.agregarNota(8.6, listaNotas);
		listaNotas.agregarNota(9.6, listaNotas);
		listaNotas.agregarNota(10, listaNotas);
		listaNotas.agregarNota(-1.6, listaNotas);
		listaNotas.agregarNota(10.6, listaNotas);
		
		listaNotas.mostarListaNotas(listaNotas);
		
	}
}

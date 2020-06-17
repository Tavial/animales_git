package Ejercicio008;

/*
 * Escribir una funci�n que reciba una muestra de n�meros en una lista y devuelva
 * su media, varianza y desviaci�n t�pica.
 */

public class Principal {

	public static void main (String [] args) {
		double [] diccionario = new double [3];
		ListaEnlazada lista = new ListaEnlazada (12);
		lista.agregarElemento(lista, 6);
		lista.agregarElemento(lista, 7);
		lista.agregarElemento(lista, 3);
		lista.agregarElemento(lista, 15);
		lista.agregarElemento(lista, 10);
		lista.agregarElemento(lista, 18);
		lista.agregarElemento(lista, 5);
		
		lista.imprimirLista(lista);
		System.out.println();
		diccionario = lista.operacionesLista(lista);
		System.out.println ("Los valores de la media, varianza y desviaci�n t�pica son: ");
		for (double elemento: diccionario) {
			System.out.print(elemento+", ");
		}
		
	}
}

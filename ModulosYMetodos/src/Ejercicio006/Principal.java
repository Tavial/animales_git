package Ejercicio006;

/*
 * Escribir una funci�n que reciba una muestra de n�meros en una lista y devuelva su media.
 */

public class Principal {

	public static void main (String[] args) {
		double media;
		ListaEnlazada lista = new ListaEnlazada(8);
		lista.AgregarElemento(9, lista);
		lista.AgregarElemento(10, lista);
		lista.AgregarElemento(11, lista);
		lista.AgregarElemento(16, lista);
		lista.AgregarElemento(17, lista);
		lista.AgregarElemento(6, lista);
		media = lista.mediaAritmetica(lista);
		System.out.print ("La media aritm�tica de la lista de n�meros [");
		lista.imprimirLista(lista);
		System.out.print ("] es: "+media);
		
		
	} // main
	
} // principal

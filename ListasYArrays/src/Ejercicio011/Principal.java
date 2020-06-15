package Ejercicio011;

/*
 * Escribir un programa que almacene en una lista los siguientes precios, 50, 75, 46, 
 * 22, 80, 65, 8, y muestre por pantalla el menor y el mayor de los precios.
 */

public class Principal {
	public static void main (String[] args){
		
		Nodo lista = new Nodo(50); 
		lista = lista.nuevoElemento(75, lista);
		lista = lista.nuevoElemento(46, lista);
		lista = lista.nuevoElemento(22, lista);
		lista = lista.nuevoElemento(80, lista);
		lista = lista.nuevoElemento(65, lista);
		lista = lista.nuevoElemento(8, lista);
		lista.mostrarLista(lista);
		System.out.println ();
		lista = lista.ordenarLista(lista);
		lista.mostrarLista(lista);
	
	}
}

package Ejercicio007;

/*
 * Escribir una funci�n que reciba una muestra de n�meros en una lista y devuelva otra 
 * lista con sus cuadrados.
 */
public class Principal {
	
	public static void main (String[] args) {
		
		ListaEnlazada lista = new ListaEnlazada (8);
		ListaEnlazada lista_cuadrados;
		lista.agregarElemento(9, lista);
		lista.agregarElemento(10, lista);
		lista.agregarElemento(11, lista);
		lista.agregarElemento(16, lista);
		lista.agregarElemento(17, lista);
		lista.agregarElemento(6, lista);
		lista.imprimirLista(lista);
		lista_cuadrados = lista.calculoCuadrados(lista);
		System.out.println ();
		lista.imprimirLista(lista_cuadrados);
		
	}

}

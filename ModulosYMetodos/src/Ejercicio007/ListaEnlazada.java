package Ejercicio007;

public class ListaEnlazada {
	
	private double info;
	private ListaEnlazada sig;
	
	public ListaEnlazada (double valor) {
		this.info = valor;
		this.sig = null;
	}
	
	public void agregarElemento (double valor, ListaEnlazada lista) {
		if (lista == null ) {
			ListaEnlazada nodo = new ListaEnlazada (valor);
			lista = nodo;
		}
		else {
			while (lista.sig != null) {
				lista = lista.sig;
			}
			ListaEnlazada nodo = new ListaEnlazada (valor);
			lista.sig = nodo;
		}
	}
	
	public void imprimirLista (ListaEnlazada lista) {
		while (lista != null) {
			System.out.print (lista.info+", ");
			lista = lista.sig;
		}
	}
	
	public ListaEnlazada calculoCuadrados (ListaEnlazada lista) {
		ListaEnlazada lista_cuadrados;
		double cuadrado=0;
		if (lista != null) {
			cuadrado = Math.pow(lista.info,2);
			lista_cuadrados = new ListaEnlazada (cuadrado);
			lista = lista.sig;
		}
		else {
			lista_cuadrados = new ListaEnlazada (0);
		}
		while (lista != null) {
			cuadrado = Math.pow(lista.info,2);
			lista_cuadrados.agregarElemento(cuadrado, lista_cuadrados);
			lista = lista.sig;
		}
		return lista_cuadrados;
	}

}

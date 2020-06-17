package Ejercicio006;

public class ListaEnlazada {
	
	// Propiedades
	
	private double info;
	private ListaEnlazada sig;
	
	// Constructor
	public ListaEnlazada (double valor) {
		this.info = valor;
		this.sig = null;
	}
	
	// Métodos
	
	public void AgregarElemento (double valor, ListaEnlazada lista) {
		if (lista == null) {
			ListaEnlazada nodo = new ListaEnlazada(valor);
			lista = nodo;
		}
		else {
			while (lista.sig != null) {
				lista = lista.sig;
			}
			ListaEnlazada nodo = new ListaEnlazada(valor);
			lista.sig = nodo;
		}
	}
	
	public int numeroElementos (ListaEnlazada lista)
	{
		int n_elementos=0;
		while (lista != null) {
			n_elementos++;
			lista = lista.sig;
		}
		return n_elementos;
	}
	public double mediaAritmetica (ListaEnlazada lista) {
		int n_elementos;
		double media = 0;
		n_elementos = this.numeroElementos(lista);
		while (lista != null) {
			media += lista.info;
			lista = lista.sig;
		}
		media = media / n_elementos;
		return media;
	}
	
	public void imprimirLista (ListaEnlazada lista) {
		while (lista != null) {
			System.out.print(lista.info+", ");
			lista = lista.sig;
		}
	}
	
	

}

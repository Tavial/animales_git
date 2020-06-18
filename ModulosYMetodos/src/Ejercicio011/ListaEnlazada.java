package Ejercicio011;

public class ListaEnlazada {
	
	private String palabra;
	private int frecuencia;
	private ListaEnlazada sig; 
	
	public ListaEnlazada (String palabra) {
		this.palabra = palabra;
		this.frecuencia = 1;
		this.sig = null;
	}
	
	public void nuevoElemento (String palabra, ListaEnlazada lista) {
		boolean encontrado = false;
		if (lista == null) {
			ListaEnlazada nodo = new ListaEnlazada (palabra);
			lista = nodo;
		}
		else {
			while (lista.sig != null && !encontrado) {
				if (palabra.equalsIgnoreCase(lista.palabra)) { //hay un elemento igual. No lo inserta pero le suna uno a la frecuencia
					encontrado = true;
					lista.frecuencia++;
				}
				lista = lista.sig;
			}
			if (!encontrado) {
				ListaEnlazada nodo = new ListaEnlazada (palabra);
				lista.sig = nodo;
			}
		}
	}
	
	public String[] masRepetida (ListaEnlazada lista) {
		String [] mas_repetida = new String [2];
		int mayor_frecuencia = 0;
		if (lista == null) {
			mas_repetida [0] =" No hay palabras en el diccionario";
			mas_repetida [1] = "0";
		}
		else {
			while (lista != null) {
				if (lista.frecuencia > mayor_frecuencia) {
					mas_repetida [0] = lista.palabra;
					mas_repetida [1] = Integer.toString(lista.frecuencia);	
					mayor_frecuencia = lista.frecuencia;
				}
				lista = lista.sig;
			}
		}
		return mas_repetida;
		
	}
	
	public void imprimirDiccionario (ListaEnlazada lista) {
		while (lista != null) {
			System.out.println("Palabra: "+lista.palabra+" - Frecuencia: "+lista.frecuencia);
			lista = lista.sig;
		}
	}

}

package Ejercicio012;

public class Nodo {
	// constructor
	public Nodo (int valor) {
		this.info = valor;
		this.sig = null;
		
	}
	
	// métodos getter
	
	public Nodo nuevoElemento (Nodo cabeza, int valor) {
		Nodo puntero = cabeza;
		if (puntero == null) {
			Nodo nodo = new Nodo(valor);
			puntero = nodo;
		}
		else {
			while (puntero.sig != null) {
				puntero = puntero.sig;
			}	
			Nodo nodo = new Nodo(valor);
			puntero.sig = nodo;
		}
			
		return cabeza;
	}
	
	public boolean mismaDimension (Nodo cabeza1, Nodo cabeza2) {
		int nodos_lista1 = 0;
		int nodos_lista2 = 0;
		Nodo puntero = cabeza1;
		while (puntero != null) {
			nodos_lista1++;
			puntero = puntero.sig;
		}
		puntero = cabeza2;
		while (puntero != null) {
			nodos_lista2++;
			puntero = puntero.sig;
		}
		if (nodos_lista1 == nodos_lista2) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public int productoEscalar (Nodo cabeza1, Nodo cabeza2) {
		int resultado = 0;
		if (mismaDimension (cabeza1,cabeza2)) {
			Nodo puntero1 = cabeza1;
			Nodo puntero2 = cabeza2;
			while (puntero1 !=null) {
				resultado = resultado + (puntero1.info*puntero2.info);
				puntero1 = puntero1.sig;
				puntero2 = puntero2.sig;
			}
		}
		else {
			System.out.println ("Los vectores no tienen la misma dimensión");
			resultado = 0;
		}		
		return resultado;
	}
	
	// Método setter
	
	public void mostrarLista(Nodo cabeza) {
		while (cabeza != null) {
			System.out.print(cabeza.info+" ");
			cabeza = cabeza.sig;
		}
		
	}
	
	// propiedades
	private int info;
	private Nodo sig;
	
	

}

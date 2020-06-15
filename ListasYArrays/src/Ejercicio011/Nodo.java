package Ejercicio011;

public class Nodo {
	
	public Nodo (int info) {
		
		this.info = info;
		this.sig = null;
		
	}
	
	public Nodo nuevoElemento (int valor, Nodo cabeza) {
		Nodo lista = cabeza; 
		if (cabeza == null) {
			cabeza = new Nodo (valor);
		}
		else {
			while (cabeza.sig != null) {
				cabeza = cabeza.sig;	
			}
			Nodo nodo = new Nodo (valor);
			cabeza.sig = nodo;
		}	
		return lista;
	}
	
	public Nodo ordenarLista (Nodo cabeza) {
		int aux;
		Nodo lista = cabeza;
		while (cabeza.sig != null) {
			Nodo pivote = cabeza.sig;
			while (pivote != null) {
				if (pivote.info < cabeza.info) { // intercambiamos
					aux = cabeza.info;
					cabeza.info = pivote.info;
					pivote.info = aux;
				}
				pivote = pivote.sig;
			}
			cabeza = cabeza.sig;
		}
		return lista;
	}
	
	public void mostrarLista (Nodo cabeza) {
		if (cabeza == null) {
			System.out.println ("La lista está vacía");
		} 
		else {
			while (cabeza != null) {
				System.out.print(cabeza.info+" ");
			    cabeza = cabeza.sig;
			}
		}
	}
			
	private int info;
	private Nodo sig;
	
}


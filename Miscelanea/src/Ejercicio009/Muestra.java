package Ejercicio009;

public class Muestra {
	
	private int info;
	private Muestra sig;
	
	public Muestra (int dato) {
		this.info = dato;
		sig = null;
	}
	public void agregarDato (int dato, Muestra muestra) {
		
		if (muestra == null) {
			Muestra elemento = new Muestra (dato);
			muestra = elemento;
		}
		else {
			while (muestra.sig != null) {
				muestra = muestra.sig;
			}
			Muestra elemento = new Muestra (dato);
			muestra.sig = elemento;
		}
		
	}
	public void mostrarMuestra (Muestra muestra) {
		while (muestra != null) {
			System.out.print (muestra.info+" ");
			muestra = muestra.sig;
		}
	}
	
	public int elementosMuestra (Muestra muestra) {
		int n_elementos = 0;
		while (muestra != null) {
			n_elementos++;
			muestra = muestra.sig;
		}
		return n_elementos;
	}
	
	public int verDato () {
		return this.info;
	}
	
	public Muestra elementoSiguiente() {
		return this.sig;
	}

}

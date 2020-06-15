package Ejercicio014;

public class Nodo {

	public Nodo (int valor) {
		this.info = valor;
		this.sig = null;
	}
	
	public Nodo nuevoElemento (Nodo cabeza, int valor) {
		Nodo puntero = cabeza;
		if (puntero == null) {
			Nodo nodo = new Nodo (valor);
			puntero = nodo;
		}
		else {
			while (puntero.sig != null) {
				puntero = puntero.sig;
			}
			Nodo nodo = new Nodo (valor);
			puntero.sig = nodo;
		}
		return cabeza;
	}
	
	public void mostrarLista (Nodo cabeza) {
		while (cabeza != null) {
			System.out.print(cabeza.info+" ");
			cabeza = cabeza.sig;
		}
	}
	
	public double calcularMedia (Nodo cabeza) {
		double suma = 0, elementos = 0;
		while (cabeza != null) {
			suma = suma + cabeza.info;
			elementos++;
			cabeza = cabeza.sig;
		}
		return suma / elementos;
	}
	
	public double calculoDesviacion (Nodo cabeza) {
		double media = this.calcularMedia(cabeza);
		double suma = 0, elementos = 0, desviacion = 0;
		while (cabeza != null) {
			suma = suma + Math.pow((cabeza.info - media),2);
			elementos++;
			cabeza = cabeza.sig;
		}
		desviacion = Math.sqrt(suma / elementos);
		return desviacion;
	}
	
	private int info;
	private Nodo sig;
}

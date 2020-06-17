package Ejercicio008;

public class ListaEnlazada {
	
	private double info;
	private ListaEnlazada sig;
	private double media = 0, varianza = 0, desviacion_tipica = 0;

	public ListaEnlazada(double dato) {
		this.info = dato;
		this.sig = null;
	}
	
	public void agregarElemento (ListaEnlazada lista, double valor ) {
		if (lista == null) {
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
			System.out.print (lista.info+" ");
			lista = lista.sig;
		}
	}
	
	public int numeroElementos (ListaEnlazada lista) {
		int n_elementos = 0;
		while (lista != null) {
			n_elementos++;
			lista = lista.sig;
		}
		return n_elementos;
	}
	
	public double calculoMedia (ListaEnlazada lista) {
		int n_elementos = this.numeroElementos (lista);
		double media = 0;
		while (lista != null) {
			media = media + lista.info;
			lista = lista.sig;
		}
		media = media / n_elementos;
		return media;
		
	}
	
	public double calculoVarianza (ListaEnlazada lista) {
		int n_elementos = this.numeroElementos (lista);
		double media = this.calculoMedia (lista);
		double varianza = 0;
		while (lista != null) {
			varianza = varianza + Math.pow(lista.info - media,2);
			lista = lista.sig;
		}
		varianza = varianza / (n_elementos);
		return varianza;	
	}
	
	public double calculoDesviacionTipica(ListaEnlazada lista) {
		double varianza = this.calculoVarianza(lista);
		double desviacion = Math.sqrt(varianza);
		return desviacion;
	}
	
	public double[] operacionesLista (ListaEnlazada lista){
		double [] resultado = new double [3];
		this.media = this.calculoMedia (lista);
		this.varianza = this.calculoVarianza (lista);
		this.desviacion_tipica = this.calculoDesviacionTipica (lista);
		resultado [0] = this.media;
		resultado [1] = this.varianza;
		resultado [2] = this.desviacion_tipica;	
		return resultado;
	}
}

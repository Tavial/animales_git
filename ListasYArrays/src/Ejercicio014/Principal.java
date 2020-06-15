package Ejercicio014;

import javax.swing.JOptionPane;

public class Principal {

	public static void main (String[] args) {
		
		String entrada;
		String [] cadena;
		entrada = JOptionPane.showInputDialog("Introduce los números enteros separados por comas y sin espacios: ");
		cadena = entrada.split(",");
		Nodo lista = new Nodo (Integer.parseInt(cadena[0]));
		for (int i=1; i<cadena.length; i++) {
			int numero = Integer.parseInt(cadena[i]);
			lista = lista.nuevoElemento(lista, numero);
		}
		System.out.println ("La lista de números es la siguiente: ");
		System.out.println ();
		lista.mostrarLista(lista);
		System.out.println ();
		double media = lista.calcularMedia(lista);
		System.out.println ("La media de los números de la lista es: "+media);
		double desviacion_tipica = lista.calculoDesviacion(lista);
		System.out.println ("La desviación típica de los números de la lista es: "+desviacion_tipica);
	}
}

package Ejercicio009;

/*
 * Escribir una función que reciba una muestra de números y devuelva los valores atípicos, es 
 * decir, los valores cuya puntuación típica sea mayor que 3 o menor que -3. Nota: 
 * La puntuación típica de un valor se obtiene restando la media y dividiendo por la desviación 
 * típica de la muestra.
 */

public class Principal {
	
	public static void main (String [] args) {
		Muestra muestra = new Muestra (29);
		muestra.agregarDato(30, muestra);
		muestra.agregarDato(19, muestra);
		muestra.agregarDato(18, muestra);
		muestra.agregarDato(25, muestra);
		muestra.agregarDato(33, muestra);
		muestra.agregarDato(2, muestra);
		muestra.agregarDato(1, muestra);
		muestra.agregarDato(22, muestra);
		muestra.agregarDato(62, muestra);
		muestra.agregarDato(39, muestra);
		muestra.agregarDato(47, muestra);
		muestra.agregarDato(39, muestra);
		muestra.agregarDato(71, muestra);
		muestra.agregarDato(47, muestra);
		muestra.agregarDato(42, muestra);
		muestra.agregarDato(18, muestra);
		muestra.agregarDato(46, muestra);
		muestra.agregarDato(39, muestra);
		muestra.agregarDato(24, muestra);
		muestra.agregarDato(18, muestra);
		muestra.agregarDato(17, muestra);
		muestra.agregarDato(101, muestra);
		
		
		Estadistica calculoEstadistico = new Estadistica ();
		
		double media, desviacion_tipica;
		media = calculoEstadistico.calcularMedia(muestra);
		System.out.println ("La media de la muestra es: "+media);
		desviacion_tipica = calculoEstadistico.calcularDesviacionTipica(muestra);
		System.out.println ("La desviación típica de la muestra es: "+desviacion_tipica);
		calculoEstadistico.calcularPuntuacionTipica(muestra);
	}
	
}

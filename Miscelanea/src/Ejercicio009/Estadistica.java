package Ejercicio009;

public class Estadistica {
	
	private double media;
	private double desviacion_tipica;
	
	public Estadistica () {
		media = 0;
		desviacion_tipica = 0;
	}
	
	public double calcularMedia (Muestra muestra) {
		int n_elementos;
		double media = 0;
		if (muestra != null) {
			n_elementos = muestra.elementosMuestra(muestra);
		}
		else {
			n_elementos = 0;
		}
		while (muestra != null) {
			media = media + muestra.verDato();
			muestra = muestra.elementoSiguiente();
		}
		media = media / n_elementos;
		return media;
	}
	
	public double calcularDesviacionTipica (Muestra muestra) {
		int n_elementos;
		double desviacion_tipica;
		if (muestra != null) {
			n_elementos = muestra.elementosMuestra(muestra);
			desviacion_tipica = 0;
		}
		else {
			n_elementos = 0;
			desviacion_tipica = 0;
		}
		this.media = calcularMedia (muestra);
		while (muestra != null) {
			desviacion_tipica =desviacion_tipica + Math.pow(muestra.verDato() - this.media,2);
			muestra = muestra.elementoSiguiente();
		}
		desviacion_tipica = Math.sqrt(desviacion_tipica / n_elementos);
		return desviacion_tipica;
	}
	
	public void calcularPuntuacionTipica (Muestra muestra) {
		double puntuacion_tipica = 0;
		this.desviacion_tipica = calcularDesviacionTipica (muestra);
		while (muestra != null) {
			puntuacion_tipica = (muestra.verDato()- this.media) / this.desviacion_tipica;
			if (puntuacion_tipica > 3 || puntuacion_tipica < -3) {
				System.out.println ("Valor atípico: "+muestra.verDato());
			}
			muestra = muestra.elementoSiguiente();
		}	
	}
	
	
	

}

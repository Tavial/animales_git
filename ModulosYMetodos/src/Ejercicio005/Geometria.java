package Ejercicio005;

public class Geometria {

	// propiedades
	private double radio;
	private double altura;
	 
	//constructores
	
	public Geometria (double radio) {
		this.radio = radio;
	}
	public Geometria (double radio, double altura) {
		this.radio = radio;
		this.altura = altura;
	}
	
	// métodos
	public double areaCirculo () {
		double area;
		area = Math.PI*Math.pow(this.radio, 2);
		return area;
	}
	
	public double volumenCilindro() {
		double volumen;
		volumen = this.areaCirculo()*this.altura;
		return volumen;
	}
	
	
}

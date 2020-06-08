package Ejercicio003;

public class Asignatura {

	// constructor
	public Asignatura (String nombre, double nota) {
		
		this.nombre = nombre;
		this.nota = nota;
	}
	
	// m�todos getter
	public String verDatos() {
		return "En "+this.nombre+" has sacado "+this.nota+".";
	}
	public String verNombre() {
		return this.nombre;
	}
	
	// m�todo setter
	public void establecerNota (double nota) {
		this.nota = nota;
	}
		
	private String nombre;
	private double nota;
}

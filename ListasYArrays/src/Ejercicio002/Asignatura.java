package Ejercicio002;

public class Asignatura {
	
	// constructor
	public Asignatura (String nombre) {
		this.nombre = nombre;
	}
	
	// método getter
	
	public String nombreAsignatura () {
		return "Yo estudio "+nombre;
	}
	
	// propiedades 
	private String nombre;
}

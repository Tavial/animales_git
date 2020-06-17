package Ejercicio002;

public class Saludo {
	
	//propiedad
	private String nombre;
	
	// constructor
	public Saludo (String nombre) {
		this.nombre = nombre;
	}
	
	// getter
	public void mostrarSaludo () {
		System.out.println ("¡Hola "+this.nombre+"!");
	}
	
}

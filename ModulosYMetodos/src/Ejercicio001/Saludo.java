package Ejercicio001;

public class Saludo {

	// propiedades
	
	private String mensaje;
	
	// constructor
	
	public Saludo (String mensaje) {
		this.mensaje = mensaje;
	}
	
	public void mostrarSaludo () {
		System.out.println (this.mensaje);
	}
	
}

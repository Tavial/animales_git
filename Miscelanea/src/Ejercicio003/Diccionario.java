package Ejercicio003;

public class Diccionario {

	private String palabra;
	private int longitud;
	private Diccionario sig;
	
	public Diccionario (String palabra) {
		
		this.palabra = palabra;
		this.longitud = palabra.length();
		this.sig = null;
	}
	
	public void agregarPalabra (String palabra, Diccionario diccionario){
		boolean encontrado = false;
		if (diccionario == null) {
			Diccionario nodo = new Diccionario (palabra);
			diccionario = nodo;
		}
		else {
			while (diccionario.sig != null && !encontrado )  {
				if (diccionario.palabra.equalsIgnoreCase(palabra)) {
					encontrado = true;
				}
				else {
					diccionario = diccionario.sig;	
				}
				
			}
			if (!encontrado) {
				Diccionario nodo = new Diccionario (palabra);
				diccionario.sig = nodo;
			}
		}
	}
	
	public void mostrarDiccionario (Diccionario diccionario) {
		
		while (diccionario != null) {
			System.out.println ("Palabra: "+diccionario.palabra+" - Longitud: "+diccionario.longitud);
			diccionario = diccionario.sig;
		}
	}

	
}

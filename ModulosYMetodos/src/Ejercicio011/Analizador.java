package Ejercicio011;

public class Analizador{
	
	private String frase;
	
	public Analizador (String frase) {
		this.frase = frase;
	}
	
	public ListaEnlazada tratarTexto () {	
		String [] cadena;
		int longitud_frase;
		this.frase = this.frase.toLowerCase();
		this.frase = this.frase.replace(".","");
		this.frase = this.frase.replace(",","");
		this.frase = this.frase.replace(";","");	
		cadena = this.frase.split(" ");
		longitud_frase = cadena.length;
		ListaEnlazada diccionario = new ListaEnlazada (cadena[0]); 
		for (int i=1; i<longitud_frase; i++) {
			diccionario.nuevoElemento(cadena[i], diccionario);
		}	
		return diccionario;
	}
	
	public String[] palabraMasRepetida (ListaEnlazada lista){
		String [] mas_repetida = new String [2];
		mas_repetida = lista.masRepetida(lista);
		return mas_repetida;
	}
	
} // class

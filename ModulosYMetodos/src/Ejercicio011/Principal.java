package Ejercicio011;

/* Escribir un programa que reciba una cadena de caracteres y devuelva un diccionario con cada 
 * palabra que contiene y su frecuencia. Escribir otra funci�n que reciba el diccionario 
 * generado con la funci�n anterior y devuelva una tupla con la palabra m�s repetida y su 
 * frecuencia.
 */

public class Principal {

	public static void main (String [] args) {
		
		ListaEnlazada diccionario;
		String[] tupla = new String [2];
		String frase = "en un lugar de la Mancha de cuyo nombre no quiero acordarme, no ha mucho que viv�a un hidalgo de los de lanza en astillero, andarga antigua, roc�n flaco y galgo corredor.";
		Analizador analizador = new Analizador (frase);
		diccionario = analizador.tratarTexto();
		diccionario.imprimirDiccionario(diccionario);
		tupla = analizador.palabraMasRepetida(diccionario);
		System.out.println();
		System.out.println ("La palabra m�s repetida es '"+tupla[0]+"' y las veces que se repite son: "+tupla[1]);
	}
}

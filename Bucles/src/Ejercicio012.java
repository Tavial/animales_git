import java.util.Scanner;

/* Escribir un programa en el que se pregunte al usuario por una frase y una letra, y muestre 
 * por pantalla el número de veces que aparece la letra en la frase.
 */
public class Ejercicio012 {

	public static void main (String[] args) {
		Scanner entrada = new Scanner (System.in);
		String frase,cadena;
		char letra;
		int veces = 0;
		do {
			System.out.println ("Introduce una frase: ");
			frase = entrada.nextLine();
		} while (frase.isEmpty());
		frase = frase.toLowerCase();
		do {
			System.out.println ("Introduce una letra: ");
			cadena = entrada.nextLine();
		} while (!cadena.matches("[A-Z]|[a-z]"));
		letra = cadena.toLowerCase().charAt(0);
			
		for (int i=0; i<frase.length(); i++) {
			if (frase.charAt(i)==letra) {
				veces++;
			}	
		}
		System.out.println ("El número de veces que aparece la letra "+letra+" en la frase es "+veces+" veces.");	
		entrada.close();
	} // main
	
} // class

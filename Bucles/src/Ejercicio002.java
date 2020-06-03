import java.util.Scanner;

/*
 * Escribir un programa que pregunte al usuario su edad y muestre por pantalla todos los años 
 * que ha cumplido (desde 1 hasta su edad).
 */
public class Ejercicio002 {
	public static void main (String[] args) {
		Scanner entrada = new Scanner (System.in);
		String cadena="";
		int edad,i;
		System.out.println("Introduce tu edad: ");
		cadena = entrada.nextLine();
		entrada.close();
		if (cadena.matches("[0-9]+")) {
			edad = Integer.parseInt(cadena);
			System.out.println ("Voy a decirte todos los años que has cumplido: ");
			for ( i=1; i<=edad; i++) {
				System.out.println ("Has celebrado tu "+i+" cumpleaños");
			} //for
		} // if
		else {
			System.out.println ("El valor introducido para la edad no está en el rango correcto");
		}
		
	} // main
} // class

import java.util.Scanner;
/*
 * Escribir un programa que muestre el eco de todo lo que el usuario introduzca hasta que el 
 * usuario escriba �salir� que terminar�.
 */
public class Ejercicio013 {
	
	public static void main (String[] args) {
		Scanner entrada = new Scanner (System.in);
		String frase;
		System.out.println ("ECO. Introduce lo que quieras. El programa lo repetir�. Cuando te canses escribe salir");
		do {
			frase = entrada.nextLine();
			
			if (frase.equalsIgnoreCase("salir")) {
				System.out.println ("Adi�s!!");
			}
			else {
				System.out.println (frase);
			}
		} 
		while (!frase.equalsIgnoreCase("salir"));
		entrada.close();
	} // main
		
} //class

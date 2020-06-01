/* Escribir un programa que almacene la cadena de caracteres "contraseña" en una variable, 
 * pregunte al usuario por la contraseña e imprima por pantalla si la contraseña introducida 
 * por el usuario coincide con la guardada en la variable sin tener en cuenta mayúsculas y 
 * minúsculas.
 */

import java.util.Scanner;

public class Ejercicio002 {

		public static void main (String[] args) {
			String contrasenya = "contraseña";
			Scanner entrada = new Scanner (System.in);
			String clave;
			System.out.println ("Introduce la contraseña de acceso: ");
			clave = entrada.nextLine();
			if (clave.equalsIgnoreCase(contrasenya)) {
				System.out.println ("Contraseña correcta. Acceso permitido");
			}
			else {
				System.out.println ("Contraseña incorrecta");
			}		
			entrada.close();
		} //main
} //class

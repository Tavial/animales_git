/* Escribir un programa que almacene la cadena de caracteres "contrase�a" en una variable, 
 * pregunte al usuario por la contrase�a e imprima por pantalla si la contrase�a introducida 
 * por el usuario coincide con la guardada en la variable sin tener en cuenta may�sculas y 
 * min�sculas.
 */

import java.util.Scanner;

public class Ejercicio002 {

		public static void main (String[] args) {
			String contrasenya = "contrase�a";
			Scanner entrada = new Scanner (System.in);
			String clave;
			System.out.println ("Introduce la contrase�a de acceso: ");
			clave = entrada.nextLine();
			if (clave.equalsIgnoreCase(contrasenya)) {
				System.out.println ("Contrase�a correcta. Acceso permitido");
			}
			else {
				System.out.println ("Contrase�a incorrecta");
			}		
			entrada.close();
		} //main
} //class

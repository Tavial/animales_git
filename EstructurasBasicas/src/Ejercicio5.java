/*
 * Escribir un programa que pregunte el nombre del usuario en la consola y despu�s de que el 
 * usuario lo introduzca muestre por pantalla <NOMBRE> tiene <n> letras, donde <NOMBRE> es el 
 * nombre de usuario en may�sculas y <n> es el n�mero de letras que tienen el nombre.
 */

import java.util.Scanner;

public class Ejercicio5 {
	
	public static void main (String[] args) {
		// instancio un objeto de la clase Scanner para recoger los datos de la consola de 
		// entrada System.in
		String nombre;
		Scanner entrada = new Scanner (System.in);
		System.out.println("Introduce tu nombre: ");
		nombre = entrada.nextLine();
		System.out.println(nombre.toUpperCase()+" tiene "+nombre.length()+" letras");
		entrada.close();
	}

}

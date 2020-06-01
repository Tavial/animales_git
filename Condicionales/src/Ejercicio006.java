import java.util.Scanner;

/*Los alumnos de un curso se han dividido en dos grupos A y B de acuerdo al sexo y el nombre. 
 * El grupo A esta formado por las mujeres con un nombre anterior a la M y los hombres con un 
 * nombre posterior a la N y el grupo B por el resto. Escribir un programa que pregunte al 
 * usuario su nombre y sexo, y muestre por pantalla el grupo que le corresponde.
 */
public class Ejercicio006 {

	public static void main (String[] args) {
		String genero, nombre;
		int comparacionN, comparacionM;
		Scanner entrada = new Scanner (System.in);
		System.out.println ("Introduce tu género (h/m): ");
		genero = entrada.nextLine();
		if (genero.equalsIgnoreCase("h") || genero.equalsIgnoreCase("m")){ //se ha introducido correctamente el género
			System.out.println ("Introduce tu nombre ");
			nombre = entrada.nextLine();
			if (nombre.matches("[A-ZÁÉÍÓÚ]{1}[a-zñáéíóú]+[\\s]*")) { 
				//se ha introducido un nombre válido
				comparacionM = nombre.compareToIgnoreCase("M");
				comparacionN = nombre.compareToIgnoreCase("N");
				if (comparacionM < 0 && genero.equalsIgnoreCase("m")) {
					System.out.println ("Perteneces al grupo A");
				}
				else if (comparacionM>= 0 && genero.equalsIgnoreCase("m")) {
					System.out.println ("Perteneces al grupo B");
				}
				else if (comparacionN >= 0 && genero.equalsIgnoreCase("h")) {
					System.out.println ("Perteneces al grupo A");
				}
				else if (comparacionN < 0 && genero.equalsIgnoreCase("h")) {
					System.out.println ("Perteneces al grupo B");
				}			
			} // end_if 
			else {
				System.out.println ("El valor introducido para el nombre no es correcto. ");
			} //end_else
			
		} //end_if 
		else {
			System.out.println ("El valor introducido para el género no es correcto. ");
			
		} //end_else
		entrada.close();
		
	} //end_main
	
} //end_class



/* La pizzer�a Bella Napoli ofrece pizzas vegetarianas y no vegetarianas a sus clientes. Los 
 * ingredientes para cada tipo de pizza aparecen a continuaci�n.

Ingredientes vegetarianos: Pimiento y tofu.

Ingredientes no vegetarianos: Peperoni, Jam�n y Salm�n.

Escribir un programa que pregunte al usuario si quiere una pizza vegetariana o no, y en 
funci�n de su respuesta le muestre un men� con los ingredientes disponibles para que elija. 
Solo se puede eligir un ingrediente adem�s de la mozzarella y el tomate que est�n en todas las 
pizzas. Al final se debe mostrar por pantalla si la pizza elegida es vegetariana o no y todos 
los ingredientes que lleva.
*/

import java.util.Scanner;

public class Ejercicio010 {

	public static void main (String[] args) {
		
		String eleccion, ingrediente="";
		boolean vegetariana = false, error = false;
		Scanner entrada = new Scanner (System.in);
		System.out.println ("*************************");
		System.out.println ("* PIZZERIA BELLA NAPOLI *");
		System.out.println ("*************************");
		System.out.println ();
		System.out.println ("�Quieres que tu pizza sea vegetariana? (s/n)");
		eleccion = entrada.nextLine();
		if (eleccion.equalsIgnoreCase("S") || eleccion.equalsIgnoreCase("N")) {
			eleccion = eleccion.toUpperCase();
			switch (eleccion) {
				case "S": 
					vegetariana = true;
					break;
				case "N":
					vegetariana = false;
					break;
			} //switch
			System.out.println ("Todas nuestras pizzas constan de masa + tomate + mozarella");
			if (vegetariana) {
				System.out.println ("Indica que ingrediente adicional quieres:\n1.Pimiento.\n2.Tofu.");
				eleccion = entrada.nextLine();
				if (eleccion.equals("1") || eleccion.equals("2")){
					switch (eleccion) {
						case "1":
							ingrediente = "Pimiento";
							break;
						case "2":
							ingrediente = "Tofu";
							break;
					}
				}
				else {
					System.out.println ("El valor introducido para escoger ingrediente no est� dentro del rango");
					error = true;
				}
			}
			else { //no es vegetariana
				System.out.println ("Indica que ingrediente adicional quieres:\n1.Pepperoni.\n2.Jam�n.\n3.Salm�n.");
				eleccion = entrada.nextLine();
				if (eleccion.equals("1") || eleccion.equals("2") || eleccion.equals("3")) {
					switch (eleccion) {
					case "1":
						ingrediente = "Pepperoni";
						break;
					case "2":
						ingrediente = "Jam�n";
						break;
					case "3":
						ingrediente = "Salm�n";
						break;
					}
				}
				else {
					System.out.println("El valor introducido para escoger ingrediente no est� dentro del rango");
					error = true;
				}
			} //else  NO VEGETARIANA
		}
		else {
			System.out.println("El valor introducido en la selecci�n no es el correcto");
			error = true;
		}
		if (!error) {
			if (vegetariana) {
				System.out.println (" Tu pizza vegetariana tiene : base + tomate + mozarella + "+ingrediente);
			}
			else {
				System.out.println (" Tu pizza normal tiene : base + tomate + mozarella + "+ingrediente);
			}		
		}
		entrada.close();
	} //main
	
} //class

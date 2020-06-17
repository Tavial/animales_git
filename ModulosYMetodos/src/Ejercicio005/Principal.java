package Ejercicio005;
/*
 * Escribir una funci�n que calcule el �rea de un c�rculo y otra que calcule el volumen de 
 * un cilindro usando la primera funci�n.
 */

import java.util.Scanner;

public class Principal {
	
	public static void main (String[] args) {
		
		String opcion, radio_introducido, altura_introducida; 
		double radio=0, altura=0, area=0, volumen=0;
		Scanner entrada = new Scanner (System.in);
		do {
			do {
				System.out.println(" ************************");
				System.out.println(" * C�lculos geom�tricos *");
				System.out.println(" ************************");
				System.out.println();
				System.out.println(" 1. C�lculo del �rea de un c�rculo ");
				System.out.println(" 2. C�lculo del volumen de un cilindro ");
				System.out.println(" 3. Salir ");
				System.out.println();
				System.out.println(" Elige opci�n: ");
				opcion = entrada.nextLine();
			} while (!opcion.matches("[0-3]"));
			System.out.println();
			switch (opcion) {
				case "1": 
					do {
						System.out.println ("Introduce el radio del c�rculo: ");
						radio_introducido = entrada.nextLine();
					} while (!radio_introducido.matches("\\d+((\\.)\\d+)?"));
					radio = Double.parseDouble(radio_introducido);
					Geometria circulo = new Geometria (radio);
					area = circulo.areaCirculo();
					System.out.println ("El �rea del c�rculo es: "+area);
					System.out.println();
					break;
				case "2":
					do {
						System.out.println ("Introduce el radio de la base del cilindro: ");
						radio_introducido = entrada.nextLine();
					} while (!radio_introducido.matches("\\d+((\\.)\\d+)?"));
					
					do {
						System.out.println ("Introduce la altura del cilindro: ");
						altura_introducida = entrada.nextLine();
					} while (!altura_introducida.matches("\\d+((\\.)\\d+)?"));
					radio = Double.parseDouble(radio_introducido);
					altura = Double.parseDouble(altura_introducida);
					Geometria cilindro = new Geometria (radio, altura);
					volumen = cilindro.volumenCilindro();
					System.out.println ("El volumen del cilindro es: "+volumen);
					System.out.println();
					break;		
				case "3": 
					System.out.println ("Gracias por utilizar nuestra aplicaci�n.");
					System.out.println();
					break;
						
			} // switch
		} while (!opcion.equals("3"));
		entrada.close();
	} // main

} // class

package Ejercicio005;
/*
 * Escribir una función que calcule el área de un círculo y otra que calcule el volumen de 
 * un cilindro usando la primera función.
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
				System.out.println(" * Cálculos geométricos *");
				System.out.println(" ************************");
				System.out.println();
				System.out.println(" 1. Cálculo del área de un círculo ");
				System.out.println(" 2. Cálculo del volumen de un cilindro ");
				System.out.println(" 3. Salir ");
				System.out.println();
				System.out.println(" Elige opción: ");
				opcion = entrada.nextLine();
			} while (!opcion.matches("[0-3]"));
			System.out.println();
			switch (opcion) {
				case "1": 
					do {
						System.out.println ("Introduce el radio del círculo: ");
						radio_introducido = entrada.nextLine();
					} while (!radio_introducido.matches("\\d+((\\.)\\d+)?"));
					radio = Double.parseDouble(radio_introducido);
					Geometria circulo = new Geometria (radio);
					area = circulo.areaCirculo();
					System.out.println ("El área del círculo es: "+area);
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
					System.out.println ("Gracias por utilizar nuestra aplicación.");
					System.out.println();
					break;
						
			} // switch
		} while (!opcion.equals("3"));
		entrada.close();
	} // main

} // class

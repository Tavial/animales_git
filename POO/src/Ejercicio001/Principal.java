package Ejercicio001;

import java.util.Scanner;

/*
 * Crea una clase Complejo que permita trabajar con números complejos (parte real y parte 
 * imaginaria). Incluye los siguientes métodos: constructores (por defecto y parametrizado), 
 * métodos getter y setter, suma, resta, multiplicación, división, módulo, argumento y print(). 
 * 
 * z=a+bi
 * 
 */

public class Principal {
	
	public static void main (String [] args) {
		
		Scanner entrada = new Scanner (System.in);
		String opcion, real, imaginaria; 
		double a, b;
		Complejo z1, z2, z3;
	
		do {
			System.out.println();
			System.out.println (" ************************************");
			System.out.println (" * CALCULADORA DE NUMEROS COMPLEJOS *");
			System.out.println (" ************************************");
			System.out.println (" 1. Suma ");
			System.out.println (" 2. Resta ");
			System.out.println (" 3. Multiplicación ");
			System.out.println (" 4. División ");
			System.out.println (" 5. Módulo ");
			System.out.println (" 6. Argumento ");
			System.out.println ();
			System.out.println (" 7. Salir ");
			System.out.println ();
			do {
				System.out.println (" Escoge opción: ");
				opcion = entrada.nextLine();
			} while (!opcion.matches("[1-7]"));
			
			switch (opcion) {
				case "1": 
					do {
						System.out.println ("Introduce la parte real del primer número: ");
						real = entrada.nextLine();
					} while (!real.matches("-?[0-9]\\d*(\\.\\d+)?"));
					a = Double.parseDouble(real);
					do {
						System.out.println ("Introduce la parte imaginaria del primer número: ");
						imaginaria = entrada.nextLine();
					} while (!imaginaria.matches("-?[0-9]\\d*(\\.\\d+)?"));
					b = Double.parseDouble(imaginaria);
					
					z1 = new Complejo (a,b);
					
					do {
						System.out.println ("Introduce la parte real del segundo número: ");
						real = entrada.nextLine();
					} while (!real.matches("-?[0-9]\\d*(\\.\\d+)?"));
					a = Double.parseDouble(real);
					do {
						System.out.println ("Introduce la parte imaginaria del segundo número: ");
						imaginaria = entrada.nextLine();
					} while (!imaginaria.matches("-?[0-9]\\d*(\\.\\d+)?"));
					b = Double.parseDouble(imaginaria);
					
					z2 = new Complejo (a,b);
					
					z3 = new Complejo();
					z3 = z3.sumaComplejos(z1, z2);
					System.out.println ();
					System.out.println ("El resultado de ("+z1.print(z1)+") + ("+z2.print(z2)+") es igual a: ("+z3.print(z3)+")");
					System.out.println ();
					break;
				
				case "2": 
					do {
						System.out.println ("Introduce la parte real del primer número: ");
						real = entrada.nextLine();
					} while (!real.matches("-?[0-9]\\d*(\\.\\d+)?"));
					a = Double.parseDouble(real);
					do {
						System.out.println ("Introduce la parte imaginaria del primer número: ");
						imaginaria = entrada.nextLine();
					} while (!imaginaria.matches("-?[0-9]\\d*(\\.\\d+)?"));
					b = Double.parseDouble(imaginaria);
					
					z1 = new Complejo (a,b);
					
					do {
						System.out.println ("Introduce la parte real del segundo número: ");
						real = entrada.nextLine();
					} while (!real.matches("-?[0-9]\\d*(\\.\\d+)?"));
					a = Double.parseDouble(real);
					do {
						System.out.println ("Introduce la parte imaginaria del segundo número: ");
						imaginaria = entrada.nextLine();
					} while (!imaginaria.matches("-?[0-9]\\d*(\\.\\d+)?"));
					b = Double.parseDouble(imaginaria);
					
					z2 = new Complejo (a,b);
					
					z3 = new Complejo();
					z3 = z3.restaComplejos(z1, z2);
					System.out.println ();
					System.out.println ("El resultado de ("+z1.print(z1)+") - ("+z2.print(z2)+") es igual a: ("+z3.print(z3)+")");
					System.out.println ();
					break;

				case "3": 
					do {
						System.out.println ("Introduce la parte real del primer número: ");
						real = entrada.nextLine();
					} while (!real.matches("-?[0-9]\\d*(\\.\\d+)?"));
					a = Double.parseDouble(real);
					do {
						System.out.println ("Introduce la parte imaginaria del primer número: ");
						imaginaria = entrada.nextLine();
					} while (!imaginaria.matches("-?[0-9]\\d*(\\.\\d+)?"));
					b = Double.parseDouble(imaginaria);
					
					z1 = new Complejo (a,b);
					
					do {
						System.out.println ("Introduce la parte real del segundo número: ");
						real = entrada.nextLine();
					} while (!real.matches("-?[0-9]\\d*(\\.\\d+)?"));
					a = Double.parseDouble(real);
					do {
						System.out.println ("Introduce la parte imaginaria del segundo número: ");
						imaginaria = entrada.nextLine();
					} while (!imaginaria.matches("-?[0-9]\\d*(\\.\\d+)?"));
					b = Double.parseDouble(imaginaria);
					
					z2 = new Complejo (a,b);
					
					z3 = new Complejo();
					z3 = z3.productoComplejos(z1, z2);
					System.out.println ();
					System.out.println ("El resultado de ("+z1.print(z1)+") x ("+z2.print(z2)+") es igual a: ("+z3.print(z3)+")");
					System.out.println ();
					break;
				
				case "4": 
					do {
						System.out.println ("Introduce la parte real del primer número: ");
						real = entrada.nextLine();
					} while (!real.matches("-?[0-9]\\d*(\\.\\d+)?"));
					a = Double.parseDouble(real);
					do {
						System.out.println ("Introduce la parte imaginaria del primer número: ");
						imaginaria = entrada.nextLine();
					} while (!imaginaria.matches("-?[0-9]\\d*(\\.\\d+)?"));
					b = Double.parseDouble(imaginaria);
					
					z1 = new Complejo (a,b);
					
					do {
						System.out.println ("Introduce la parte real del segundo número: ");
						real = entrada.nextLine();
					} while (!real.matches("-?[0-9]\\d*(\\.\\d+)?"));
					a = Double.parseDouble(real);
					do {
						System.out.println ("Introduce la parte imaginaria del segundo número: ");
						imaginaria = entrada.nextLine();
					} while (!imaginaria.matches("-?[0-9]\\d*(\\.\\d+)?"));
					b = Double.parseDouble(imaginaria);
					
					z2 = new Complejo (a,b);
					
					z3 = new Complejo();
					z3 = z3.divisionComplejos(z1, z2);
					System.out.println ();
					System.out.println ("El resultado de ("+z1.print(z1)+") : ("+z2.print(z2)+") es igual a: ("+z3.print(z3)+")");
					System.out.println ();
					break;
					
				case "5": 
					do {
						System.out.println ("Introduce la parte real del número: ");
						real = entrada.nextLine();
					} while (!real.matches("-?[0-9]\\d*(\\.\\d+)?"));
					a = Double.parseDouble(real);
					do {
						System.out.println ("Introduce la parte imaginaria del número: ");
						imaginaria = entrada.nextLine();
					} while (!imaginaria.matches("-?[0-9]\\d*(\\.\\d+)?"));
					b = Double.parseDouble(imaginaria);
					
					z1 = new Complejo (a,b);
					
					double modulo;
					modulo = z1.moduloComplejo(z1);
					System.out.println ();
					System.out.print("El módulo de ("+z1.print(z1)+") es igual a: ");
					System.out.printf("%.2f", modulo);
					System.out.println ();
					break;
					
				case "6": 
					do {
						System.out.println ("Introduce la parte real del número: ");
						real = entrada.nextLine();
					} while (!real.matches("-?[0-9]\\d*(\\.\\d+)?"));
					a = Double.parseDouble(real);
					do {
						System.out.println ("Introduce la parte imaginaria del número: ");
						imaginaria = entrada.nextLine();
					} while (!imaginaria.matches("-?[0-9]\\d*(\\.\\d+)?"));
					b = Double.parseDouble(imaginaria);
					
					if (a == 0) {
						System.out.println ();
						System.out.println ("No se puede calcular el argumento de un complejo cuya parte real es 0");
						System.out.println();
					}
					else {
						z1 = new Complejo (a,b);				
						double argumento;
						argumento = z1.argumentoComplejo(z1);
						System.out.println ();
						System.out.print("El argumento de ("+z1.print(z1)+") es igual a: ");
						System.out.printf("%.2f", argumento);
						System.out.print (" grados");
						System.out.println();
		
					}
					break;
				case "7":
					System.out.println ("Gracias por utilizar nuestra calculadora. Hasta la próxima!");
					break;
					

			} // switch
			
				
		} while (!opcion.equals("7"));
		
		entrada.close();
		
	}
	
	

}

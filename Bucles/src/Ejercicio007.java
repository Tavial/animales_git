// Escribir un programa que muestre por pantalla la tabla de multiplicar del 1 al 10.

public class Ejercicio007 {
	
	public static void main (String[] args) {
		
		System.out.println ("TABLA DE MULTIPLICAR");
		System.out.println ("====================");
		System.out.println ("");
		for (int i=1; i<=10; i++) {
			System.out.println("Tabla del "+i);
			System.out.println("--------------");
			for (int j=1; j<=10; j++) {
				System.out.println (i+" X "+j+" = "+i*j);
			} //for
			System.out.println("");
		} // for		
	} // main

} // class

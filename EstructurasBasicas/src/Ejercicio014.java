import java.util.Scanner;

/*
 * Una panadería vende barras de pan a 3.49€ cada una. El pan que no es el día tiene un descuento del 
 * 60%. Escribir un programa que comience leyendo el número de barras vendidas que no son del día. 
 * Después el programa debe mostrar el precio habitual de una barra de pan, el descuento que se le hace 
 * por no ser fresca y el coste final total.
 */
public class Ejercicio014 {
	
	public static void main (String[] args) {
		final double precio_barra_fresca = 3.49;
		final double descuento = 0.6;
		int barras_no_frescas;
		double precio_final;
		Scanner entrada = new Scanner (System.in);
		System.out.println("Introduce el número de barras de pan vendidas que no son frescas: ");
		barras_no_frescas = entrada.nextInt();
		precio_final = (barras_no_frescas*precio_barra_fresca)-((barras_no_frescas*precio_barra_fresca)*descuento);
		System.out.println ();
		System.out.print ("El precio habitual de la barra de pan fresca es de "+precio_barra_fresca+" €.\nEl descuento que se hace "
				+ "por no ser fresca es de "+descuento*100+" %. \nEl coste final es de: ");
		System.out.printf("%.2f", precio_final);
		System.out.print(" €");
		entrada.close();
	}
	
	
	
}

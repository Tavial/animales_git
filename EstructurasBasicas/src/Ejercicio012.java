import java.util.Scanner;

/*
 * Una jugueter�a tiene mucho �xito en dos de sus productos: payasos y mu�ecas. Suele hacer venta por 
 * correo y la empresa de log�stica les cobra por peso de cada paquete as� que deben calcular el peso de 
 * los payasos y mu�ecas que saldr�n en cada paquete a demanda. Cada payaso pesa 112 g y cada mu�eca 
 * 75 g. Escribir un programa que lea el n�mero de payasos y mu�ecas vendidos en el �ltimo pedido y 
 * calcule el peso total del paquete que ser� enviado.
 */

public class Ejercicio012 { 
	
	public static void main (String[] args) {
		// instancio un objeto de la clase Scanner para utilizar la consola de entrada de datos
		Scanner entrada = new Scanner (System.in);
		final int peso_payaso = 112;
		final int peso_munyeca = 75;
		int n_payasos, n_munyecas, peso_total;
		System.out.println ("Introduce el n�mero de payasos que hay en el pedido: ");
		n_payasos = entrada.nextInt();
		System.out.println ("Introduce el n�mero de mu�ecas que hay en el pedido: ");
		n_munyecas = entrada.nextInt();
		peso_total = n_payasos * peso_payaso + n_munyecas * peso_munyeca;
		System.out.println();
		System.out.println("El peso total del paquete enviado es: "+peso_total+" gramos");
		
		entrada.close();
	}

}

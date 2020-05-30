/*
 * Escribir un programa que realice la siguiente operación aritmética  (3+2 / 2*5) elevado al cuadrado.
 */
public class Ejercicio6 {

		public static void main (String[] args) {
			double dividendo, divisor, parcial, resultado;
			dividendo = 3 + 2;
			divisor = 2 * 5;
			parcial = dividendo / divisor;
			resultado = Math.pow(parcial, 2);
			System.out.println();
			System.out.print("El resultado de la operación (3+2 / 2*5) elevado al cuadrado es: ");
			System.out.printf("%.2f", resultado);			
		}
}

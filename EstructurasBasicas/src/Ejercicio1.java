/*  
 *  Declara dos variables numéricas (con el valor que desees), muestra por consola la suma, 
 *  resta, multiplicación, división y módulo (resto de la división).
 */
public class Ejercicio1 {
	public static void main (String[] args) {
	
	float operando1 = 5.2F;
	float operando2 = 2.3F;
	float resultado;
	int dividendo = 5;
	int divisor = 2;
	int resto;
	// Calculamos la suma de los operandos
	resultado = operando1 + operando2;
	System.out.print("El resultado de "+operando1+" mas "+operando2+" es igual a: ");
	System.out.printf("%2.2f",resultado);
	// Calculamos la resta de los operandos
	resultado = operando1 - operando2;
	System.out.println();
	System.out.print("El resultado de "+operando1+" menos "+operando2+" es igual a: ");
	System.out.printf("%2.2f",resultado);
	// Calculamos el producto de los operandos
	resultado = operando1 * operando2;
	System.out.println();
	System.out.print("El resultado de "+operando1+" por "+operando2+" es igual a: ");
	System.out.printf("%.2f",resultado);
	// Calculamos el cociente de los operandos
	resultado = operando1 / operando2;
	System.out.println();
	System.out.print("El resultado de "+operando1+" entre "+operando2+" es igual a: ");
	System.out.printf("%.2f",resultado);
	resto = dividendo % divisor;
	System.out.println();
	System.out.print("El resto de dividir "+dividendo+" entre "+divisor+" es igual a: "+resto);
		
	}
	
}

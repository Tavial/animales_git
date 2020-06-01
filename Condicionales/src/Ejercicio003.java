import javax.swing.JOptionPane;

/* Escribir un programa que pida al usuario dos números y muestre por pantalla su división. 
 * Si el divisor es cero el programa debe mostrar un error.
 */
public class Ejercicio003 {
	
	public static void main (String[] args) {
	
		double dividendo, divisor, cociente;
		String entrada;
		entrada = JOptionPane.showInputDialog("Introduce el dividendo: ");
		dividendo = Double.parseDouble(entrada);
		entrada = JOptionPane.showInputDialog("Introduce el divisor: ");
		divisor = Double.parseDouble(entrada);
		if (divisor != 0) {
			cociente = dividendo / divisor;
			System.out.print("El cociente de de la división entre "+dividendo+" y "+divisor+" es: ");
			System.out.printf("%.2f",cociente);
		} //if
		else {
			System.out.println("El divisor es igual a 0");
		} //else	
	} //main

} //class

import javax.swing.JOptionPane;

/*
 * Escribir un programa que pida al usuario un número entero positivo y muestre por pantalla 
 * todos los números impares desde 1 hasta ese número separados por comas.
 */
public class Ejercicio003 {
	
	public static void main (String[] args) {
	
		String entrada;
		int numero;
		entrada = JOptionPane.showInputDialog("Introduce un número entero mayor que 0: ");
		if (entrada.matches("[0-9]+")) {
			numero = Integer.parseInt(entrada);
			if (numero > 0) {
				System.out.println("Los números impares desde 1 hasta "+numero+" son: ");
				for (int i=1; i<=numero; i+=2) {	
					if (i == numero || i == numero-1) {
						System.out.print(" "+i);
					}
					else {
						System.out.print(" "+i+",");
					}
				}// for
			} // if
			else {
				System.out.println ("El valor introducido no es mayor que 0");
			}
		} //if
		else {
			System.out.println ("El valor introducido no está dentro de un rango válido");
		}
		
	} //main
	
	
} //class

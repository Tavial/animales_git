/* Escribir un programa que pida al usuario un n�mero entero y muestre por pantalla un 
 * tri�ngulo rect�ngulo como el de m�s abajo:
 * 
 * 1
 * 3 1
 * 5 3 1
 * 7 5 3 1
 * 9 7 5 3 1
 * 
 */

import javax.swing.JOptionPane;

public class Ejercicio008 {
	
	public static void main (String[] args)
	{
		String entrada;
		int numero;
		entrada =JOptionPane.showInputDialog("Introduce un n�mero entero mayor que 0 ");
		if (entrada.matches("[0-9]+")) {
			numero = Integer.parseInt(entrada);
			if (numero > 0) {
				for (int i=1; i<=numero; i+=2) {
					
					for (int j=i; j>=1; j-=2) {
						if (j % 2 != 0) {
							System.out.print(j+" ");
						}
					}
					System.out.println();
				}		
			}
			else {
				System.out.println ("El n�mero introducido tiene que ser mayor que 0");
			}
			
		}
		else {
			System.out.println ("El valor introducido para el n�mero no est� en el rango correcto");
		}
		
	} // main

} //class

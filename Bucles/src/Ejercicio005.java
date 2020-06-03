/*
 * Escribir un programa que pregunte al usuario una cantidad a invertir, el inter�s anual y 
 * el n�mero de a�os, y muestre por pantalla el capital obtenido en la inversi�n cada a�o que 
 * dura la inversi�n.
 */

import javax.swing.JOptionPane;

public class Ejercicio005 {
	
	public static void main (String[] args) {
		String entrada;
		double cantidad, interes_anual, capital=0;
		int anyos;
		entrada = JOptionPane.showInputDialog("Introduce la cantidad a invertir: ");
		if (entrada.matches("\\d+((\\.)\\d+)?")){
			cantidad = Double.parseDouble(entrada);
			entrada = JOptionPane.showInputDialog("Introduce el inter�s anual: ");
			if  (entrada.matches("\\d+((\\.)\\d+)?")) {
				interes_anual = Double.parseDouble(entrada);
				entrada = JOptionPane.showInputDialog("Introduce el n�mero de a�os que durar� la inversi�n: ");
				if (entrada.matches("[0-9]+")) {
					anyos = Integer.parseInt(entrada);
					capital = cantidad;
					for (int i=1; i<=anyos;i++) {
						capital = capital + (interes_anual/100 * capital);
						System.out.print ("El capital en el a�o "+i+" ser� de: ");
						System.out.printf ("%.2f",capital);
						System.out.println();
					}
				}
				else {
					System.out.println ("El valor introducido para el n�mero de a�os no est� en el rango correcto");
				}
			}
			else {
				System.out.println ("El valor introducido para el inter�s anual no est� en el rango correcto");
			}
		}
		else {
			System.out.println ("El valor introducido para la cantidad a invertir no est� en el rango correcto");
		}
	}

} // class

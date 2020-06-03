/*
 * Escribir un programa que pregunte al usuario una cantidad a invertir, el interés anual y 
 * el número de años, y muestre por pantalla el capital obtenido en la inversión cada año que 
 * dura la inversión.
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
			entrada = JOptionPane.showInputDialog("Introduce el interés anual: ");
			if  (entrada.matches("\\d+((\\.)\\d+)?")) {
				interes_anual = Double.parseDouble(entrada);
				entrada = JOptionPane.showInputDialog("Introduce el número de años que durará la inversión: ");
				if (entrada.matches("[0-9]+")) {
					anyos = Integer.parseInt(entrada);
					capital = cantidad;
					for (int i=1; i<=anyos;i++) {
						capital = capital + (interes_anual/100 * capital);
						System.out.print ("El capital en el año "+i+" será de: ");
						System.out.printf ("%.2f",capital);
						System.out.println();
					}
				}
				else {
					System.out.println ("El valor introducido para el número de años no está en el rango correcto");
				}
			}
			else {
				System.out.println ("El valor introducido para el interés anual no está en el rango correcto");
			}
		}
		else {
			System.out.println ("El valor introducido para la cantidad a invertir no está en el rango correcto");
		}
	}

} // class

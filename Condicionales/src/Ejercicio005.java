/* Para tributar un determinado impuesto se debe ser mayor de 16 años y tener unos ingresos 
 * iguales o superiores a 1000 € mensuales. Escribir un programa que pregunte al usuario su 
 * edad y sus ingresos mensuales y muestre por pantalla si el usuario tiene que tributar o no.
 */
import javax.swing.JOptionPane;

public class Ejercicio005 {
	
	public static void main (String[] args) {
		int edad;
		double ingresos_mensuales;
		String entrada;
		entrada = JOptionPane.showInputDialog("Introduce tu edad");
		edad = Integer.parseInt(entrada);
		entrada = JOptionPane.showInputDialog("Introduce tus ingresos mensuales");
		ingresos_mensuales = Double.parseDouble(entrada);
		if (edad > 16 && ingresos_mensuales >= 1000) {
			System.out.println ("Tienes que tributar");
		} //if
		else {
			System.out.println ("Estás exento de tributar");
		
		} //else
		
	} //main

} //class

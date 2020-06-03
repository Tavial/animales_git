// Escribir un programa que pida al usuario una palabra y la muestre por pantalla 10 veces. 

import javax.swing.JOptionPane;

public class Ejercicio001 {

	public static void main (String[] args)
	{
		String eco;
		eco = JOptionPane.showInputDialog("Introduce una palabra: ");
		int i;
		for (i = 1; i<=10; i++) {
			System.out.println("Eco "+i+": "+eco);
		}
		
	} ///main
} //class

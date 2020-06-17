package Ejercicio002;

import javax.swing.JOptionPane;

public class Principal {
	
	public static void main (String[] args) {
		String entrada;
		do {
			entrada = JOptionPane.showInputDialog("¿Cómo te llamas? ");
		} while (entrada.isEmpty());
		Saludo saludo = new Saludo (entrada);
		saludo.mostrarSaludo();
			
	}

}

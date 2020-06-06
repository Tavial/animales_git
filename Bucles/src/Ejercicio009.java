import javax.swing.JOptionPane;

/* Escribir un programa que almacene la cadena de caracteres contraseña en una variable, 
 * pregunte al usuario por la contraseña hasta que introduzca la contraseña correcta.
 */

public class Ejercicio009 {

	public static void main (String[] args) {
		String entrada, password = "contraseña";
		boolean correcta = false;
		do {
			entrada = JOptionPane.showInputDialog("Introduce la contraseña para acceder: ");
			if (entrada.equals(password)) {
				correcta = true;
				System.out.println ("Contraseña correcta. Acceso autorizado");
			}
			else {
				System.out.println ("Contraseña incorrecta. Acceso denegado");
			}
		}
		while (!correcta);
	} //  main
} // class

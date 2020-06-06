import javax.swing.JOptionPane;

/* Escribir un programa que almacene la cadena de caracteres contrase�a en una variable, 
 * pregunte al usuario por la contrase�a hasta que introduzca la contrase�a correcta.
 */

public class Ejercicio009 {

	public static void main (String[] args) {
		String entrada, password = "contrase�a";
		boolean correcta = false;
		do {
			entrada = JOptionPane.showInputDialog("Introduce la contrase�a para acceder: ");
			if (entrada.equals(password)) {
				correcta = true;
				System.out.println ("Contrase�a correcta. Acceso autorizado");
			}
			else {
				System.out.println ("Contrase�a incorrecta. Acceso denegado");
			}
		}
		while (!correcta);
	} //  main
} // class

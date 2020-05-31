/* Modifica el Ejercicio2, para que nos pida el nombre que queremos introducir 
 * (recuerda usar JOptionPane).
 */
import javax.swing.*;
public class Ejercicio003 {
	
	public static void main (String[] args) {
		
		String nombre;
		
		nombre = JOptionPane.showInputDialog("Introduce tu nombre");
		
		System.out.println ("Bienvenid@ "+nombre);		
		
	}

}

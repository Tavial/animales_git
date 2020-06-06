import javax.swing.JOptionPane;

/*Escribir un programa que pida al usuario una palabra y luego muestre por pantalla una a una 
* las letras de la palabra introducida empezando por la última.
*/ 
public class Ejercicio011 {
	public static void main (String[] args) {
	
		String palabra;
		do {
			palabra = JOptionPane.showInputDialog("Introduce una palabra");
			if (palabra.isEmpty()) {
				System.out.println ("No has introducido ninguna palabra");
			}
		} while (palabra.isEmpty());
		
		for (int i = palabra.length()-1; i>=0; i--) {
			System.out.print(palabra.charAt(i));
		} // for
				
	} //main
	
} //class

import javax.swing.JOptionPane;

/*
 * Escribir un programa que pregunte al usuario su edad y muestre por pantalla si es mayor de edad o no.
 */
public class Ejercicio001 {
	public static void main (String[] args) {
		String entrada;
		entrada = JOptionPane.showInputDialog("Introduce tu edad: ");
		int edad;
		edad = Integer.parseInt(entrada);
		if (edad >= 0 && edad < 18) {
			System.out.println ("Con "+edad+" años, eres menor de edad");
		}
		else if (edad >= 18 && edad <= 130)
		{
			System.out.println ("Con "+edad+" años, eres mayor de edad");
		}
		else 
		{
			System.out.println("El valor introducido para edad "+edad+" no está en un rango válido");
		}
		
	}

}

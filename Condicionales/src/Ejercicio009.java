import javax.swing.JOptionPane;

/* Escribir un programa para una empresa que tiene salas de juegos para todas las edades y 
 * quiere calcular de forma automática el precio que debe cobrar a sus clientes por entrar. El 
 * programa debe preguntar al usuario la edad del cliente y mostrar el precio de la entrada. 
 * Si el cliente es menor de 4 años puede entrar gratis, si tiene entre 4 y 18 años debe pagar 
 * 5€ y si es mayor de 18 años, 10€.
 */
public class Ejercicio009 {
	
	public static void main (String[] args) {
		
		String entrada;
		int edad;
		entrada = JOptionPane.showInputDialog("¿Cuántos años tienes? ");
		if (entrada.matches("[0-9]+")){ // El valor introducido por teclado es un número entero
			edad = Integer.parseInt (entrada);
			if (edad >= 0 && edad < 4) { // Puede entrar gratis
				System.out.println ("Puedes pasar gratis.");
			}
			else if (edad >= 4 && edad <= 18)  {
				System.out.println ("El precio de la entrada es de 5 €.");
			}
			else if (edad > 18 && edad <= 130) {
				System.out.println ("El precio de la entrada es de 10 €.");
			}
			else {
				System.out.println ("El valor intoducido no está en un rango de edad válido");
			}
		}
		else {
			System.out.println("El valor introducido no está en un rango de edad válido ");
		}
		
	} //main
	
	
} //class

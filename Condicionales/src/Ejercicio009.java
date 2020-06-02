import javax.swing.JOptionPane;

/* Escribir un programa para una empresa que tiene salas de juegos para todas las edades y 
 * quiere calcular de forma autom�tica el precio que debe cobrar a sus clientes por entrar. El 
 * programa debe preguntar al usuario la edad del cliente y mostrar el precio de la entrada. 
 * Si el cliente es menor de 4 a�os puede entrar gratis, si tiene entre 4 y 18 a�os debe pagar 
 * 5� y si es mayor de 18 a�os, 10�.
 */
public class Ejercicio009 {
	
	public static void main (String[] args) {
		
		String entrada;
		int edad;
		entrada = JOptionPane.showInputDialog("�Cu�ntos a�os tienes? ");
		if (entrada.matches("[0-9]+")){ // El valor introducido por teclado es un n�mero entero
			edad = Integer.parseInt (entrada);
			if (edad >= 0 && edad < 4) { // Puede entrar gratis
				System.out.println ("Puedes pasar gratis.");
			}
			else if (edad >= 4 && edad <= 18)  {
				System.out.println ("El precio de la entrada es de 5 �.");
			}
			else if (edad > 18 && edad <= 130) {
				System.out.println ("El precio de la entrada es de 10 �.");
			}
			else {
				System.out.println ("El valor intoducido no est� en un rango de edad v�lido");
			}
		}
		else {
			System.out.println("El valor introducido no est� en un rango de edad v�lido ");
		}
		
	} //main
	
	
} //class

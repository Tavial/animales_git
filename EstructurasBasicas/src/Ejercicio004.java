import javax.swing.JOptionPane;

/*
 * Haz una aplicaci�n que calcule el �rea de un c�rculo(pi*R2). El radio se pedir� por 
 * teclado (recuerda pasar de String a double con Double.parseDouble). Usa la constante PI 
 * y el m�todo pow de Math.
 */

public class Ejercicio004 {
	
	public static void main (String[] args) {
		String r;
		r = JOptionPane.showInputDialog("Introduce el valor del radio");
		double radio;
		radio = Double.parseDouble(r);
		double area;
		area = Math.PI * Math.pow(radio, 2);
		System.out.println();
		System.out.print("El valor del �rea de la circunferencia de radio "+radio+" es igual a: ");
		System.out.printf("%.2f",area);
			
	}

}

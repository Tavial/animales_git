/* 
 * Escribir un programa que pregunte al usuario por el número de horas trabajadas y el coste por hora. 
 * Después debe mostrar por pantalla la paga que le corresponde.
 */
import javax.swing.JOptionPane;
public class Ejercicio007 {
	
	public static void main (String[] args) {
		
		String teclado;
		double horas_trabajadas, precio_hora, sueldo_mensual;
		teclado = JOptionPane.showInputDialog("Introduce el número de horas trabajadas por día: ");
		horas_trabajadas = Double.parseDouble(teclado);
		teclado = JOptionPane.showInputDialog("Introduce lo que te pagan por hora: ");	
		precio_hora = Double.parseDouble(teclado);
		sueldo_mensual = (horas_trabajadas * precio_hora ) * 30;
		System.out.print("El sueldo mensual que cobras es: ");
		System.out.printf("%.2f",sueldo_mensual);
		
	}

}

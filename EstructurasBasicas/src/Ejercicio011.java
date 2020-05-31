import javax.swing.JOptionPane;

/*
 * Escribir un programa que pregunte al usuario una cantidad a invertir, el interés anual y el número de 
 * años, y muestre por pantalla el capital obtenido en la inversión.
 */
public class Ejercicio011 {
	public static void main (String[] args) {
		String entrada;
		double capital_inicial, capital_final, interes_anual, anyos;
		entrada = JOptionPane.showInputDialog("Introduce la cantidad de dinero a invertir: ");
		capital_inicial = Double.parseDouble(entrada);
		entrada = JOptionPane.showInputDialog("Introduce el interés anual: ");
		interes_anual = Double.parseDouble(entrada);
		entrada = JOptionPane.showInputDialog("Introduce el número de años: ");
		anyos = Double.parseDouble(entrada);
		capital_final = capital_inicial + ((interes_anual*anyos*capital_inicial)/100);
		System.out.print("El capital final que se obtendrá será: ");
		System.out.printf("%.2f", capital_final);	
		
	}
}

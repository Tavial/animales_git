import javax.swing.JOptionPane;

/*
 * Escribir un programa que pida al usuario su peso (en kg) y estatura (en metros), calcule el índice 
 * de masa corporal y lo almacene en una variable, y muestre por pantalla la frase Tu índice de masa 
 * corporal es <imc> donde <imc> es el índice de masa corporal calculado redondeado con dos decimales.
 */
public class Ejercicio009 {

		public static void main (String[] args) {
		
			String entrada;
			double peso, estatura, imc;
			entrada = JOptionPane.showInputDialog("Introduce tu peso en kg.: ");
			peso = Double.parseDouble(entrada);
			entrada = JOptionPane.showInputDialog("Introduce tu estatura en metros: ");
			estatura = Double.parseDouble(entrada);
			imc = peso / Math.pow(estatura,2);
			System.out.print ("Tu imc es: ");
			System.out.printf("%.2f", imc);
			
		}
}

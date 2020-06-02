import javax.swing.JOptionPane;

/*
 * Los tramos impositivos para la declaración de la renta en un determinado país son los 
 * siguientes:

Renta						Tipo impositivo
Menos de 10000€					5%
Entre 10000€ y 20000€			15%
Entre 200000€ y 35000€			20%
Entre 350000€ y 60000€			30%
Más de 60000€					45%

Escribir un programa que pregunte al usuario su renta anual y muestre por pantalla el tipo 
impositivo que le corresponde.
 */
public class Ejercicio007 {

	public static void main (String[] args) {
		
		String entrada;
		double renta_anual;
		int tipo_impositivo = 0;;
		entrada = JOptionPane.showInputDialog("Introduce tu renta anual: "); 
		if (entrada.matches("\\d+((\\.|,)\\d+)?")) {
			renta_anual = Double.parseDouble(entrada);
			if (renta_anual < 10000) {
				tipo_impositivo = 5;
			}
			else if (renta_anual >= 10000 && renta_anual < 20000) {
				tipo_impositivo = 15;
			}
			else if (renta_anual >= 20000 && renta_anual < 35000) {
				tipo_impositivo = 20;
			}
			else if (renta_anual >= 35000 && renta_anual < 60000) {
				tipo_impositivo = 30;
			}
			else if (renta_anual >= 60000) {
				tipo_impositivo = 45;
			}
			
			System.out.println ("El tipo impositivo que te corresponde es el "+tipo_impositivo+" %.");
		}
		else {
			System.out.println ("El valor introducido para el importe no tiene un rango correcto");
		}
	} //main
	
} //class

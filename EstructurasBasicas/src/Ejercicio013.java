import javax.swing.JOptionPane;

/*
 * Imagina que acabas de abrir una nueva cuenta de ahorros que te ofrece el 4% de interés al año. Estos 
 * ahorros debido a intereses, que no se cobran hasta finales de año, se te añaden al balance final de 
 * tu cuenta de ahorros. Escribir un programa que comience leyendo la cantidad de dinero depositada en 
 * la cuenta de ahorros, introducida por el usuario. Después el programa debe calcular y mostrar por 
 * pantalla la cantidad de ahorros tras el primer, segundo y tercer años. Redondear cada cantidad a dos 
 * decimales.
 */
public class Ejercicio013 {

	public static void main (String[] args) {
	
		final double interes = 0.04;
		String entrada;
		double capital_inicial, capital_primer_anyo, capital_segundo_anyo, capital_tercer_anyo;
		entrada = JOptionPane.showInputDialog("Introduce la cantidad que quieres introducir en tu nueva cuenta de ahorros");
		capital_inicial = Double.parseDouble(entrada);
		capital_primer_anyo = capital_inicial + (capital_inicial*interes);
		System.out.print ("El capital que tendrás pasado un año será: ");
		System.out.printf ("%.2f",capital_primer_anyo);
		System.out.print(" €");
		capital_segundo_anyo = capital_primer_anyo + (capital_primer_anyo*interes);
		System.out.println();
		System.out.print("El capital que tendrás pasados dos años será: ");
		System.out.printf("%.2f", capital_segundo_anyo);
		System.out.print(" €");
		capital_tercer_anyo = capital_segundo_anyo + (capital_segundo_anyo*interes);
		System.out.println();
		System.out.print("El capital que tendrás pasados tres años será: ");
		System.out.printf("%.2f",capital_tercer_anyo);
		System.out.print(" €");
		
	}
}

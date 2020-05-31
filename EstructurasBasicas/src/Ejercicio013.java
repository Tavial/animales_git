import javax.swing.JOptionPane;

/*
 * Imagina que acabas de abrir una nueva cuenta de ahorros que te ofrece el 4% de inter�s al a�o. Estos 
 * ahorros debido a intereses, que no se cobran hasta finales de a�o, se te a�aden al balance final de 
 * tu cuenta de ahorros. Escribir un programa que comience leyendo la cantidad de dinero depositada en 
 * la cuenta de ahorros, introducida por el usuario. Despu�s el programa debe calcular y mostrar por 
 * pantalla la cantidad de ahorros tras el primer, segundo y tercer a�os. Redondear cada cantidad a dos 
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
		System.out.print ("El capital que tendr�s pasado un a�o ser�: ");
		System.out.printf ("%.2f",capital_primer_anyo);
		System.out.print(" �");
		capital_segundo_anyo = capital_primer_anyo + (capital_primer_anyo*interes);
		System.out.println();
		System.out.print("El capital que tendr�s pasados dos a�os ser�: ");
		System.out.printf("%.2f", capital_segundo_anyo);
		System.out.print(" �");
		capital_tercer_anyo = capital_segundo_anyo + (capital_segundo_anyo*interes);
		System.out.println();
		System.out.print("El capital que tendr�s pasados tres a�os ser�: ");
		System.out.printf("%.2f",capital_tercer_anyo);
		System.out.print(" �");
		
	}
}

/* En una determinada empresa, sus empleados son evaluados al final de cada año. Los puntos que 
 * pueden obtener en la evaluación comienzan en 0.0 y pueden ir aumentando, traduciéndose en 
 * mejores beneficios. Los puntos que pueden conseguir los empleados pueden ser 0.0, 0.4, 0.6 o 
 * más, pero no valores intermedios entre las cifras mencionadas. A continuación se muestra una 
 * tabla con los niveles correspondientes a cada puntuación. La cantidad de dinero conseguida 
 * en cada nivel es de 2.400€ multiplicada por la puntuación del nivel.

	Nivel			Puntuación
	Inaceptable		0.0
	Aceptable		0.4
	Meritorio		0.6 o más

 * Escribir un programa que lea la puntuación del usuario e indique su nivel de rendimiento, 
 * así como la cantidad de dinero que recibirá el usuario.
*/

import java.util.Scanner;

public class Ejercicio008 {

	public static void main (String[] args) {
		Scanner entrada = new Scanner (System.in);
		String puntuacion, rendimiento = "Inaceptable";
		double dinero = 0, puntos;
		boolean error = false;
		final double base = 2400;
		System.out.println ("Introduce tu puntuación: ");
		puntuacion = entrada.nextLine();
		switch (puntuacion){
			case "0.0": 
				dinero = 0;
				rendimiento = "Inaceptable";
				break;
			case "0.4":
				dinero = base * 0.4;
				rendimiento = "Aceptable";
				break;
			case "0.6":
				dinero = base * 0.6;
				rendimiento = "Meritorio";
				break;
			default:
				puntos = Double.parseDouble(puntuacion);
				if (puntos > 0.6 && puntos <= 1){
					dinero = base * puntos;
					rendimiento = "Meritorio";
				}
				else {
					System.out.println ("El valor de los puntos introducidos no está en el rango correcto");
					error = true;
				}
		} //switch
		if (!error) {
			System.out.println ("Tu nivel de rendimiento es "+rendimiento+" y el extra de dinero que percibirás es "+dinero+" €.");
		}
		entrada.close();

		
	} //main
	
	
} //class

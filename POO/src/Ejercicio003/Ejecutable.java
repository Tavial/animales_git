package Ejercicio003;

import java.util.Scanner;

/*
 * Hacer una clase llamada Persona que siga las siguientes condiciones:
 * 
 * Sus atributos son: nombre, edad, DNI, sexo (H hombre, M mujer), peso y altura. No queremos que 
 * se accedan directamente a ellos. Hay que pensar que modificador de acceso es el más adecuado, 
 * también su tipo. Si quieres añadir algún atributo puedes hacerlo.
 * 
 * Por defecto, todos los atributos menos el DNI serán valores por defecto según su tipo (0 
 * números, cadena vacía para String, etc.). Sexo sera hombre por defecto, usar una constante 
 * para ello.
 * 
 *  Se implantaran varios constructores:
 *  . Un constructor por defecto.
 *  . Un constructor con el nombre, edad y sexo, el resto por defecto.
 *  . Un constructor con todos los atributos como parámetro.
 *  
 *  Los métodos que se implementaran son:
 *  
 *  . calcularIMC(): calculara si la persona esta en su peso ideal (peso en kg/(altura^2  en m)),
 *   si esta fórmula devuelve un valor menor que 20, la función devuelve un -1, si devuelve un 
 *   número entre 20 y 25 (incluidos), significa que esta por debajo de su peso ideal la función 
 *   devuelve un 0  y si devuelve un valor mayor que 25 significa que tiene sobrepeso, la función 
 *   devuelve un 1.
 *   
 *   
 * . esMayorDeEdad(): indica si es mayor de edad, devuelve un booleano.
 * 
 * 
 * . toString(): devuelve toda la información del objeto.
 * 
 * . generaDNI(): genera un número aleatorio de 8 cifras, genera a partir de este su número su 
 * letra correspondiente. Este método sera invocado cuando se construya el objeto. Se puede 
 * dividir el método para que te sea más fácil. No será visible al exterior.
 * 
 * . Métodos set de cada parámetro, excepto de DNI.
 * 
 * Tenemos también que crear una clase ejecutable que haga lo siguiente:
 * 
 * . Pide por teclado el nombre, la edad, sexo, peso y altura.
 * . Crea 3 objetos de la clase anterior, el primer objeto obtendrá las anteriores variables 
 * pedidas por teclado, el segundo objeto obtendrá todos los anteriores menos el peso y la altura 
 * y el último por defecto, para este último utiliza los métodos set para darle a los atributos 
 * un valor.
 * 
 * . Para cada objeto, deberá comprobar si esta en su peso ideal, tiene sobrepeso o por debajo de 
 * su peso ideal con un mensaje.
 * 
 * . Indicar para cada objeto si es mayor de edad.
 * 
 * . Por último, mostrar la información de cada objeto.
 * 
 * Se pueden usar métodos en la clase ejecutable, para que sea mas fácil.
 */

public class Ejecutable {
	
	public static void main (String [] args ) {
		String cadena, nombre;
		char sexo = 'H';
		int edad;
		double peso = 0, altura = 0; 
		Scanner entrada = new Scanner (System.in);
		do {
			System.out.println ("Introduce el nombre de la persona: ");
			nombre = entrada.nextLine();
		} while (!nombre.matches("[a-zA-ZÀ-ÿ\\u00f1\\u00d1]+(\\s*[a-zA-ZÀ-ÿ\\u00f1\\u00d1]*)*[a-zA-ZÀ-ÿ\\u00f1\\u00d1]+"));
		do {
			System.out.println ("Introduce el género: (H / M )");
			cadena = entrada.nextLine().toUpperCase();
		} while (!cadena.matches("[H|M]"));
		if (cadena.equals("H")) {
			sexo = 'H';
		}
		else {
			if (cadena.equals("M"))  {
				sexo = 'M';
			}
		}
		do {
			System.out.println ("Introduce la edad: ");
			cadena = entrada.nextLine();
		} while (!cadena.matches("[0-9]+"));
		edad = Integer.parseInt(cadena);
		do {
			System.out.println ("Introduce la altura en metros: ");
			cadena = entrada.nextLine();
		} while (!cadena.matches("\\d+((\\.)\\d+)?"));
		altura = Double.parseDouble(cadena);
		if (altura < 0.54) { 
			System.out.println ("La persona más baja de la historia medía 54.6 centímetros. ¿¿vas a entrar en el Guinness?? ");
		}
		else {
			if (altura > 2.72) {
				System.out.println ("La persona más alta de la historia medía 2.72 metros. ¿¿vas a entrar en el Guinness?? ");
			}
			else {
				do {
					System.out.println ("Introduce el peso en kg: ");
					cadena = entrada.nextLine();
				} while (!cadena.matches("\\d+((\\.)\\d+)?"));
				peso = Double.parseDouble(cadena);
				
				if (peso > 635) {
					System.out.println ("635 kg era el peso de la persona más pesaba de la historia. ¿¿vas a entrar en el Guinness?? ");
				}
				else {
					if (peso == 0) {
						System.out.println ("Algo tendrás que pesar ¿no? ");
					}
					else {
						
					}
			
				}
			}
		} 

		Persona persona1 = new Persona (nombre, edad, sexo, peso, altura);
		Persona persona2 = new Persona (nombre, edad, sexo);
		Persona persona3 = new Persona ();
		System.out.println();	
		System.out.println (persona1.toString()); 
		
		if(persona1.esMayorDeEdad()) {
			System.out.println ("Es mayor de edad");
		}
		else {
			System.out.println ("Es menor de edad");
		}
		
		if (persona1.calcularIMC()==-1) {
			System.out.println ("Tiene un peso bajo");
		}
		else {
			if (persona1.calcularIMC()==0) {
				System.out.println ("Está en normopeso");
			}
			else {
				if (persona1.calcularIMC()==1) {
					System.out.println ("Tiene sobrepeso");
				}
			}
		}
		
		System.out.println();
		persona2.establecerPeso(45);
		persona2.establecerAltura(1.75);
		System.out.println (persona2.toString());
		
		if(persona2.esMayorDeEdad()) {
			System.out.println ("Es mayor de edad");
		}
		else {
			System.out.println ("Es menor de edad");
		}
		
		if (persona2.calcularIMC()==-1) {
			System.out.println ("Tiene un peso bajo");
		}
		else {
			if (persona2.calcularIMC()==0) {
				System.out.println ("Está en normopeso");
			}
			else {
				if (persona2.calcularIMC()==1) {
					System.out.println ("Tiene sobrepeso");
				}
			}
		}
		
		
		System.out.println();
		persona3.establecerNombre("Alfredo");
		persona3.establecerEdad(17);
		persona3.establecerSexo('H');
		persona3.establecerPeso(110);
		persona3.establecerAltura(1.79);
		System.out.println (persona3.toString());
		
		if(persona3.esMayorDeEdad()) {
			System.out.println ("Es mayor de edad");
		}
		else {
			System.out.println ("Es menor de edad");
		}
		
		if (persona3.calcularIMC()==-1) {
			System.out.println ("Tiene un peso bajo");
		}
		else {
			if (persona3.calcularIMC()==0) {
				System.out.println ("Está en normopeso");
			}
			else {
				if (persona3.calcularIMC()==1) {
					System.out.println ("Tiene sobrepeso");
				}
			}
		}
		
		entrada.close();
		
	}

}

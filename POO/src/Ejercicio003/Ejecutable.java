package Ejercicio003;

import java.util.Scanner;

/*
 * Hacer una clase llamada Persona que siga las siguientes condiciones:
 * 
 * Sus atributos son: nombre, edad, DNI, sexo (H hombre, M mujer), peso y altura. No queremos que 
 * se accedan directamente a ellos. Hay que pensar que modificador de acceso es el m�s adecuado, 
 * tambi�n su tipo. Si quieres a�adir alg�n atributo puedes hacerlo.
 * 
 * Por defecto, todos los atributos menos el DNI ser�n valores por defecto seg�n su tipo (0 
 * n�meros, cadena vac�a para String, etc.). Sexo sera hombre por defecto, usar una constante 
 * para ello.
 * 
 *  Se implantaran varios constructores:
 *  . Un constructor por defecto.
 *  . Un constructor con el nombre, edad y sexo, el resto por defecto.
 *  . Un constructor con todos los atributos como par�metro.
 *  
 *  Los m�todos que se implementaran son:
 *  
 *  . calcularIMC(): calculara si la persona esta en su peso ideal (peso en kg/(altura^2  en m)),
 *   si esta f�rmula devuelve un valor menor que 20, la funci�n devuelve un -1, si devuelve un 
 *   n�mero entre 20 y 25 (incluidos), significa que esta por debajo de su peso ideal la funci�n 
 *   devuelve un 0  y si devuelve un valor mayor que 25 significa que tiene sobrepeso, la funci�n 
 *   devuelve un 1.
 *   
 *   
 * . esMayorDeEdad(): indica si es mayor de edad, devuelve un booleano.
 * 
 * 
 * . toString(): devuelve toda la informaci�n del objeto.
 * 
 * . generaDNI(): genera un n�mero aleatorio de 8 cifras, genera a partir de este su n�mero su 
 * letra correspondiente. Este m�todo sera invocado cuando se construya el objeto. Se puede 
 * dividir el m�todo para que te sea m�s f�cil. No ser� visible al exterior.
 * 
 * . M�todos set de cada par�metro, excepto de DNI.
 * 
 * Tenemos tambi�n que crear una clase ejecutable que haga lo siguiente:
 * 
 * . Pide por teclado el nombre, la edad, sexo, peso y altura.
 * . Crea 3 objetos de la clase anterior, el primer objeto obtendr� las anteriores variables 
 * pedidas por teclado, el segundo objeto obtendr� todos los anteriores menos el peso y la altura 
 * y el �ltimo por defecto, para este �ltimo utiliza los m�todos set para darle a los atributos 
 * un valor.
 * 
 * . Para cada objeto, deber� comprobar si esta en su peso ideal, tiene sobrepeso o por debajo de 
 * su peso ideal con un mensaje.
 * 
 * . Indicar para cada objeto si es mayor de edad.
 * 
 * . Por �ltimo, mostrar la informaci�n de cada objeto.
 * 
 * Se pueden usar m�todos en la clase ejecutable, para que sea mas f�cil.
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
		} while (!nombre.matches("[a-zA-Z�-�\\u00f1\\u00d1]+(\\s*[a-zA-Z�-�\\u00f1\\u00d1]*)*[a-zA-Z�-�\\u00f1\\u00d1]+"));
		do {
			System.out.println ("Introduce el g�nero: (H / M )");
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
			System.out.println ("La persona m�s baja de la historia med�a 54.6 cent�metros. ��vas a entrar en el Guinness?? ");
		}
		else {
			if (altura > 2.72) {
				System.out.println ("La persona m�s alta de la historia med�a 2.72 metros. ��vas a entrar en el Guinness?? ");
			}
			else {
				do {
					System.out.println ("Introduce el peso en kg: ");
					cadena = entrada.nextLine();
				} while (!cadena.matches("\\d+((\\.)\\d+)?"));
				peso = Double.parseDouble(cadena);
				
				if (peso > 635) {
					System.out.println ("635 kg era el peso de la persona m�s pesaba de la historia. ��vas a entrar en el Guinness?? ");
				}
				else {
					if (peso == 0) {
						System.out.println ("Algo tendr�s que pesar �no? ");
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
				System.out.println ("Est� en normopeso");
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
				System.out.println ("Est� en normopeso");
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
				System.out.println ("Est� en normopeso");
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

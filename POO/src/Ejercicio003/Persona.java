package Ejercicio003;

import java.util.Random;

public class Persona {

	// Propiedades
	private String nombre;
	private int edad;
	private String DNI;
	private char sexo;
	private double peso;
	private double altura;
	
	// Constructores
	
	public Persona () {
		nombre ="";
		edad = 0;
		DNI = this.generaDNI();
		sexo='H';
		peso = 0;
		altura = 0;
	}
	
	public Persona (String nombre, int edad, char sexo) {
		this.nombre = nombre;
		this.edad = edad;
		this.sexo=sexo;
		DNI = this.generaDNI();
		peso = 0;
		altura = 0;
	}
	
	public Persona (String nombre, int edad, char sexo, double peso, double altura) {
		this.nombre = nombre;
		this.edad = edad;
		this.DNI = this.generaDNI();;
		this.sexo=sexo;
		this.peso = peso;
		this.altura = altura;
	}
	
	//Métodos
	
	public int calcularIMC () {
		final double imc = this.peso / Math.pow(this.altura,2);
		int valor = 0;
		if (imc < 20) { //peso bajo
			valor = -1;
		}
		else {
			if (imc >= 20 && imc <= 25) { //normopeso
				valor = 0; 
			}
			else {
				if (imc > 25) { //sobrepeso
					valor = 1;
				}
			}
		}
		return valor;
	}
	
	public boolean esMayorDeEdad () {
		if (edad >= 18) {
			return true;
		}
		else {
			return false;
		}	
	}

	public String toString () {
		return "Nombre: "+nombre+"\n Edad: "+edad+"\n DNI: "+DNI+"\n Sexo: "+sexo+"\n Peso: "+peso+"\n Altura: "+altura;
	}
	
	public String calcularLetra (String documento) {
		int dni, resto;
		String letra;
		dni = Integer.parseInt(documento);
		resto = dni % 23;
		switch (resto) {
		
			case 0: letra = "T"; break;
			case 1: letra = "R"; break;
			case 2: letra = "W"; break;
			case 3: letra = "A"; break;
			case 4: letra = "G"; break;
			case 5: letra = "M"; break;
			case 6: letra = "Y"; break;
			case 7: letra = "F"; break;
			case 8: letra = "P"; break;
			case 9: letra = "D"; break;
			case 10: letra = "X"; break;
			case 11: letra = "B"; break;
			case 12: letra = "N"; break;
			case 13: letra = "J"; break;
			case 14: letra = "Z"; break;
			case 15: letra = "S"; break;
			case 16: letra = "Q"; break;
			case 17: letra = "V"; break;
			case 18: letra = "H"; break;
			case 19: letra = "L"; break;
			case 20: letra = "C"; break;
			case 21: letra = "K"; break;
			case 22: letra = "E"; break;
			default: 
				letra = "";
		}
		
		return letra;
	}
	
	private String generaDNI() {
		String letra;
		String documento="";
		Random aleatorio = new Random();
		int valor;
		String [] dni = new String [9];
		for (int i=0; i<8; i++) {
			valor = aleatorio.nextInt(10);
			documento = documento +Integer.toString(valor);
			dni [i]=Integer.toString(valor) ;
		}	
		letra = calcularLetra(documento);
		documento = documento + letra;
		return documento;
		
	}
	
	public void establecerPeso(double peso) {
		this.peso = peso;
	}
	
	public void establecerAltura (double altura) {
		this.altura = altura;
	}
	
	public void establecerEdad (int edad) {
		this.edad = edad;
	}
	
	public void establecerSexo (char sexo) {
		this.sexo = sexo; 
	}
	
	public void establecerNombre(String nombre) {
		this.nombre = nombre; 
	}
	
	
	
}

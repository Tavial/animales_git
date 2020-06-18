package Ejercicio010;

public class Conversor {
	
	private int decimal;
	private String binario;
	
	// Constructores
	public Conversor (int numero_decimal) {
		
		decimal = numero_decimal;
	}
	public Conversor (String numero_binario) {
		binario = numero_binario;
	}
	
	public String deDecimalABinario () {
		String resultado_binario="";
		int dividendo, divisor = 2, cociente, resto;
		dividendo = decimal;
		cociente = dividendo / divisor;
		resto = dividendo % divisor;
		resultado_binario = resto+resultado_binario;
		while (cociente >= 1 ) {
			dividendo = cociente;
			cociente = dividendo / divisor;
			resto = dividendo % divisor;
			resultado_binario = resto+resultado_binario;	
		}
		return resultado_binario;
	}
	
	public double deBinarioADecimal() {
		
		String [] array;
		double elemento;
		double resultado_binario = 0;
		double potencia = this.binario.length()-1;
		array = this.binario.split("");
		for (int i=0; i<this.binario.length(); i++) {
			elemento = Double.parseDouble (array[i]);
			resultado_binario = resultado_binario + (Math.pow(2, potencia)*elemento);
			potencia--;
		}
		return resultado_binario;
	
		
		
	}
	
}

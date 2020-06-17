package Ejercicio003;

public class Calculo {

	//propiedades
	
	private int numero;
	
	//constructor
	
	public Calculo (int numero) {
		
		this.numero = numero;
	}
	
	//getter
	
	public int factorial() {
		int acumulado = 1;
		for (int i=this.numero; i >= 1; i--) {
			acumulado = acumulado*i;
		}
		return acumulado;
	}
	
	
}

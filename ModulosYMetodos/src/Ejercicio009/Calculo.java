package Ejercicio009;

public class Calculo {
	
	private int numero1;
	private int numero2;
	
	public Calculo (int num1, int num2) {
		this.numero1 = num1;
		this.numero2 = num2;	
	}
	
	public int maximoComunDivisor(){
		int dividendo, divisor,resto, cociente, MCD=1;
		if (this.numero1 >= this.numero2) {
			dividendo = numero1;
			divisor = numero2;
			cociente = numero1 / numero2;
			resto = numero1 % numero2;
		}
		else {
			dividendo = numero2;
			divisor = numero1;
			cociente = numero2 / numero1;
			resto = numero2 % numero1;
		}
		while (resto >= 1) {
			dividendo = divisor;
			divisor = resto;
			cociente = dividendo / divisor;
			resto = dividendo % divisor;
		}
		MCD = divisor;
		return MCD;
	}
	
	public int minimoComunMultiplo(){
		int MCD, mcm;
		MCD = this.maximoComunDivisor();
		mcm = (this.numero1 * this.numero2) / MCD;
		return mcm;
		
	}


}

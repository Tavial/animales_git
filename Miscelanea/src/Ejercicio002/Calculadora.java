package Ejercicio002;

public class Calculadora {
	
	// propiedad
	
	private int numero;
	
	public Calculadora (int numero) {
		this.numero = numero;	
	}
	
	public void CalculoSeno () {
		System.out.println ("======================");
		System.out.println (" Cálculo seno("+this.numero+")");
		System.out.println ("======================");
		System.out.println ();
		for (int i=1; i<=this.numero; i++) {
			System.out.println (" sen("+i+") = "+Math.sin(i)+" radianes");
		}
		System.out.println ("======================");
	}
	
	public void CalculoCoseno () {
		System.out.println ("======================");
		System.out.println (" Cálculo coseno("+this.numero+")");
		System.out.println ("======================");
		System.out.println ();
		for (int i=1; i<=this.numero; i++) {
			System.out.println (" cos("+i+") = "+Math.cos(i)+" radianes");
		}
		System.out.println ("======================");
	}
	
	public void CalculoTangente () {
		System.out.println ("======================");
		System.out.println (" Cálculo tang("+this.numero+")");
		System.out.println ("======================");
		System.out.println ();
		for (int i=1; i<=this.numero; i++) {
			System.out.println (" tangente("+i+") = "+Math.tan(i)+" radianes");
		}
		System.out.println ("======================");
	}
	
	public void CalculoExponencial () {
		System.out.println ("======================");
		System.out.println (" Cálculo Exp("+this.numero+")");
		System.out.println ("======================");
		System.out.println ();
		for (int i=1; i<=this.numero; i++) {
			System.out.println (" exp("+i+") = "+Math.exp(i));
		}
		System.out.println ("======================");
	}
	
	public void CalculoNeperiano () {
		System.out.println ("======================");
		System.out.println (" Cálculo Ln("+this.numero+")");
		System.out.println ("======================");
		System.out.println ();
		for (int i=1; i<=this.numero; i++) {
			System.out.println (" Ln("+i+") = "+Math.log(i));
		}
		System.out.println ("======================");
	}
	
	
	
}

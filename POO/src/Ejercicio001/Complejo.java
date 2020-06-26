package Ejercicio001;

public class Complejo {
	
	private double parte_real;
	private double parte_imaginaria;
	
	public Complejo () {
		this.parte_real = 0;
		this.parte_imaginaria = 0;
	}
	
	public Complejo (double a, double b) {
		this.parte_real = a;
		this.parte_imaginaria = b;
	}
	
	public String print (Complejo z) {
		if (z.parte_imaginaria >= 0) {
			if (z.parte_imaginaria == 1) {
				return z.parte_real+" + "+"i";
			}
			else {
				return z.parte_real+" + "+z.parte_imaginaria+"i";
			}	
		}
		else {
			return z.parte_real+" "+z.parte_imaginaria+"i";
		}
	}
		
	public Complejo sumaComplejos (Complejo z1, Complejo z2) {
		Complejo z3 = new Complejo ();
		z3.parte_real = z1.parte_real + z2.parte_real;
		z3.parte_imaginaria = z1.parte_imaginaria + z2.parte_imaginaria;
		return z3;
	}
	
	public Complejo restaComplejos (Complejo z1, Complejo z2) {
		Complejo z3 = new Complejo ();
		z3.parte_real = z1.parte_real - z2.parte_real;
		z3.parte_imaginaria = z1.parte_imaginaria - z2.parte_imaginaria;
		return z3;
	}
	
	public Complejo productoComplejos (Complejo z1, Complejo z2) {
		Complejo z3 = new Complejo ();
		z3.parte_real = (z1.parte_real * z2.parte_real)-(z1.parte_imaginaria * z2.parte_imaginaria);
		z3.parte_imaginaria = (z1.parte_real*z2.parte_imaginaria)+(z1.parte_imaginaria*z2.parte_real);
		return z3;	
	}
	
	public Complejo divisionComplejos (Complejo z1, Complejo z2) {
		Complejo z3 = new Complejo ();
		z3.parte_real = ((z1.parte_real*z2.parte_real) + (z1.parte_imaginaria * z2.parte_imaginaria)) / (Math.pow(z2.parte_real,2)+Math.pow(z2.parte_imaginaria, 2));
		z3.parte_imaginaria = ((z1.parte_imaginaria*z2.parte_real) - (z1.parte_real*z2.parte_imaginaria)) / (Math.pow(z2.parte_real,2)+Math.pow(z2.parte_imaginaria, 2));
		return z3;
	}	
	
	public double moduloComplejo (Complejo z1) {
		return Math.sqrt(Math.pow(z1.parte_real, 2) + Math.pow(z1.parte_imaginaria, 2));
	
	}
	
	public double argumentoComplejo (Complejo z1) {
		return ((Math.atan2(z1.parte_imaginaria,z1.parte_real))*180) / Math.PI;
	
	}
	
}

package Ejercicio002;

public class Cuenta {

	
	private String titular;
	private double cantidad;
	
	public Cuenta (String titular) {
		this.titular = titular;
		cantidad = 0;
	}
	
	public Cuenta (String titular, double cantidad) {
		this.titular = titular;
		this.cantidad = cantidad;
	}
	
	public String mostrarTitular() {
		return this.titular;
	}
	
	public double mostrarCantidad () {
		return this.cantidad;
	}
	
	public void ingresar (double cantidad) {
		if (cantidad >= 0) {
			this.cantidad += cantidad;
		}
	}
	
	public void retirar (double cantidad) {
		this.cantidad -= cantidad;
		if (this.cantidad < 0) {
			this.cantidad = 0;
		}
		
	}
}

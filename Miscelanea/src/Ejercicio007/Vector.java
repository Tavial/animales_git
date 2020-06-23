package Ejercicio007;

public class Vector {
	
	private double componenteX;
	private double componenteY;
	
	public Vector (double x, double y) {
		this.componenteX = x;
		this.componenteY = y;
	}
	
	public double mostrarComponenteX () {
		return this.componenteX;
	}
	
	public double mostrarComponenteY () {
		return this.componenteY;
	}
	
	public double moduloVector () {
		double modulo;
		modulo = Math.sqrt(Math.pow (componenteX,2)+Math.pow(componenteY, 2));
		return modulo;
	}		
	

}

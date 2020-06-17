package Ejercicio004;

public class Factura {

	// propiedades
	private double importe;
	private double iva;
	
	// constructores
	public Factura (double importe, double iva) {
		this.importe = importe;
		this.iva = iva;
	}
	public Factura (double importe) {
		this.importe = importe;
		this.iva = 0;
	}
	
	public double importeTotal () {
		double importe_total;
		importe_total = this.importe+(this.iva / 100 * this.importe);
		return importe_total;
	}
	
}

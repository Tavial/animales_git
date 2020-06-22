package Ejercicio001;

public class ListaCompra {
	
	private double precio_final; 
	private final double precio_inicial;
	private double iva;
	private double descuento;
	private ListaCompra sig;
	
	public ListaCompra (double precio, double iva, double descuento) {
		this.precio_final = precio;
		this.precio_inicial = precio;
		this.iva = iva;
		this.descuento = descuento;
		this.sig = null;
	}
	
	public double mostrarPrecioInicial () {
		return this.precio_inicial;
	}
	
	public double mostrarIVA () {
		return this.iva;
	}
	
	public double mostrarDescuento () {
		return this.descuento;
	}
	
	
	public double mostrarPrecioFinal () {
		return this.precio_final;
	}
	
	
	
	public double calculoIVA (ListaCompra cesta) {
		double precio_con_iva=0;
		while (cesta != null) {
			precio_con_iva = precio_con_iva + cesta.precio_final+(cesta.precio_final*cesta.iva/100);
			cesta = cesta.sig;
		}	
		return precio_con_iva;
	}
	
	public double calculoDescuento (ListaCompra cesta) {
		double precio_con_descuento=0;
		while (cesta != null) {
			precio_con_descuento = precio_con_descuento + cesta.precio_final-(cesta.precio_final*cesta.descuento/100);
			cesta = cesta.sig;
		}
		
		return precio_con_descuento;
	}
	
	public void agregarProducto (double precio, double iva, double descuento, ListaCompra cesta) {
		if (cesta==null) {
			ListaCompra producto = new ListaCompra (precio, iva, descuento);
			cesta = producto;
		}
		else {
			while (cesta.sig != null) {
				cesta = cesta.sig;
			}
			ListaCompra producto = new ListaCompra (precio, iva, descuento);
			cesta.sig = producto;
		}
	}
	
	public void mostrarCesta (ListaCompra cesta) {
		while (cesta != null) {
			System.out.println ("Precio: "+cesta.precio_final+"€ - IVA: "+cesta.iva+"% - Descuento: "+cesta.descuento+"%");
			cesta = cesta.sig;
		}
	}
	

	
	

}

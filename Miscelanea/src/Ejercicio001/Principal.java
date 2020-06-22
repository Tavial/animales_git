package Ejercicio001;

public class Principal {
	
	public static void main (String[] args) {
		
		double descuento, iva;
		
		ListaCompra producto1 = new ListaCompra (24,7,5);
		ListaCompra producto2 = new ListaCompra (425,21,10);
		
		descuento = producto1.calculoDescuento(producto1);
		iva = producto2.calculoIVA(producto2);
		
		System.out.println ("El producto de precio inicial "+producto1.mostrarPrecioInicial()+" aplicándole un descuento del "+producto1.mostrarDescuento()+"%, tiene un precio final de "+descuento);
		System.out.println ("El producto de precio inicial "+producto2.mostrarPrecioInicial()+" aplicándole un IVA del "+producto2.mostrarIVA()+"%, tiene un precio final de "+iva);
		
		ListaCompra cesta = new ListaCompra (24,7,5);
		cesta.agregarProducto(425,21,10,cesta);
		cesta.agregarProducto(24.50,14,1,cesta);
		cesta.agregarProducto(22.95,7,3,cesta);
		cesta.agregarProducto(28.50,14,10,cesta);
		cesta.agregarProducto(21.90,14,1,cesta);
		cesta.agregarProducto(9.95,7,3,cesta);
		cesta.agregarProducto(37.49,14,10,cesta);
		cesta.agregarProducto(2.99,7,1,cesta);
		cesta.agregarProducto(13.50,14,3,cesta);
		cesta.agregarProducto(21.90,14,10,cesta);
		cesta.agregarProducto(74.99,21,15,cesta);
		cesta.agregarProducto(9.95,7,5,cesta);
		
		cesta.mostrarCesta(cesta);
		
		descuento = cesta.calculoDescuento(cesta);
		iva = cesta.calculoIVA(cesta);
		
		System.out.println ("La cesta aplicándole el descuento a cada producto tiene un precio final de "+descuento);
		System.out.println ("La cesta aplicándole el iva a cada producto tiene un precio final de "+iva);	
		
	}
}

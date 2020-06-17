package Ejercicio004;

import javax.swing.JOptionPane;

/*
 * Escribir una funci�n que calcule el total de una factura tras aplicarle el IVA. La 
 * funci�n debe recibir la cantidad sin IVA y el porcentaje de IVA a aplicar, y devolver el 
 * total de la factura. Si se invoca la funci�n sin pasarle el porcentaje de IVA, deber� 
 * aplicar un 21%.
 */

public class Principal {
	public static void main (String[] args) {
		String importe_introducido, iva_introducido;
		double importe, iva, importe_total;
		Factura factura;
		do {
			importe_introducido = JOptionPane.showInputDialog("Introduce el importe de la factura sin IVA: ");
		} while (!importe_introducido.matches("\\d+((\\.)\\d+)?"));
		importe = Double.parseDouble(importe_introducido);
		do {
			iva_introducido = JOptionPane.showInputDialog("Introduce el IVA que se le va a aplicar. Si va sin IVA introducir 0: ");
		} while (!iva_introducido.matches("\\d+((\\.)\\d+)?"));
		iva = Double.parseDouble(iva_introducido);
		if (iva == 0) {
			factura = new Factura(importe);			
		}
		else {
			factura = new Factura(importe,iva);
		}
		importe_total = factura.importeTotal();
		System.out.println ("El importe total de la factura de "+importe+"� incluyendo el "+iva+"% de IVA es: "+importe_total+" �");
		
		
		
		
	}
}

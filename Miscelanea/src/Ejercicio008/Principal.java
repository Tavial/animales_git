package Ejercicio008;

/*
 * Una inmobiliaria de una ciudad maneja una lista de inmuebles como la siguiente:
 * 
 * "a�o": 2000, "metros":100, "habitaciones":3, "garaje": True, "zona":"A"
 * "a�o": 2012, "metros":60, "habitaciones":2, "garaje": True, "zona":"B"
 * "a�o": 1980, "metros":120, "habitaciones":4, "garaje": False, "zona":"A"
 * "a�o": 2005, "metros":75, "habitaciones":3, "garaje": True, "zona":"B"
 * "a�o": 2015, "metros":90, "habitaciones":2, "garaje": False, "zona":"A"
 * 
 * 
 * Construir una funci�n que permita hacer b�squeda de inmuebles en funci�n de un presupuesto 
 * dado. La funci�n recibir� como entrada la lista de inmuebles y un precio, y devolver� otra 
 * lista con los inmuebles cuyo precio sea menor o igual que el dado. Los inmuebles de la lista 
 * que se devuelva deben incorporar un nuevo par a cada diccionario con el precio del inmueble, 
 * donde el precio de un inmueble se calcula con las siguiente f�rmula en funci�n de la zona:

 * Zona A: precio = (metros * 1000 + habitaciones * 5000 + garaje * 15000) * (1-antiguedad/100)
 * Zona B: precio = (metros * 1000 + habitaciones * 5000 + garaje * 15000) * (1-antiguedad/100) * 1.5
 * 
 */

public class Principal {
	
	public static void main (String [] args) {
		ListaPisos listado = new ListaPisos (2000,100,3,true,'A');
		listado.agregarPiso(listado, 2000, 60, 2, true, 'B');
		listado.agregarPiso(listado, 1980, 120, 4, false, 'A');
		listado.agregarPiso(listado, 2005, 75, 3, true, 'B');
		listado.agregarPiso(listado, 2015, 90, 2, false, 'A');
		
		listado.mostrarPisos(listado, 150000);
	}

}

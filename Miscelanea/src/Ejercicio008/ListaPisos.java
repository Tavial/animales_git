package Ejercicio008;

public class ListaPisos {

		private int anyo;
		private int metros;
		private int habitaciones;
		private boolean garaje;
		private char zona;
		private double precio;
		private ListaPisos sig;
	
		public ListaPisos (int anyo, int metros, int habitaciones, boolean garaje, char zona) {
			
			this.anyo = anyo;
			this.metros = metros; 
			this.habitaciones = habitaciones;
			this.garaje = garaje;
			this.zona = zona;
			this.precio = this.precioPiso ();
			sig = null;		
		}
		
		public double precioPiso () {
			double importe;
			int antiguedad = 2020 - this.anyo; 
			if (this.zona =='A') { // el inmueble está en la zona A
				if (this.garaje) {
					importe = (this.metros*1000+this.habitaciones*5000+15000) * (1-antiguedad/100);
				}
				else { // el inmueble no tiene garaje
					importe = (this.metros*1000+this.habitaciones*5000) * (1-antiguedad/100);
				}
			}
			else {
				if (this.garaje) {
					importe = (this.metros*1000+this.habitaciones*5000+15000) * (1-antiguedad/100)*1.5;
				}
				else { // el inmueble no tiene garaje
					importe = (this.metros*1000+this.habitaciones*5000) * (1-antiguedad/100)*1.5;
				}	
			}
			return importe;
		}
		
		public void agregarPiso (ListaPisos listado, int anyo, int metros, int habitaciones, boolean garaje, char zona) {
			
			if (listado == null) {
				ListaPisos piso = new ListaPisos (anyo,metros,habitaciones,garaje,zona);
				listado = piso;
			}
			else {
				while (listado.sig != null) {
					listado = listado.sig;
				}
				ListaPisos piso = new ListaPisos (anyo,metros,habitaciones,garaje,zona);
				listado.sig = piso;
					
			}
			
		}
		
		public void mostrarPisos (ListaPisos listado, double precio) {
			while (listado!=null) {
				if (listado.precio <= precio) {
					if (listado.garaje) {
						System.out.println ("Precio "+listado.precio+" €. Piso en venta en Zona "+listado.zona+". El inmueble es del año "+listado.anyo+" con "+listado.metros+" m2 y "+listado.habitaciones+" habitaciones. Plaza de garaje incluida en el precio.");
					}
					else {
						System.out.println ("Precio "+listado.precio+" €. Piso en venta en Zona "+listado.zona+". El inmueble es del año "+listado.anyo+" con "+listado.metros+" m2 y "+listado.habitaciones+" habitaciones. Sin plaza de garaje.");
					}	
				}
				listado = listado.sig;
			}
		}
		
		
}

package Ejercicio004;

public class ListaEnlazada {

	private double nota;
	private String calificacion;
	private ListaEnlazada sig;
	
	public ListaEnlazada (double nota) {
		this.nota = nota;
		this.calificacion = establecerCalificacion();
		this.sig = null;
	}
	
	public String establecerCalificacion() {
		String calificacion;
		if (this.nota >= 0 && this.nota <=2.5) {
			calificacion = "Muy Deficiente";
		}
		else {
			if (this.nota > 2.5 && this.nota < 4.5) {
				calificacion = "Insuficiente";
			}
			else {
				if (this.nota >=4.5 && this.nota < 5) {
					calificacion = "Insuficiente compensable";
				}
				else {
					if (this.nota >=5 && this.nota < 6)  {
						calificacion = "Suficiente";
					}
					else {
						if (this.nota >=6 && this.nota <7) {
							calificacion = "Bien";
						}
						else {
							if (this.nota >= 7 && this.nota <9) {
								calificacion = "Notable";
							}
							else {
								if (this.nota >=9 && this.nota <10) {
									calificacion = "Sobresaliente";
								}
								else {
									if (this.nota == 10) {
										calificacion = "Matrícula de Honor";
									}
									else {
										calificacion = "Nota incorrecta";
									}
								}
							}
						}
					}
				}
			}
		}
		return calificacion;
	} // establecerCalificacion
	
	public void agregarNota (double nota, ListaEnlazada listaNotas) {
		if (listaNotas == null) {
			ListaEnlazada nodo = new ListaEnlazada (nota);
			listaNotas = nodo;
		}
		else {
			while (listaNotas.sig != null) {
				listaNotas = listaNotas.sig;
			}
			ListaEnlazada nodo = new ListaEnlazada (nota);
			listaNotas.sig = nodo;
		}
	}
	
	public void mostarListaNotas (ListaEnlazada listaNotas) {
		while (listaNotas != null) {
			System.out.println ("Nota: "+listaNotas.nota+" - Calificación: "+listaNotas.calificacion);
			listaNotas = listaNotas.sig;
		}
	}
	
} // class

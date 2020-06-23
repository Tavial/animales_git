package Ejercicio006;

/* Escribir una función reciba un diccionario con las asignaturas y las notas de un alumno y 
 * devuelva otro diccionario con las asignaturas en mayúsculas y las calificaciones 
 * correspondientes a las notas aprobadas.
 */

public class Diccionario {
	
	private String asignatura;
	private double nota;
	private String calificacion;
	private Diccionario sig;
	
	public Diccionario (String asignatura, double nota) {
		this.asignatura = asignatura;
		this.nota = nota;
		this.calificacion = this.calcularCalificacion ();
		this.sig = null;
	}
	
	public String calcularCalificacion () {
		String calificacion;
		if (this.nota >= 0 && this.nota < 2.5) {
			calificacion = "Muy deficiente";
		}
		else {
			if (this.nota >= 2.5 && this.nota < 4.5) {
				calificacion = "Insuficiente";
			}
			else {
				if (this.nota >= 4.5 && this.nota < 5) {
					calificacion = "Insuficiente compensable";
				}
				else {
					if (this.nota >= 5 && this.nota < 6) {
						calificacion = "Suficiente";
					}
					else {
						if (this.nota >= 6 && this.nota <7) {
							calificacion = "Bien";
						}
						else {
							if (this.nota >=7 && this.nota <9) {
								calificacion = "Notable";
							}
							else {
								if(this.nota >=9 && this.nota <10) {
									calificacion = "Sobresaliente";
								}
								else {
									if (this.nota ==10) {
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
	}
	
	public void agregarAsignatura (Diccionario boletinNotas, String asignatura, double nota ) {
		if (boletinNotas == null) {
			Diccionario nodo = new Diccionario (asignatura,nota);
			boletinNotas = nodo;
		}
		else {
			while (boletinNotas.sig != null) {
				boletinNotas = boletinNotas.sig;
			}
			Diccionario nodo = new Diccionario (asignatura,nota);
			boletinNotas.sig = nodo;
		}
	}
	
	public void mostrarBoletin (Diccionario boletinNotas) {
		while (boletinNotas != null) {
			if (boletinNotas.nota >=5  && !boletinNotas.calificacion.equalsIgnoreCase("Nota incorrecta"))  {
				System.out.println ("Asignatura: "+boletinNotas.asignatura.toUpperCase()+" Calificación: "+boletinNotas.calificacion);
			}
			boletinNotas = boletinNotas.sig;
		}
	}

}

package Ejercicio006;

/*
 * Escribir una funci�n reciba un diccionario con las asignaturas y las notas de un alumno y 
 * devuelva otro diccionario con las asignaturas en may�sculas y las calificaciones 
 * correspondientes a las notas aprobadas.
 */

public class Principal {
	
	public static void main (String [] args) {	
	
		Diccionario boletinNotas = new Diccionario ("ciencias naturales",10);
		boletinNotas.agregarAsignatura(boletinNotas, "ciencias sociales", 9.6);
		boletinNotas.agregarAsignatura(boletinNotas, "matem�ticas", 8.6);
		boletinNotas.agregarAsignatura(boletinNotas, "pretecnolog�a", 7.6);
		boletinNotas.agregarAsignatura(boletinNotas, "educaci�n f�sica", 6.6);
		boletinNotas.agregarAsignatura(boletinNotas, "lengua espa�ola", 5.6);
		boletinNotas.agregarAsignatura(boletinNotas, "ingl�s", 4.6);
		boletinNotas.agregarAsignatura(boletinNotas, "m�sica", 3.6);
		boletinNotas.agregarAsignatura(boletinNotas, "�tica", 2.6);
		boletinNotas.agregarAsignatura(boletinNotas, "religi�n", 1.6);
		boletinNotas.agregarAsignatura(boletinNotas, "franc�s", 10.6);
		
		boletinNotas.mostrarBoletin(boletinNotas);
	
	}

}

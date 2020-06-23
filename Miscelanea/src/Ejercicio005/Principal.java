package Ejercicio005;
/*
 * Escribir una función reciba un diccionario con las asignaturas y las notas de un alumno y 
 * devuelva otro diccionario con las asignaturas en mayúsculas y las calificaciones 
 * correspondientes a las notas.
 */
public class Principal {

	public static void main (String [] args) {
		
		Diccionario boletinNotas = new Diccionario ("ciencias naturales",10);
		boletinNotas.agregarAsignatura(boletinNotas, "ciencias sociales", 9.6);
		boletinNotas.agregarAsignatura(boletinNotas, "matemáticas", 8.6);
		boletinNotas.agregarAsignatura(boletinNotas, "pretecnología", 7.6);
		boletinNotas.agregarAsignatura(boletinNotas, "educación física", 6.6);
		boletinNotas.agregarAsignatura(boletinNotas, "lengua española", 5.6);
		boletinNotas.agregarAsignatura(boletinNotas, "inglés", 4.6);
		boletinNotas.agregarAsignatura(boletinNotas, "música", 3.6);
		boletinNotas.agregarAsignatura(boletinNotas, "ética", 2.6);
		boletinNotas.agregarAsignatura(boletinNotas, "religión", 1.6);
		boletinNotas.agregarAsignatura(boletinNotas, "francés", 10.6);
		
		boletinNotas.mostrarBoletin(boletinNotas);
	
	}
}

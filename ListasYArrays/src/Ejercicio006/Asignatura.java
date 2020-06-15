package Ejercicio006;

public class Asignatura {
	
	// Constructor
	public Asignatura (String materia, double nota) {
		this.materia = materia;
		this.nota = nota;
	}
	
	// Métodos GETTER
	
	public String mostrarMateria() {
		return this.materia;
	}
	public double mostrarNota() {
		return this.nota;
	}
	
	// Método SETTER
	
	public void registrarNota(double nota) {
		this.nota = nota;
	}
	
	// Propiedades
	private String materia;
	private double nota;

	
}

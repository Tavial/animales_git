package modelo;


import java.io.Serializable;

//implementamos el interfaz de marca Serializable ya que vamos 
//a guardar objetos de clase jugador en un archivo

public class Jugador implements Serializable {

	private String nombre;
	private String demarcacion;
	private int edad;
	private double peso;
	private int altura;
	private String equipo;
	private String nacionalidad;
	private int id;
	private static int proximoId = 1;
	private String fotografia; 
	private boolean alta;
	
	public Jugador () {
		this.id = proximoId;
		proximoId++;
		this.alta = true;
	}

	public Jugador(String nombre, String demarcacion, int edad, double peso, int altura, String equipo,
			String nacionalidad, String fotografia) {
		super();
		this.nombre = nombre;
		this.demarcacion = demarcacion;
		this.edad = edad;
		this.peso = peso;
		this.altura = altura;
		this.equipo = equipo;
		this.nacionalidad = nacionalidad;
		this.fotografia = fotografia;
		this.alta = true;
		this.id = proximoId++; // primero asigna y luego incrementa
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDemarcacion() {
		return demarcacion;
	}

	public void setDemarcacion(String demarcacion) {
		this.demarcacion = demarcacion;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public int getAltura() {
		return altura;
	}

	public void setAltura(int altura) {
		this.altura = altura;
	}

	public String getEquipo() {
		return equipo;
	}

	public void setEquipo(String equipo) {
		this.equipo = equipo;
	}

	public String getNacionalidad() {
		return nacionalidad;
	}

	public void setNacionalidad(String nacionalidad) {
		this.nacionalidad = nacionalidad;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	public String getFotografia() {
		return fotografia;
	}

	public void setFotografia(String fotografia) {
		this.fotografia = fotografia;
	}

	public static int getProximoId() {
		return proximoId;
	}

	
	public boolean isAlta() {
		return alta;
	}

	public void setAlta(boolean alta) {
		this.alta = alta;
	}

	@Override
	public String toString() {
		return "ID: "+id+" - NOMBRE: "+nombre+"\n- EQUIPO: "+equipo+" - DEMARCACION: "+demarcacion+"\n- EDAD: "+edad+" - ALTURA: "+altura+" - PESO: "+peso+"\n- "+nacionalidad+"\n"+"\n\n";
			
	}
	
	
	
	
	
}

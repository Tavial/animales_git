package PiedraPapelTijera;

import java.util.Random;

import javax.swing.JOptionPane;


public abstract class Jugador {
	
	public Jugador () {
		
	}
	abstract String escogePiedraPapelTijera();
}

class Maquina extends Jugador {
	
	public Maquina () {
		super();
	}
	
	public String escogePiedraPapelTijera () {
		Random semilla = new Random();
		int aleatorio;
		String jugada_maquina ="";
		
		aleatorio = semilla.nextInt(3)+1;	
		Jugada piedra = Jugada.PIEDRA ;
		Jugada papel = Jugada.PAPEL ;
		Jugada tijera = Jugada.TIJERA ;
		if (aleatorio ==1) {
			jugada_maquina = piedra.name();
		}
		else {
			if (aleatorio == 2) {
				jugada_maquina = papel.name();
			}
			else {
				if (aleatorio == 3) {
					jugada_maquina = tijera.name();
				}
			}
		}
		return jugada_maquina;
	}

	
}

class Persona extends Jugador{
	
	public Persona () {
		super();
	}
	
	public String escogePiedraPapelTijera () {
		
		String eleccion, jugada_persona=""; 	
		do {
			eleccion = JOptionPane.showInputDialog("Introduce tu elección: PIEDRA, PAPEL, TIJERA: ").toUpperCase();
		} while (!eleccion.equals("PIEDRA") && !eleccion.equals("PAPEL") && !eleccion.equals("TIJERA"));
		
		switch (eleccion) {
			case "PIEDRA":
				Jugada piedra = Jugada.PIEDRA;
				jugada_persona = piedra.name();
				break;
			case "PAPEL":
				Jugada papel = Jugada.PAPEL;
				jugada_persona = papel.name();
				break;
			case "TIJERA":
				Jugada tijera = Jugada.TIJERA ;
				jugada_persona = tijera.name();
				break;
		}
		return jugada_persona;
	}
	
}


		
	


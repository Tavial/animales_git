package daos;

import java.util.ArrayList;

import modelo.Jugador;

public class JugadoresDAOconArrayList implements JugadoresDAO {

	//aqu� ir�n las implementaciones de la interfaz JugadoresDAO
	
	// por ahora se guardar�n los jugadores en una ArrayList
	private ArrayList<Jugador> jugadores = new ArrayList<Jugador>();	
	
	@Override
	public void registrarJugador(Jugador jugador) {
		jugadores.add(jugador);
		
	}

	@Override
	public ArrayList<Jugador> obtenerJugadores() {
		
		return jugadores;
	}

	@Override
	public void borrarJugador(int indice) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Jugador obtenerJugadorPorIndice(int indice) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void actualizarJugadorPorIndice(Jugador jugador_modificado, int indice) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Jugador obtenerJugadorPorId(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void actualizarJugadorPorId(Jugador jugador_modificado, int indice) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void borrarJugadorPorId(int id) {
		// TODO Auto-generated method stub
		
	}


	
	
}

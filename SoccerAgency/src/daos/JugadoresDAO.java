package daos;

import java.util.ArrayList;

import modelo.Jugador;

public interface JugadoresDAO {

	//Decimos las operaciones que vamos a realizar con los jugadores
	
	public void registrarJugador(Jugador jugador);
	public ArrayList<Jugador> obtenerJugadores ();
	public void borrarJugador (int indice);
	public void borrarJugadorPorId (int id);
	public Jugador obtenerJugadorPorIndice (int indice);
	public Jugador obtenerJugadorPorId (int id);
	public void actualizarJugadorPorIndice (Jugador jugador_modificado, int indice);
	public void actualizarJugadorPorId (Jugador jugador_modificado, int indice);
}

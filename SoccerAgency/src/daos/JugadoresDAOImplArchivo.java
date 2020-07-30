package daos;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Arrays;

import javax.swing.text.html.HTMLDocument.Iterator;

import modelo.Jugador;

public class JugadoresDAOImplArchivo implements JugadoresDAO {

	private static final String ARCHIVO = "fichas_jugadores.dat";
	ArrayList<Jugador> jugadores = new ArrayList<Jugador>();
	
	
	public JugadoresDAOImplArchivo () {
		this.cargarArchivo();
	}
	
	/*
	 * Cuando queramos guardar objetos en un archivo, por detrás
	 * java va a realizar una operación qie se denomina SERIALIZACION.
	 * Básicamente serializar es transformar una información en una
	 * cadena de bits.
	 * 
	 * Si queremos serializar un objeto de una clase que hayamos creados nosotros
	 * (por ejemplo la clase Jugador) estamos obligados a indicar en 
	 * dicha clase que se implemente el interfaz Serializable.
	 * 
	 * Si queremos guardar el libro en un archivo, debemos de "serializarlo", 
	 * por tanto tenemos que ir al paquete modelo y en la clase Jugador tenemos
	 * que poner "implements Serializable". Es un interfaz de marca, no tiene métodos
	 * que nos obligue a implementar.
	 * 
	 */
	
	private void cargarArchivo () {
		File fichero = new File (ARCHIVO);
		if (fichero.exists()) {
			//para trabajar a nivel de objetos usamos el object outputStream y el Object inputStream
			// primero creamos un fis para poder leer archivos en binario
			try {
				FileInputStream fis = new FileInputStream(fichero);
				ObjectInputStream ois = new ObjectInputStream (fis);
				//Entendemos que el archivo tiene en forma un único objeto que será el ArrayList de todos los jugadores. Por eso hacemos el cast a ArrayList
				jugadores = (ArrayList<Jugador>)ois.readObject();
				ois.close();
				fis.close();
				System.out.println("Lectura del archivo correcta");
			} catch (IOException e) { //agrupamos las dos excepciones en IOException ya que la de File Exception está contenida dentro de IOException
				System.out.println("No se pudo leer el archivo");
			} catch (ClassNotFoundException e) {
				System.out.println("No se encuentra la clase del objeto");
			} 
			
		} // end if si existe fichero
	} //end cargarArchivo
	
	private void escribirArchivo() {
		File fichero = new File(ARCHIVO); // No compruebo si existe o no. Si existe lo sobreescribo.
		//creamos un fos para poder escribir en el archivo binario
		try {
			FileOutputStream fos = new FileOutputStream (fichero);
			ObjectOutputStream oos = new ObjectOutputStream (fos);
			//al escribir objetos en un archivo, debemos crear una clase que contenga a todos los objetos 
			//(en nuestro caso el Array List) y lo que escribimos es un objeto de esa clase (jugadores)
			oos.writeObject(jugadores);
			oos.close();
			fos.close();
			System.out.println("Escritura del archivo correcta");
		} catch (IOException e) {
			System.out.println("No se pudo escribir en el archivo");
		}
				
	} //end escribirArchivo
	
	
	@Override
	public void registrarJugador(Jugador jugador) {
		jugadores.add(jugador);
		escribirArchivo();
		
	}

	@Override
	public ArrayList<Jugador> obtenerJugadores() {
		cargarArchivo();
		return jugadores;
	}

	@Override
	public void borrarJugador(int indice) {
		Jugador jugador = jugadores.get(indice);
		jugador.setAlta(false);
		//jugadores.remove(indice);
		escribirArchivo();
		
	}

	@Override
	public Jugador obtenerJugadorPorIndice(int indice) {
		
		System.out.println(jugadores.get(indice));
		return jugadores.get(indice);
	}

	@Override
	public void actualizarJugadorPorIndice(Jugador jugador_modificado, int indice) {
		
		jugadores.set(indice, jugador_modificado);
		System.out.println(jugadores.get(indice));
		escribirArchivo();
	}

	@Override
	public Jugador obtenerJugadorPorId(int id) {
		Jugador [] array = new Jugador [jugadores.size()];
		jugadores.toArray(array);
		int valor = 0;
		boolean encontrado = false;
		
		while ( valor <= array.length && !encontrado){	
			if (array[valor].getId() != id) {
				valor++;
			}
			else {
				encontrado = true;
			}	
		}
		return array[valor];
	}

	@Override
	public void actualizarJugadorPorId(Jugador jugador_modificado, int indice) {
		System.out.println("jugador_modificado"+jugador_modificado);
		Jugador [] array = new Jugador [jugadores.size()];
		jugadores.toArray(array);
		int valor = 0;
		boolean encontrado = false;
		while ( valor < array.length && !encontrado){	
			if (array[valor].getId() != indice) {
				valor++;
			}
			else {
				encontrado = true;
			}	
		}
		array[valor] = jugador_modificado;
		array[valor].setId(indice);
		jugadores.clear(); // vaciamos el array list jugadores para rellenarlo posteriormente con el contenido del array
		for (Jugador jugador:array) {
			jugadores.add(jugador);
		}
		
		escribirArchivo();
	}

	@Override
	public void borrarJugadorPorId(int id) {
		Jugador [] array = new Jugador [jugadores.size()];
		jugadores.toArray(array);
		int valor = 0;
		boolean encontrado = false;
		while ( valor < array.length && !encontrado){	
			if (array[valor].getId() != id) {
				valor++;
			}
			else {
				encontrado = true;
			}	
		}
		array[valor].setAlta(false);
		jugadores.clear(); // vaciamos el array list jugadores para rellenarlo posteriormente con el contenido del array
		for (Jugador jugador:array) {
			jugadores.add(jugador);
		}
		
		escribirArchivo();		
	}

	

}

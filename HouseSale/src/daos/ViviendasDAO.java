package daos;

import java.util.List;

import modelo.Vivienda;

// Interface donde vamos a definir las operaciones que se realizarán con la base de datos
public interface ViviendasDAO {
	
	public int registrarVivienda (Vivienda inmueble);
	// si los Strings que pasamos por cabecera no tienen nungún valor (cadena vacía), muestra todas las viviendas.
	// también incluimos en el método las variables que vamos a necesitar para paginación.
	public List<Vivienda>obtenerViviendas(String zona, String precio_min, String precio_max, String superficie_min, String superficie_max, int comienzo, int cuantos);
	public void borrarVivienda (int id_vivienda);
	public Vivienda obtenerViviendaPorId (int id_vivienda);
	public void guardarCambiosVivienda(Vivienda inmueble);
	public int totalViviendas(String zona, String precio_min, String precio_max, String superficie_min, String superficie_max);

}

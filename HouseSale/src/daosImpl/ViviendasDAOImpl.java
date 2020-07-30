package daosImpl;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import constantes.ConstantesSQL;
import daos.ViviendasDAO;
import modelo.Estado;
import modelo.Tipo;
import modelo.Vivienda;

// esta clase implementa las operaciones definidas en el interface ViviendasDAO

public class ViviendasDAOImpl extends MasterDAO implements ViviendasDAO{
	@Override
	public int registrarVivienda(Vivienda inmueble) {
		// preparamos el valor de la sql
		String sql = ConstantesSQL.INSERTAR_VIVIENDA;
		
		// preparamos la instancia de la conexión
		conectar ();  //nos conectamos a la base de datos
		PreparedStatement psRegistrar;
		int idGenerado = -1;
		try {

			psRegistrar = conexion.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS); //Devuelve las IDs generadas 
		
			psRegistrar.setString (1, inmueble.getZona()); 
			psRegistrar.setInt (2, inmueble.getPrecio()); 
			psRegistrar.setInt(3, inmueble.getSuperficie()); 
			psRegistrar.setInt(4, inmueble.getId_tipo()); 
			psRegistrar.setShort(5, inmueble.getHabitaciones());
			psRegistrar.setShort(6, inmueble.getAseos());
			psRegistrar.setInt(7, inmueble.getId_estado());
			psRegistrar.setString(8, inmueble.getCaracteristicas());
			psRegistrar.setString(9, inmueble.getEmail());
			psRegistrar.setString(10, inmueble.getTelefono());
			psRegistrar.setString(11, inmueble.getImagen());
			psRegistrar.executeUpdate();
			ResultSet resultado = psRegistrar.getGeneratedKeys();//para devolver las claves generadas
			if (resultado.next()) {
				idGenerado = resultado.getInt(1);
			}
		} catch (SQLException e) {
			System.out.println("Excepción de consulta SQL");
			e.printStackTrace();
		}
		desconectar();
		return idGenerado;
	}

	@Override

	public List<Vivienda> obtenerViviendas(String zona, String precio_min, String precio_max, String superficie_min, String superficie_max, int comienzo, int cuantos){
		//Metemos todos las viviendas que tenemos en nuestra base de datos en una lista
		List<Vivienda> viviendas = new ArrayList<Vivienda>();
		
		
		conectar ();  //nos conectamos a la base de datos
		try {
			
			//definimos la consulta sql para que nos muestre las viviendas que tenemos en nuestra base de datos.

			String sql = ConstantesSQL.OBTENER_VIVIENDAS;
			PreparedStatement psBuscar = conexion.prepareStatement(sql);
			
			
			if (!precio_min.isEmpty()) {
				int precioMIN = Integer.parseInt(precio_min);
				psBuscar.setInt(1, precioMIN);
				
			} else {
				int precioMIN = 0;	
				psBuscar.setInt(1, precioMIN);
				
			}
			
			if (!precio_max.isEmpty()) {
				int precioMAX = Integer.parseInt(precio_max);
				psBuscar.setInt(2, precioMAX);
				
			} else {
				int precioMAX = 999999999;
				psBuscar.setInt(2, precioMAX);
				
			}
			
			if (!superficie_min.isEmpty()) {
				int superficieMIN = Integer.parseInt(superficie_min);
				psBuscar.setInt(3, superficieMIN);
				
			} else {
				int superficieMIN = 0;
				psBuscar.setInt(3, superficieMIN);
				
			}
			
			if (!superficie_max.isEmpty()) {
				int superficieMAX = Integer.parseInt(superficie_max);
				psBuscar.setInt(4, superficieMAX);
				
			} else {
				int superficieMAX = 999999999;
				psBuscar.setInt(4, superficieMAX);
			
			}
			
			psBuscar.setString(5, "%"+zona+"%");
		
			psBuscar.setInt(6, comienzo);
			psBuscar.setInt(7, cuantos);
			
			
			
			// creamos la variable para almacenar el resultado de nuestra consulta
			// ResultSet contiene todas las filas que satisfacen las condiciones de una sentencia SQL, 
			// en nuestro caso al poner select * from, nos sacará todas las filas 
			ResultSet resultado = psBuscar.executeQuery();
			
			// el ResultSet se almacena en una especie de lista que podemos recorrer con la sentencia resultado.next
			while (resultado.next()) {
			// el resultado lo vamos a ir metiendo en un objeto vivienda y cada uno de estos objetos lo vamos a menter en la lista "libros"
				Vivienda inmueble = new Vivienda ();
				inmueble.setId_vivienda(resultado.getInt("id_vivienda"));
				inmueble.setZona(resultado.getString("zona"));
				inmueble.setPrecio(resultado.getInt("precio"));
				inmueble.setSuperficie(resultado.getInt("superficie"));
				Tipo tipo = new Tipo();
				tipo.setTipo(resultado.getString("tipo"));
				inmueble.setTipo(tipo);
				inmueble.setHabitaciones(resultado.getShort("habitaciones"));
				inmueble.setAseos(resultado.getShort("aseos"));
				Estado estado = new Estado ();
				estado.setEstado(resultado.getString("estado"));
				inmueble.setEstado(estado);
				inmueble.setCaracteristicas(resultado.getString("caracteristicas"));
				inmueble.setEmail(resultado.getString("email"));
				inmueble.setTelefono(resultado.getString("telefono"));
				inmueble.setImagen(resultado.getString("imagen"));
				// añadimos el inmueble obtenido a la lista viviendas
				viviendas.add(inmueble);
				
			} // end while
		} catch (SQLException e) {
			System.out.println("Error al sacar el listado de inmuebles de la base de datos");
		}
		desconectar(); // nos desconectamos de la base de datos
		return viviendas;
	}

	@Override
	public void borrarVivienda(int id_vivienda) {
		conectar();
		String sql= ConstantesSQL.BORRAR_VIVIENDA;
		try {
			PreparedStatement psBorrar = conexion.prepareStatement(sql);
			psBorrar.setInt(1, id_vivienda);
			psBorrar.executeUpdate();
			
		} catch (SQLException e) {
			System.out.println("Error al borrar vivienda");
			e.printStackTrace();
		}
		desconectar ();
		
	}

	@Override
	public Vivienda obtenerViviendaPorId(int id_vivienda) {
		
		Vivienda inmueble = new Vivienda();
		conectar();
		
		String sql = ConstantesSQL.OBTENER_VIVIENDA_POR_ID;
		
		try {
			PreparedStatement psObtener = conexion.prepareStatement(sql);
			psObtener.setInt(1, id_vivienda);
			ResultSet resultado = psObtener.executeQuery();
			
			if (resultado.next()) {
				inmueble.setId_vivienda(resultado.getInt("id_vivienda"));
				inmueble.setZona(resultado.getString("zona"));
				inmueble.setPrecio(resultado.getInt("precio"));
				inmueble.setSuperficie(resultado.getInt("superficie"));
				inmueble.setId_tipo(resultado.getInt("id_tipo"));
				inmueble.setHabitaciones(resultado.getShort("habitaciones"));
				inmueble.setAseos(resultado.getShort("aseos"));
				inmueble.setId_estado(resultado.getInt("id_estado"));
				inmueble.setCaracteristicas(resultado.getString("caracteristicas"));
				inmueble.setEmail(resultado.getString("email"));
				inmueble.setTelefono(resultado.getString("telefono"));
				inmueble.setImagen(resultado.getString("imagen"));
			}
		} catch (SQLException e) {
			System.out.println("Error al obtener vivienda por id");
			e.printStackTrace();
		}
		
		desconectar();
		return inmueble;
	}

	@Override
	public void guardarCambiosVivienda(Vivienda inmueble) {
		conectar();
		String sql = ConstantesSQL.GUARDAR_CAMBIOS_VIVIENDA;
		try {
			PreparedStatement psActualizar = conexion.prepareStatement(sql);
			// rellenamos las interrogaciones de la SQL

			psActualizar.setString (1, inmueble.getZona()); 
			psActualizar.setInt (2, inmueble.getPrecio()); 
			psActualizar.setInt(3, inmueble.getSuperficie()); 
			psActualizar.setInt(4, inmueble.getId_tipo()); 
			psActualizar.setShort(5, inmueble.getHabitaciones());
			psActualizar.setShort(6, inmueble.getAseos());
			psActualizar.setInt(7, inmueble.getId_estado());
			psActualizar.setString(8, inmueble.getCaracteristicas());
			psActualizar.setString(9, inmueble.getEmail());
			psActualizar.setString(10, inmueble.getTelefono());
			psActualizar.setString(11, inmueble.getImagen());
			psActualizar.setInt(12, inmueble.getId_vivienda());
			
			psActualizar.executeUpdate();
			
		} catch (SQLException e) {
			System.out.println("Error en guardar los cambios de la vivienda");
			e.printStackTrace();
		}
		
		desconectar();
		
	}
	// Devuelve el total de viviendas con la zona, el precio min y max y los m2 mínimos
	// y máximos o devuelve -1 si no ha podido hacerlo

	@Override
	public int totalViviendas(String zona, String precio_min, String precio_max, String superficie_min,
			String superficie_max) {
		
		int total = -1;
		
		conectar();
		
		String sql = ConstantesSQL.TOTAL_VIVIENDAS;
		try {
			PreparedStatement psContar = conexion.prepareStatement(sql);
			
			if (!precio_min.isEmpty()) {
				int precioMIN = Integer.parseInt(precio_min);
				psContar.setInt(1, precioMIN);
				
			} else {
				int precioMIN = 0;	
				psContar.setInt(1, precioMIN);
				
			}
			
			if (!precio_max.isEmpty()) {
				int precioMAX = Integer.parseInt(precio_max);
				psContar.setInt(2, precioMAX);
				
			} else {
				int precioMAX = 999999999;
				psContar.setInt(2, precioMAX);
				
			}
			
			if (!superficie_min.isEmpty()) {
				int superficieMIN = Integer.parseInt(superficie_min);
				psContar.setInt(3, superficieMIN);
				
			} else {
				int superficieMIN = 0;
				psContar.setInt(3, superficieMIN);
				
			}
			
			if (!superficie_max.isEmpty()) {
				int superficieMAX = Integer.parseInt(superficie_max);
				psContar.setInt(4, superficieMAX);
				
			} else {
				int superficieMAX = 999999999;
				psContar.setInt(4, superficieMAX);
			
			}
			
			psContar.setString(5, "%"+zona+"%");
			
			ResultSet resultado = psContar.executeQuery();
			if (resultado.next()) {
				total = resultado.getInt (1);
			}	
			
		} catch (SQLException e) {
			System.out.println("error en el método TotalViviendas del DAO");
			e.printStackTrace();
		}
		
		
		
		desconectar ();
	
		return total;
	}


}

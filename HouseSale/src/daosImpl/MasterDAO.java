package daosImpl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public abstract class MasterDAO {
	
	// definimos las constantes para nuestra conexión. Será protected la conexión para que puedan ser usadas
	// por las clases que heredan de ella
		private final static String url = 
				"jdbc:mysql://localhost:3306/bd_housesale";
		private final static String user = "root";
		private final static String pass = "";
		
		/*private final static String url = "jdbc:mysql://localhost:3360/bd_housesale";
		private final static String user = "housesale";
		private final static String pass = "House00"; */
	
		protected Connection conexion = null; // definimos aqui la conexión para poder usarla en el resto de métodos

		public MasterDAO() {
			// En el constructor cargamos el driver de mySQL
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
			} catch (ClassNotFoundException e) {
				System.out.println(" No se pudo cargar el driver de MySQL");
			}
		} // end Master DAO
		
		protected void conectar () {
			
			try {
				conexion = DriverManager.getConnection(url, user, pass);
			} catch (SQLException e) {
				System.out.println ("No se pudo conectar con la base de datos ");
			}
			
		} //end conectar
		
		protected void desconectar () {
			
			try {
				conexion.close();
			} catch (SQLException e) {
				System.out.println ("No se pudo desconectar de la base de datos ");
			}
		} // end desconectar


}

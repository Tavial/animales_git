package daosImpl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import daos.EstadosDAO;
import modelo.Estado;

public class EstadosDAOImpl extends MasterDAO implements EstadosDAO {

	@Override
	public List<Estado> obtenerEstados() {
		List<Estado> estados = new ArrayList <Estado> ();
		String sql = "select * from tabla_estados_vivienda order by id_estado asc; ";
		conectar();
		try {
			Statement st = conexion.createStatement();
			ResultSet resultado = st.executeQuery (sql);
			while (resultado.next()) {
				Estado estado = new Estado ();
				estado.setId_estado(resultado.getInt(1));
				estado.setEstado(resultado.getString(2));
				estados.add(estado);
			}
		} catch (SQLException e) {
			System.out.println("error al obtener la categoría Estado de la vivienda");
			e.printStackTrace();
		}
		return estados;
	}

}

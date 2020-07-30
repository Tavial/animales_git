package daosImpl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import daos.TiposDAO;
import modelo.Tipo;

public class TiposDAOImpl extends MasterDAO implements TiposDAO {

	@Override
	public List<Tipo> obtenerTipos() {
		List<Tipo> tipos = new ArrayList <Tipo> ();
		String sql = "select * from tabla_tipos_vivienda order by id_tipo asc; ";
		conectar();
		try {
			Statement st = conexion.createStatement();
			ResultSet resultado = st.executeQuery (sql);
			while (resultado.next()) {
				Tipo tipo = new Tipo ();
				tipo.setId_tipo(resultado.getInt(1));
				tipo.setTipo(resultado.getString(2));
				tipos.add(tipo);
			}
		} catch (SQLException e) {
			System.out.println("error al obtener la categoría Tipo de la vivienda");
			e.printStackTrace();
		}
		return tipos;
	}

}

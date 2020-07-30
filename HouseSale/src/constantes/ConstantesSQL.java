package constantes;

public class ConstantesSQL {

	public static final String INSERTAR_VIVIENDA = "INSERT INTO tabla_viviendas(zona,precio,superficie,id_tipo,habitaciones,aseos,id_estado,caracteristicas,email,telefono,imagen)" + " values (?,?,?,?,?,?,?,?,?,?,?);";
	// Lo del asterisco no queda bien pero tengo que sacar todos los campos (son 11) y creo que quedaría más lioso.
	public static final String OBTENER_VIVIENDAS = "SELECT tv.*, tt.tipo, te.estado FROM tabla_viviendas as tv, tabla_tipos_vivienda as tt, tabla_estados_vivienda as te WHERE (tv.id_tipo=tt.id_tipo) AND (tv.id_estado=te.id_estado) AND (tv.precio BETWEEN ? AND ?) AND (tv.superficie BETWEEN ? AND ?) AND (tv.zona LIKE ? ) ORDER BY tv.id_vivienda desc limit ?, ?;";
	public static final String BORRAR_VIVIENDA = "DELETE FROM tabla_viviendas WHERE id_vivienda = ? ;";
	public static final String OBTENER_VIVIENDA_POR_ID = "SELECT * FROM tabla_viviendas WHERE id_vivienda = ?; ";
	public static final String GUARDAR_CAMBIOS_VIVIENDA = "UPDATE tabla_viviendas SET zona = ?, precio = ?, superficie = ?, id_tipo = ?, habitaciones = ?, aseos = ?, id_estado = ?, caracteristicas = ?, email = ?, telefono = ?, imagen = ? WHERE id_vivienda = ?; ";
	public static final String TOTAL_VIVIENDAS = "SELECT COUNT(id_vivienda) FROM tabla_viviendas WHERE (precio BETWEEN ? AND ?) AND (superficie BETWEEN ? AND ?) AND (zona LIKE ? ) ORDER BY id_vivienda desc; ";
}

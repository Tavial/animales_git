package modelo;

public class Vivienda {
	
	private int id_vivienda;
	private String zona;
	private int precio;
	private int superficie;
	private short habitaciones;
	private short aseos;
	private String caracteristicas;
	private String email;
	private String telefono;
	private String imagen;
	
	// así asocio en java que una vivienda tiene asociada en nuestro caso dos categorías
	// Foreign Keys
	private Tipo tipo;
	private int id_tipo;
	private Estado estado;
	private int id_estado;
	
	public Vivienda() {
		
	}

	public Vivienda(String zona, int precio, int superficie, int id_tipo, short habitaciones, short aseos,
			int id_estado, String caracteristicas, String email, String telefono, String imagen) {
		
		
		super();
		this.zona = zona;
		this.precio = precio;
		this.superficie = superficie;
		this.id_tipo = id_tipo;
		this.habitaciones = habitaciones;
		this.aseos = aseos;
		this.id_estado = id_estado;
		this.caracteristicas = caracteristicas;
		this.email = email;
		this.telefono = telefono;
		this.imagen = imagen;
	}

	public int getId_vivienda() {
		return id_vivienda;
	}

	public void setId_vivienda(int id_vivienda) {
		this.id_vivienda = id_vivienda;
	}

	
	public String getZona() {
		return zona;
	}

	public void setZona(String zona) {
		this.zona = zona;
	}

	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

	public int getSuperficie() {
		return superficie;
	}

	public void setSuperficie(int superficie) {
		this.superficie = superficie;
	}

	public short getHabitaciones() {
		return habitaciones;
	}

	public void setHabitaciones(short habitaciones) {
		this.habitaciones = habitaciones;
	}

	public short getAseos() {
		return aseos;
	}

	public void setAseos(short aseos) {
		this.aseos = aseos;
	}

	public String getCaracteristicas() {
		return caracteristicas;
	}

	public void setCaracteristicas(String caracteristicas) {
		this.caracteristicas = caracteristicas;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getImagen() {
		return imagen;
	}

	public void setImagen(String imagen) {
		this.imagen = imagen;
	}

	public Tipo getTipo() {
		return tipo;
	}

	public void setTipo(Tipo tipo) {
		this.tipo = tipo;
	}

	public Estado getEstado() {
		return estado;
	}

	public void setEstado(Estado estado) {
		this.estado = estado;
	}

	public int getId_tipo() {
		return id_tipo;
	}

	public void setId_tipo(int id_tipo) {
		this.id_tipo = id_tipo;
	}

	public int getId_estado() {
		return id_estado;
	}

	public void setId_estado(int id_estado) {
		this.id_estado = id_estado;
	}
	
}



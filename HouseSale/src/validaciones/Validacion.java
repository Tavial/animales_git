package validaciones;

public class Validacion {
	
	private static final String PATRON_NUM_ENTERO = "[0-9]+"; 
	private static final String PATRON_NOMBRE = "[a-zA-ZÀ-ÿ\\u00f1\\u00d1]+(\\s*[a-zA-ZÀ-ÿ\\u00f1\\u00d1]*)*[a-zA-ZÀ-ÿ\\u00f1\\u00d1]+";
	private static final String PATRON_EMAIL = "[_a-z0-9-]+(.[_a-z0-9-]+)*@[a-z0-9-]+(.[a-z0-9-]+)*(.[a-z]{2,4})";
	private static final String PATRON_TELEFONO = "^[9|6]{1}([\\d]{2}[-]*){3}[\\d]{2}$";
	
	public boolean validarZona (String texto_a_validar) {
		if (texto_a_validar.isEmpty()) {
			return false;
		}
		else {
			return true;
		}
	}
	
	public boolean validarEntero (String texto_a_validar) {
		boolean resultado = true;
		if (texto_a_validar.matches(Validacion.PATRON_NUM_ENTERO)) {
			try {
				Integer.parseInt(texto_a_validar);
			} catch (NumberFormatException ex) {
				System.out.println("mal formato");
				resultado = false;			
			}

		}else {
			resultado = false;
		}
		System.out.println(resultado);
		return resultado;
	}
	
	public boolean validarNombre (String texto_a_validar) {
		if (texto_a_validar.matches(Validacion.PATRON_NOMBRE)) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public boolean validarEmail (String texto_a_validar) {
		if (texto_a_validar.matches(Validacion.PATRON_EMAIL)) {
			return true;
		}
		else {
			return false;
		}
	}
	public boolean validarTelefono (String texto_a_validar) {
		if (texto_a_validar.matches(Validacion.PATRON_TELEFONO)) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public boolean validarShort (String texto_a_validar) {
		boolean resultado = true;
		if (texto_a_validar.matches(Validacion.PATRON_NUM_ENTERO)) {
			try {
				Short.parseShort(texto_a_validar);
			} catch (NumberFormatException ex) {
				System.out.println("mal formato");
				resultado = false;			
			}

		}else {
			resultado = false;
		}
		return resultado;
	}
	
	
	

}

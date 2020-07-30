package filtros;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

// Aquí vamos a poner la lógica de actuación de ese filtro.
// No se va a especificar la ruta a la que tiene que saltar, solo se
// le especifica que tiene que hacer.

// Tenemos que implementar una interfaz del paquete javax.servlet.Filter llamada Filter
// Esto nos obligará a implementar un método doFilter de la interfaz

// Si el usuario se ha identificado metemos en sesión un adminOK

public class FiltroAdmin implements Filter {

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		// Si en sesión no está metido un adminOK, redirijo a loginAdmin.jsp
		// El request de este Filter no es el mismo que estamos usando en los servlets. 
		// Para tener el mismo request que en los servlets, tengo que hacer un casting.
		HttpServletRequest req = (HttpServletRequest) request;
		//ahora mismo req es el mismo request que en los servlets
		if (req.getSession().getAttribute("adminOK") != null) {
			// si el usuario tiene un adminOK en la sesión, está todo bien por lo que el 
			//filtro no hará nada y permitirá que la petición siga adelante
			chain.doFilter(request, response);
		} else {
			//redirigimos otra vez a la página de identificación de administrador
			HttpServletResponse res = (HttpServletResponse) response;
			// fuerza al usuario a ir a otra web. Es una redirección forzada.
			res.sendRedirect("loginAdmin.jsp");
		}
		//Ahora tenemos que configurar el filtro para indicar ante que ruta se va a ejecutar
		// Tendremos que modificar el archivo de configuración web.xml 
		
	} // end doFilter
	
	

}

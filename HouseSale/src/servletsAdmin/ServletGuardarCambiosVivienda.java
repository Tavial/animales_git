package servletsAdmin;

import java.io.File;
import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

import daos.ViviendasDAO;
import daosImpl.ViviendasDAOImpl;
import modelo.Vivienda;
import validaciones.Validacion;

/**
 * Servlet implementation class ServletGuardarCambiosVivienda
 */
@WebServlet("/admin/ServletGuardarCambiosVivienda")
@MultipartConfig
public class ServletGuardarCambiosVivienda extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
 
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//recogemos los valores de los campos del formulario edición
		String zona = request.getParameter("zona");
		String precio = request.getParameter("precio");
		String superficie = request.getParameter("superficie");
		String id_tipo = request.getParameter("id_tipo");
		String habitaciones = request.getParameter("habitaciones");
		String aseos = request.getParameter("aseos");
		String id_estado = request.getParameter("id_estado");
		String caracteristicas = request.getParameter ("caracteristicas");
		String email = request.getParameter("email");
		String telefono = request.getParameter("telefono");
		String imagen = "";
		String id_vivienda = request.getParameter ("id_vivienda");
		
		// parte de validación
		
		String errorZona = "";
		String errorPrecio = "";
		String errorSuperficie = "";
		String errorHabitaciones = "";
		String errorAseos = "";
		String errorEmail = "";
		String errorTelefono = "";
		
		Validacion validador= new Validacion ();
		
		if (!validador.validarZona(zona)) {
			errorZona = "campo ZONA sin información";
		} else if (!validador.validarEntero(precio)) {
			errorPrecio = "campo PRECIO no válido. Debe ser un valor entero";
		} else if (!validador.validarEntero (superficie)) {
			errorSuperficie = "campo SUPERFICIE no válido. Debe ser un valor entero";
		} else if (!validador.validarShort (habitaciones)) {
			errorHabitaciones = "campo HABITACIONES no válido";		
		} else if (!validador.validarShort(aseos)) {
			errorAseos = "campo BAÑOS no válido";	
		} else if (!validador.validarEmail(email)) {
			errorEmail = "campo EMAIL no válido";
		} else if (!validador.validarTelefono(telefono)) {
			errorTelefono = "campo TELÉFONO no válido";
		}
		

		
		if (!errorZona.isEmpty() || !errorPrecio.isEmpty() || !errorSuperficie.isEmpty() || !errorHabitaciones.isEmpty() || !errorAseos.isEmpty() || !errorEmail.isEmpty() || !errorTelefono.isEmpty()) {
			// no registro el libro y redirijo al formulario indicando error
			request.setAttribute("errorZona", errorZona);
			request.setAttribute("errorPrecio", errorPrecio);
			request.setAttribute("errorSuperficie", errorSuperficie);
			request.setAttribute("errorHabitaciones", errorHabitaciones);
			request.setAttribute("errorAseos", errorZona);
			request.setAttribute("errorEmail", errorPrecio);
			request.setAttribute("errorTelefono", errorSuperficie);
			
			// enviamos desde este servlet a la página registrarVivienda los errores de insertar un campo mal y tiene que volver a intentarlo
			RequestDispatcher despachador = getServletContext().getRequestDispatcher("/admin/editarVivienda.jsp");
			despachador.forward (request, response);
			
		} else {
			int precioEntero = Integer.parseInt(precio);
			int superficieEntero = Integer.parseInt(superficie);	
			short habitacionesShort = Short.parseShort(habitaciones);
			short aseosShort = Short.parseShort(aseos);
			int id_viviendaEntero = Integer.parseInt(id_vivienda);
			int id_tipoEntero = Integer.parseInt(id_tipo);
			int id_estadoEntero = Integer.parseInt(id_estado);
		
			
			// vamos a registrar la imagen subida
			
			String rutaAplicacion = request.getServletContext().getRealPath("");
			//creamos ahi dentro una carpeta para las imágenes
			String rutaImagenes = rutaAplicacion + File.separator+"imagenes";

			Part archivo = request.getPart("imagen");  	
			
			if (archivo.getSize() != 0)	{
				String rutaArchivo = rutaImagenes+File.separator+id_vivienda+".jpg";
				archivo.write(rutaArchivo);
				System.out.println("imagen guardada en : "+rutaArchivo);
			}
			else {
				System.out.println("No se ha actualizado la imagen");
			}
	
			// guardamos estos datos en un objeto de tipo Vivienda que le pasaremos al DAO para que lo actualice en la BD.
			Vivienda inmueble = new Vivienda(zona, precioEntero, superficieEntero, id_tipoEntero, habitacionesShort, aseosShort, id_estadoEntero, caracteristicas, email, telefono, imagen);
			inmueble.setId_vivienda(id_viviendaEntero);
			ViviendasDAO viviendasDAO = new ViviendasDAOImpl();
			viviendasDAO.guardarCambiosVivienda(inmueble);
			// Redirigimos para que liste de nuevo las viviendas para que se reflejen los cambios realizados.
			response.sendRedirect("ServletListarAnuncios");	
		}
	
			
	} //end dopost

} //end class

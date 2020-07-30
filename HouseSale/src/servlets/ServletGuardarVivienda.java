package servlets;

import java.io.File;

import java.io.IOException;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

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
 * Servlet implementation class ServletGuardarVivienda
 */
@WebServlet("/guardarNuevaVivienda")
@MultipartConfig
public class ServletGuardarVivienda extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//Recogemos los datos del formulario de registro de nueva vivienda. 
		// En getParameter indico el name del input cuya información quiera obtener
		
		String zona = request.getParameter("zona");
		String precio = request.getParameter("precio");
		String superficie = request.getParameter("superficie");
		String id_tipo = request.getParameter("id_tipo");
		String habitaciones = request.getParameter("habitaciones");
		String aseos = request.getParameter("aseos");
		String id_estado = request.getParameter("id_estado");
		String email = request.getParameter("email");
		String telefono = request.getParameter("telefono");
		String imagen = "";
		
		
		// obtenemos el nombre del archivo, para posteriormente almacenarlo en el objeto
		
		String caracteristicas =""; // formo la cadena con todas las características marcadas
	
		if (request.getParameter("aire") != null) {
			caracteristicas = caracteristicas+"Aire acondicionado. ";
		}
		if (request.getParameter("armarios") != null) {
			caracteristicas = caracteristicas+"Armarios empotrados. ";
		}
		if (request.getParameter("ascensor") != null) {
			caracteristicas = caracteristicas+"Ascensor. ";
		}
		if (request.getParameter("exterior") != null) {
			caracteristicas = caracteristicas+"Exterior. ";
		}
		if (request.getParameter("garaje") != null) {
			caracteristicas = caracteristicas+"Garaje. ";
		}
		if (request.getParameter("jardin") != null) {
			caracteristicas = caracteristicas+"Jardín. ";
		}
		if (request.getParameter("piscina") != null) {
			caracteristicas = caracteristicas+"Piscina. ";
		}
		if (request.getParameter("terraza") != null) {
			caracteristicas = caracteristicas+"Terraza. ";
		}
		if (request.getParameter("trastero") != null) {
			caracteristicas = caracteristicas+"Trastero. ";
		}
		if (request.getParameter("verde") != null) {
			caracteristicas = caracteristicas+"Zonas verdes. ";
		}
				
		//validacion
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
			request.setAttribute("errorAseos", errorAseos);
			request.setAttribute("errorEmail", errorEmail);
			request.setAttribute("errorTelefono", errorTelefono);

			// enviamos desde este servlet a la página registrarVivienda los errores de insertar un campo mal y tiene que volver a intentarlo
			RequestDispatcher despachador = getServletContext().getRequestDispatcher("/registrarVivienda.jsp");
			despachador.forward (request, response);
			
		} else {
			ViviendasDAO viviendasDAO = new ViviendasDAOImpl();
			int precioEntero = Integer.parseInt(precio);
			int superficieEntero = Integer.parseInt(superficie);
			short habitacionesShort= Short.parseShort(habitaciones);
			short aseosShort = Short.parseShort(aseos);
			int id_tipoEntero = Integer.parseInt(id_tipo);
			int id_estadoEntero = Integer.parseInt(id_estado);
			
			Vivienda inmueble = new Vivienda (zona, precioEntero, superficieEntero, id_tipoEntero, habitacionesShort, aseosShort, id_estadoEntero, caracteristicas, email, telefono, imagen);
			
			int idGenerado = viviendasDAO.registrarVivienda(inmueble);
		
			// vamos a registrar la imagen subida
			
			String rutaAplicacion = request.getServletContext().getRealPath("");
			//creamos ahi dentro una carpeta para las imágenes
			String rutaImagenes = rutaAplicacion + File.separator+"imagenes";

			Part archivo = request.getPart("imagen");  //nombre del input
				
			File f = new File (rutaImagenes);
			if  (!f.exists()) {
					f.mkdirs();
				}
				
			Path origen = Paths.get(rutaImagenes+File.separator+"sin_imagen.jpg");
			System.out.println("origen: "+origen.getFileName().toString());
			Path destino = Paths.get(rutaImagenes+File.separator+idGenerado+".jpg");
			System.out.println("destino: "+destino.getFileName().toString());
			Files.copy (origen,destino,StandardCopyOption.REPLACE_EXISTING);
			System.out.println("SIN imagen guardada en : "+rutaImagenes+File.separator+idGenerado+".jpg");
				
			if (archivo.getSize() != 0)	{
				String rutaArchivo = rutaImagenes+File.separator+idGenerado+".jpg";	
				archivo.write(rutaArchivo);
				System.out.println("imagen guardada en : "+rutaArchivo);
			}
			
				
			//Si todo ha ido bien remitimos a una página jsp que indique el registro se ha realizado correctamente
			RequestDispatcher despachador = getServletContext().getRequestDispatcher("/registroViviendaOK.jsp");
			despachador.forward (request, response);
		}	
		
	}// end doPost

} // end clase

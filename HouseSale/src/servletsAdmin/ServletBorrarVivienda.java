package servletsAdmin;

import java.io.File;
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import daos.ViviendasDAO;
import daosImpl.ViviendasDAOImpl;

/**
 * Servlet implementation class ServletBorrarVivienda
 */
@WebServlet("/admin/ServletBorrarVivienda")
public class ServletBorrarVivienda extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String id_vivienda = request.getParameter("id_vivienda");
		int idAborrar = Integer.parseInt(id_vivienda);
		ViviendasDAO viviendasDAO = new ViviendasDAOImpl();
		viviendasDAO.borrarVivienda(idAborrar);
		/******************************************************************/
		//sacamos el nombre de la carpeta de imágenes
		String rutaAplicacion = request.getServletContext().getRealPath("");
		String rutaImagenes = rutaAplicacion + File.separator+"imagenes"+File.separator+idAborrar+".jpg";

		File fichero = new File(rutaImagenes);
		if (fichero.delete())
		   System.out.println("El fichero del inmueble ha sido borrado satisfactoriamente");
		else
		   System.out.println("El inmueble no tiene fichero de imagen. ");
		/******************************************************************/
		response.sendRedirect("ServletListarAnuncios");
	}

}

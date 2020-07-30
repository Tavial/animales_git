package servlets;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import daos.EstadosDAO;
import daos.TiposDAO;
import daosImpl.EstadosDAOImpl;
import daosImpl.TiposDAOImpl;
import modelo.Estado;
import modelo.Tipo;

/**
 * Servlet implementation class ServletPrepararRegistro
 */
@WebServlet("/ServletPrepararRegistro")
public class ServletPrepararRegistro extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//Obtener las categorías para que sean mostradas en la jsp de registro de libro
		EstadosDAO estadosDAO = new EstadosDAOImpl();
		TiposDAO tiposDAO = new TiposDAOImpl();
		
		List<Estado> estados = estadosDAO.obtenerEstados();
		List<Tipo> tipos = tiposDAO.obtenerTipos();
		request.setAttribute("estados", estados);
		request.setAttribute("tipos", tipos);
		// hacemos la redirección para que no se pierda el request
		
		RequestDispatcher despachador = getServletContext().getRequestDispatcher("/registrarVivienda.jsp");
		despachador.forward(request, response);
	}

}

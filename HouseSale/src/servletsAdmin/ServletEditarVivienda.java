package servletsAdmin;

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
import daos.ViviendasDAO;
import daosImpl.EstadosDAOImpl;
import daosImpl.TiposDAOImpl;
import daosImpl.ViviendasDAOImpl;
import modelo.Estado;
import modelo.Tipo;
import modelo.Vivienda;
/**
 * Servlet implementation class ServletEditarVivienda
 */
@WebServlet("/admin/ServletEditarVivienda")
public class ServletEditarVivienda extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String id_vivienda = request.getParameter("id_vivienda");
		int idEditar = Integer.parseInt(id_vivienda);
		ViviendasDAO viviendasDAO = new ViviendasDAOImpl();
		Vivienda inmueble = viviendasDAO.obtenerViviendaPorId(idEditar);
		request.setAttribute("vivienda", inmueble);
		
		EstadosDAO estadosDAO = new EstadosDAOImpl();
		TiposDAO tiposDAO = new TiposDAOImpl();
		
		List<Estado> estados = estadosDAO.obtenerEstados();
		List<Tipo> tipos = tiposDAO.obtenerTipos();
		request.setAttribute("estados", estados);
		request.setAttribute("tipos", tipos);
		
		RequestDispatcher despachador = getServletContext().getRequestDispatcher("/admin/editarVivienda.jsp");
		despachador.forward(request, response);
	}

}

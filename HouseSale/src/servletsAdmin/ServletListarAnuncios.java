package servletsAdmin;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import daos.ViviendasDAO;
import daosImpl.ViviendasDAOImpl;
import modelo.Vivienda;

/**
 * Servlet implementation class ServletListarAnuncios
 */
@WebServlet("/admin/ServletListarAnuncios")
public class ServletListarAnuncios extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ViviendasDAO viviendasDAO = new ViviendasDAOImpl();
		// quiero todos los anuncios en una lista
		// inicialmente no paginamos
		List<Vivienda> viviendas = viviendasDAO.obtenerViviendas("","", "", "", "",0,500);
		// ahora tengo que meter la lista de anuncios de viviendas en el request para que lo haga llegar al jsp 
		// gestionViviendas (que ahora va a estar en la parte admin)
		// y ahí los podamos listar
		request.setAttribute("viviendas", viviendas);
		RequestDispatcher despachador = getServletContext().getRequestDispatcher("/admin/gestionViviendas.jsp");
		despachador.forward(request,response);
		
		
		
	}

}

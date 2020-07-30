package servlets;

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

//para que el servlet atienda una ruta, se la tenemos que especificar con "/ruta_a_atender"
@WebServlet("/inicio")
public class ServletInicio extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// Los métodos del servlet JAMAS deben responder al usuario directamente
		// cuando el usuario entre en el portal, obtendrá los anuncios
		// y los listará en inicio.jsp
		
		String zonaAbuscar = "";
		String precioMinAbuscar = "";
		String precioMaxAbuscar = "";
		String superficieMinAbuscar = "";
		String superficieMaxAbuscar = "";
		
		if (request.getParameter("zona") != null) {
			zonaAbuscar = request.getParameter ("zona"); 
		}
		if (request.getParameter("precio_min") != null) {
			precioMinAbuscar = request.getParameter ("precio_min"); 
		}
		if (request.getParameter("precio_max") != null) {
			precioMaxAbuscar = request.getParameter ("precio_max"); 
		}
		if (request.getParameter("precio_min") != null) {
			superficieMinAbuscar = request.getParameter ("superficie_min"); 
		}
		if (request.getParameter("precio_max") != null) {
			superficieMaxAbuscar = request.getParameter ("superficie_max"); 
		}
		
		System.out.println("sacar viviendas de : ");
		System.out.println("zona : "+zonaAbuscar);
		System.out.println("Precio entre : "+precioMinAbuscar+" y "+precioMaxAbuscar+" €");
		System.out.println("Tamaño entre : "+superficieMinAbuscar+" y "+superficieMaxAbuscar+" m2");
		
		// PAGINACION
		int comienzo = 0;
		int resultadosPorPagina = 5;
		int siguiente = -1; //valores para los enlaces de anterior y siguiente
		int anterior = -1;
		
		if (request.getParameter("comienzo") != null) {
			comienzo = Integer.parseInt(request.getParameter("comienzo"));
		}
		
		siguiente = comienzo + resultadosPorPagina;
		anterior = comienzo - resultadosPorPagina;
	
		
		//Vamos a pedir a la base de datos los anuncios
		//Para ello vamos a hacer un nuevo paquete con los DAOs que permitirán 
		// trabajar con la información de la base de datos.
		
		// La clase ViviendasDAOImpl nos va a facilitar la operación ya que tiene implementado un método (previamente definido en la interfaz ViviendasDAO)
		// que consulta a la base de datos de viviendas y  nos va a devolver todas las viviendas que están en la base de datos en forma de una lista
		
		// Interfaz nombre del objeto = al constructor de la clase que implementa al interfaz (ViviendasDAOImpl)
		ViviendasDAO viviendasDAO = new ViviendasDAOImpl();
		
		List <Vivienda> viviendas = viviendasDAO.obtenerViviendas(zonaAbuscar,precioMinAbuscar, precioMaxAbuscar, superficieMinAbuscar, superficieMaxAbuscar, comienzo, resultadosPorPagina);
		
		//Para que vaya a la JSP necesitamos enviarlas a través del request
		
		request.setAttribute("viviendas", viviendas);
		
		
		
		// Necesitamos desde este servlet invocar de modo directo a un recurso de la web (inicio.JSP)
		// Tenemos que enviar la petición (request) a dicho recurso
		
		//pasamos también los parámetros de la zona a buscar, precio y superficie mínima y máxima para que mantenga los parámetros de búsqueda una vez realizada
		// se lo pasamos para que puedan figurar en el values del elemento de texto del HTML
		request.setAttribute("zonaAbuscar", zonaAbuscar);
		request.setAttribute("precioMinAbuscar", precioMinAbuscar);
		request.setAttribute("precioMaxAbuscar", precioMaxAbuscar);
		request.setAttribute("superficieMinAbuscar", superficieMinAbuscar);
		request.setAttribute("superficieMaxAbuscar", superficieMaxAbuscar);
		
		request.setAttribute("siguiente",siguiente);
		request.setAttribute("anterior",anterior);
		
		// obtengo el total de viviendas que posteriormente mostraremos en la JSP
		
		int total = viviendasDAO.totalViviendas(zonaAbuscar, precioMinAbuscar, precioMaxAbuscar, superficieMinAbuscar, superficieMaxAbuscar);
		
		request.setAttribute("total", total);
		
		RequestDispatcher despachador = getServletContext().getRequestDispatcher("/inicio.jsp");
		// este método reenvía la petición
		despachador.forward(request, response);
		
		
	}


}

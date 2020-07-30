package servletsAdmin;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/admin/ServletLogoutAdmin")
public class ServletLogoutAdmin extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// este método se ejecuta ante get y post
		// Eliminamos la sesión
		request.getSession().invalidate();
		// enviamos al usuario a la ventana de identificación de usuario.
		// El ..  lo ponemos porque salimos de admin y vamos al nivel anterior que es el de usuario 
		response.sendRedirect("../loginAdmin.jsp");
	}

}

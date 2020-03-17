package servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import service.AllievoServiceImpl;


@WebServlet("/cancellaAllievo")
public class cancellaAllievoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			String username = request.getParameter("username");
		
			AllievoServiceImpl asi = new AllievoServiceImpl();
			asi.cancellaAllievo(username);
			

			request.setAttribute("username", username);
			
			getServletContext().
			getRequestDispatcher("/WEB-INF/jsp/eliminaAllievo.jsp").
			forward(request, response);
			
		} catch (Exception e) {
			e.printStackTrace(); 
			
			getServletContext().
			getRequestDispatcher("/WEB-INF/jsp/errore.jsp").
			forward(request, response);
		}
		
	}

}

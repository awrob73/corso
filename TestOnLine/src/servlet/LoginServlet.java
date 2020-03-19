package servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import entity.Allievo;
import service.AllievoServiceImpl;

//modifiche
@WebServlet("/login")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private AllievoServiceImpl asi;
	
	public LoginServlet() throws Exception {
		super();
		asi = AllievoServiceImpl.getInstance();
		// TODO Auto-generated constructor stub
	}

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			String username = request.getParameter("username");
			String password = request.getParameter("password");


			Allievo a = asi.leggiDatiAllievo(username);
			
			if (a.getPassword().equals(password) ) {
				a.setStato("on");
				asi.modificaStato(a, "on");
				request.setAttribute("allievo", a);
				
				getServletContext().
				getRequestDispatcher("/WEB-INF/jsp/paginaAllievo.jsp").
				forward(request, response);
				
			}
			else {
				
				getServletContext().
				getRequestDispatcher("/Homepage.html").
				forward(request, response);
				
			}
			
			
		} catch (Exception e) {
			e.printStackTrace();

			getServletContext().getRequestDispatcher("/WEB-INF/jsp/errore.jsp").forward(request, response);
		
		}
	
	}
	

}

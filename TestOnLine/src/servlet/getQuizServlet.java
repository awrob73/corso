package servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import entity.Allievo;

import service.AllievoServiceImpl;


/**
 * Servlet implementation class getQuizServlet
 */
@WebServlet("/getQuiz")
public class getQuizServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private AllievoServiceImpl asi ;
	
	
	public getQuizServlet() throws Exception {
		super();
		this.asi = AllievoServiceImpl.getInstance();
		// TODO Auto-generated constructor stub
	}


	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		try {
			String username = request.getParameter("username");


			Allievo a = asi.leggiDatiAllievo(username);

			

			request.setAttribute("allievo", a);

			getServletContext().getRequestDispatcher("/WEB-INF/jsp/PaginaQuiz.jsp").forward(request, response);

		} catch (Exception e) {
			e.printStackTrace();

			getServletContext().getRequestDispatcher("/WEB-INF/jsp/errore.jsp").forward(request, response);

		}
	}

}

package servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import entity.Quiz;
import service.QuizServiceImpl;

/**
 * Servlet implementation class QuizArgomentoServlet
 */
@WebServlet("/quizargomento")
public class QuizArgomentoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private QuizServiceImpl qsi ;
	
	
	public QuizArgomentoServlet() throws Exception {
		super();
		this.qsi = QuizServiceImpl.getInstance();
	}

	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		try {
			
			String argomento = request.getParameter("argomento");
			
			List<Quiz> lista = qsi.selectQuizArgomento(argomento);
			request.setAttribute("descrizione", lista);
			getServletContext().getRequestDispatcher("/WEB-INF/jsp/listquizargomenti.jsp").forward(request, response);
						
			
		} catch (Exception e) {
			e.printStackTrace();

			getServletContext().getRequestDispatcher("/WEB-INF/jsp/errore.jsp").forward(request, response);
		
		}
		
	}

}

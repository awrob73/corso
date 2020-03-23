package servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import entity.Allievo;
import entity.Quiz;
import service.AllievoServiceImpl;
import service.QuizServiceImpl;

/**
 * Servlet implementation class cercaQuizIdServelt
 */
@WebServlet("/getQuizId")
public class cercaQuizIdServelt extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private QuizServiceImpl qsi ;
	private AllievoServiceImpl asi ;
	
	
	
	
	public cercaQuizIdServelt() throws Exception{
		super();
		this.qsi = QuizServiceImpl.getInstance();
		this.asi = AllievoServiceImpl.getInstance();
		// TODO Auto-generated constructor stub
	}



	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		try {
			String username = request.getParameter("username");
			String Id = request.getParameter("Id");
			int QuizId = Integer.parseInt(Id);

			Allievo a = asi.leggiDatiAllievo(username);
			request.setAttribute("allievo", a);

			Quiz q = qsi.selectQuiz(QuizId);

			if (q == null) {
				getServletContext().getRequestDispatcher("/WEB-INF/jsp/PaginaQuiz.jsp").forward(request, response);
			} else {

				request.setAttribute("quiz", q);

				getServletContext().getRequestDispatcher("/WEB-INF/jsp/%%%%.jsp").forward(request, response);
			}

		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}

package servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import entity.Allievo;
import service.AllievoServiceImpl;

@WebServlet("/logout")
public class LogoutServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

private AllievoServiceImpl asi ;
	

	public LogoutServlet() throws Exception {
	super();
	this.asi = AllievoServiceImpl.getInstance();
}

	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			
			String username = request.getParameter("username");
		
			Allievo a = asi.leggiDatiAllievo(username);
			
			a.setStato("off");
			asi.modificaStato(a, "off");
			request.setAttribute("allievo", a);
		 
			
			getServletContext().
			getRequestDispatcher("/Homepage.html").
			forward(request, response);
			
		
	} catch (Exception e) {
		e.printStackTrace();

		getServletContext().getRequestDispatcher("/WEB-INF/jsp/errore.jsp").forward(request, response);
	
	}
		
		
	}

}

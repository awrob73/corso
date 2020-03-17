package servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import entity.Allievo;
import service.AllievoServiceImpl;




@WebServlet("/regAllievo")
public class RegistraAllievoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		try {
			
	      	//1. recuperare i dati dell'allievo:
		
			String username = request.getParameter("username"); 
			String nome = request.getParameter("nome");
			String cognome = request.getParameter("cognome");
			String email = request.getParameter("email");
			String password = request.getParameter("password");
			String stato = request.getParameter("stato");
			
			//2. registrare l'allievo:
			
			Allievo a = new Allievo();
			a.setUsername(username);
			a.setNome(nome);
			a.setCognome(cognome);
			a.setEmail(email);
			a.setPassword(password);
			a.setStato(stato);
			
			AllievoServiceImpl service = new AllievoServiceImpl();
			service.registraAllievo(a);
			
			request.setAttribute("user", a);
			request.setAttribute("username", a.getUsername());
			
			getServletContext().
			getRequestDispatcher("/WEB-INF/jsp/regAllievo.jsp").
			forward(request, response);
			
			
	  } catch (Exception e) {
		
		e.printStackTrace();
		
		getServletContext().
		getRequestDispatcher("/WEB-INF/jsp/errore.jsp").
		forward(request, response);
	}
  }
}


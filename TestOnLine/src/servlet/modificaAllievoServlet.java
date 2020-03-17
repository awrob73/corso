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
 * Servlet implementation class modificaAllievoServlet
 */
@WebServlet("/modificaAllievo")
public class modificaAllievoServlet extends HttpServlet {

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			String username = request.getParameter("username");
			String newNome = request.getParameter("nome");
			String newCognome = request.getParameter("cognome");
			String newPass = request.getParameter("password");
			String newEmail = request.getParameter("email");
			
			AllievoServiceImpl asi= new AllievoServiceImpl();
			Allievo a = asi.leggiDatiAllievo(username);
			
			if(newNome!= null && newNome != a.getNome()) {
				asi.modificaNome(a,newNome);
			}
			
			if(newCognome!= null && newCognome != a.getNome()) {
				asi.modificaCognome(a,newCognome);
			}
			
			if(newPass != null && newPass!= a.getPassword()) {
				asi.modificaPassword(a,newPass);
			}
			
			if(newEmail != null && newEmail!= a.getEmail()) {
				asi.modificaEmail(a,newEmail);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}


package servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import entity.Argomento;
import service.ArgomentoServiceImpl;


@WebServlet("/argomenti")
public class ArgomentiServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private ArgomentoServiceImpl arsi ;
	
	
	public ArgomentiServlet() throws Exception {
		super();
		this.arsi = ArgomentoServiceImpl.getInstance();
		// TODO Auto-generated constructor stub
	}

	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
try {
			
		// ArgomentoServiceImpl arg = new ArgomentoServiceImpl(); 
		List<Argomento> lista = arsi.getTuttiArgomenti(); 
		request.setAttribute("argomento", lista);
		getServletContext().getRequestDispatcher("/WEB-INF/jsp/listArgomenti.jsp").forward(request, response);
					
		
	} catch (Exception e) {
		e.printStackTrace();

		getServletContext().getRequestDispatcher("/WEB-INF/jsp/errore.jsp").forward(request, response);
	
	}
		
	}

}

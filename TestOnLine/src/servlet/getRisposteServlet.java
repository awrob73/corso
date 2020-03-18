package servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



@WebServlet("/getRisposte")
public class getRisposteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	try {
		
		String conversione = request.getParameter("id");
		int id = Integer.parseInt(conversione);
		
		DomandaServiceImpl dsi = new DomandaServiceImpl();
		Domanda d = dsi.leggiDomanda(id);
		
		RispostaServiceImpl rsi = new RispostaServiceImpl();
		
		List<Risposta> lista = rsi.leggiRisposteDaDomanda(d);
		
		request.setAttribute("risposte", lista);
		request.setAttribute("domanda", id);
			
		getServletContext().
		getRequestDispatcher("/WEB-INF/jsp/getRisposte.jsp").
		forward(request, response);
	
	} catch (Exception e) {
	
		e.printStackTrace();
		
		getServletContext().
		getRequestDispatcher("/WEB-INF/jsp/errore.jsp").
		forward(request, response);

		

		
	}

}
}

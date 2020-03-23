package servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import entity.Domanda;
import entity.Risposta;
import service.AllievoServiceImpl;
import service.DomandaServiceImpl;
import service.RispostaServiceImpl;

@WebServlet("/getRisposte")
public class getRisposteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private DomandaServiceImpl dsi;
	private RispostaServiceImpl rsi;

	public getRisposteServlet() throws Exception{
		super();
		this.dsi= DomandaServiceImpl.getInstance();
		this.rsi = RispostaServiceImpl.getInstance();	
	}

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		try {

			String conversione = request.getParameter("id");
			int id = Integer.parseInt(conversione);

			Domanda d = dsi.leggiDomanda(id);

			List<Risposta> lista = rsi.stampaRiposteDomanda(d);

			request.setAttribute("risposte", lista);
			request.setAttribute("domanda", id);

			getServletContext().getRequestDispatcher("/WEB-INF/jsp/getRisposte.jsp").forward(request, response);

		} catch (Exception e) {

			e.printStackTrace();

			getServletContext().getRequestDispatcher("/WEB-INF/jsp/errore.jsp").forward(request, response);

		}

	}
}

package servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import entity.Domanda;
import entity.Quiz;
import entity.Risposta;
import service.DomandaServiceImpl;
import service.QuizServiceImpl;
import service.RispostaServiceImpl;

@WebServlet("/getDomande")
public class getDomandeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private DomandaServiceImpl dsi;
	private QuizServiceImpl qsi;
	private RispostaServiceImpl rsi;

	public getDomandeServlet() throws Exception {
		super();
		this.dsi = DomandaServiceImpl.getInstance();
		this.qsi = QuizServiceImpl.getInstance();
		this.rsi = RispostaServiceImpl.getInstance();
	}

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		try {

			String conversione = request.getParameter("id_quiz");
			int id = Integer.parseInt(conversione);

			Quiz q = qsi.selectQuiz(id);
			List<Domanda> lista = dsi.stampaDomandeQuiz(q);
			List<Risposta> listaAppo= new ArrayList<Risposta>();
			List<Risposta> listaRisp = new ArrayList<Risposta>();
			for(Domanda d:lista) {
				listaAppo = rsi.stampaRiposteDomanda(d);
				for(Risposta r:listaAppo) {
					listaRisp.add(r);
				}
			}
			

			request.setAttribute("domande", lista);
			request.setAttribute("quiz", id);
			request.setAttribute("risposte", listaRisp);

			getServletContext().getRequestDispatcher("/WEB-INF/jsp/svolgiQuiz.jsp").forward(request, response);

		} catch (Exception e) {

			e.printStackTrace();

			getServletContext().getRequestDispatcher("/WEB-INF/jsp/errore.jsp").forward(request, response);

		}

	}

}

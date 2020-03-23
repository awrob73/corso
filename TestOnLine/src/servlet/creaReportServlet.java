CREA REPORT SEVLET

package servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import entity.Report;
import service.ReportServiceImpl;

@WebServlet("/creaReport")
public class creaReportServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
private ReportServiceImpl rsi ;
	

	public creaReportServlet() throws Exception {
	super();
	this.rsi = ReportServiceImpl.getInstance();
}


	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			
	      	//1. recupera i dati del report:
		
			String id = request.getParameter("id"); 
			int idReport = Integer.parseInt(id);
			
			String id_quiz = request.getParameter("id_quiz");
			int idQuiz = Integer.parseInt(id_quiz);
			
			String id_domanda = request.getParameter("id_domanda");
			int idDomanda = Integer.parseInt(id_domanda);
			
			String id_risposta = request.getParameter("id_risposta");
			int idRisposta = Integer.parseInt(id_risposta);
			
			String id_allievo_quiz = request.getParameter("id_allievo_quiz");
			int idAllievoQuiz = Integer.parseInt(id_allievo_quiz);

			
			//2. registra il report:
			
			Report r = new Report();
			
			r.setId(idReport);
			r.getQuiz().setId(idQuiz);
			r.getDomanda().setId(idDomanda);
			r.getRisposta().setId(idRisposta);
			r.getAq().setId(idAllievoQuiz);

			rsi.createReport(r);
			
			request.setAttribute("report", r);
			
			getServletContext().
			getRequestDispatcher("/WEB-INF/jsp/creaReport.jsp").
			forward(request, response);
			
			
	  } catch (Exception e) {
		
		e.printStackTrace();
		
		getServletContext().
		getRequestDispatcher("/WEB-INF/jsp/errore.jsp").
		forward(request, response);
	}
  }

}

